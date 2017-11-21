/**
 *
 */

const dbus = require('dbus-native');
const fs = require('fs');
const { Observable } = require('rxjs');
const path = require('path');

const broadcastEvents = require('./aseba-broadcaster.js');
const lodash = require('lodash');


const TMP_SCRIPT_NAME = path.resolve('broadcaster.aesl');
class ThymioDBus {
    static bindMethod(obj, method, ...args) {
        return Observable.bindNodeCallback(obj[method].bind(obj))(...args);
    }

    constructor(name) {
        this.name = name;

        const bus = dbus.sessionBus();

        const getInterfaceObs = Observable.bindNodeCallback(
            bus.getInterface.bind(bus));

        this.network = getInterfaceObs(
                'ch.epfl.mobots.Aseba',
                '/',
                'ch.epfl.mobots.AsebaNetwork')
            .share();
        this.eventFilter = this.network
            .concatMap(network =>
                ThymioDBus.bindMethod(network, 'CreateEventFilter'))
            .concatMap(eventPath => getInterfaceObs(
                    'ch.epfl.mobots.Aseba',
                    eventPath,
                    'ch.epfl.mobots.EventFilter')
            );
    }

    dispatchEvent(eventId, eventName, eventData) {
        throw new Error('Method dispatchEvent() not implemented');
    }

    get(variable) {
        return this.networkCall('GetVariable', variable)
                   .map(value => Array.isArray(value)
                       ? value.map(parseInt)
                       : parseInt(value))
    }

    listenTo(events) {
        return this.eventFilter
               .concatMap(eventFilter =>
                   Observable.from(events)
                         .concatMap(eventName =>
                             ThymioDBus.bindMethod(eventFilter,
                                    'ListenEventName', eventName))
                         .concat(this.startListening(eventFilter))
               );
    }

    loadScript(script, deleteScript) {
        deleteScript = deleteScript ? true : deleteScript;

        const res = Observable.bindNodeCallback(fs.writeFile)(
                TMP_SCRIPT_NAME, script, 'utf-8')
            .concatMapTo(this.network)
            .concatMap(network =>
                ThymioDBus.bindMethod(network, 'LoadScripts', TMP_SCRIPT_NAME));

        if (deleteScript) {
            return res.concatMapTo(Observable.bindNodeCallback(fs.unlink)(
                TMP_SCRIPT_NAME));
        }
        return res;
    }

    networkCall(method, ...args) {
        return this.network.concatMap(network =>
            ThymioDBus.bindMethod(network, method, this.name, ...args));
    }

    set(variable, value) {
        return this.networkCall('SetVariable', variable, value)
    }

    startListening(eventFilter) {
        return Observable.fromEvent(eventFilter, 'Event',
                    (eventId, eventName, eventData) => [eventName, eventData])
             .do(([eventName, eventData]) =>
                 this.dispatchEvent(eventName, eventData));
    }
}


class Thymio extends ThymioDBus {
    static makeAction(method, ...args) {
        return {
            method,
            args
        };
    }

    actionsToObs(actions) {
        return Observable.from(actions)
            .concatMap(this.executeAction.bind(this));
    }

    constructor(main, listeners) {
        super('thymio-II');
        this.main = this.actionsToObs(main);
        this.listeners = lodash.mapValues(listeners,
            this.actionsToObs.bind(this));
    }

    dispatchEvent(eventName, eventData) {
        this.listeners[eventName].subscribe();
    }

    executeAction(action) {
        return this[action.method].apply(this, action.args);
    }

    move(speed) {
        const arg = [speed];
        return this.set('motor.left.target', arg)
            .concat(this.set('motor.right.target', arg))
    }

    moveBackward() {
        return this.move(-200);
    }

    moveForward() {
        return this.move(200);
    }

    run() {
        if (!this.listeners) {
            this.main.subscribe();
        }
        else {
            const eventNames = Object.keys(this.listeners);
            const asebaScript = broadcastEvents(this.name, eventNames);

            this.loadScript(asebaScript, false)
                .concat(this.main)
                .concat(this.listenTo(eventNames))
                .subscribe();
        }
    }

    stop() {
        return this.move(0);
    }
}

module.exports = Thymio;
