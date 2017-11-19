/**
 *
 */

const dbus = require('dbus-native');
const fs = require('fs');
const { Observable } = require('rxjs');
const path = require('path');

const broadcastEvents = require('./aseba-broadcaster.js');


const TMP_SCRIPT_NAME = path.resolve('broadcaster.aesl');
class ThymioDBusObject {

    constructor(name) {
        this.name = name;

        const bus = dbus.sessionBus();

        const getInterfaceObs = Observable.bindNodeCallback(
            bus.getInterface.bind(bus));

        this.network = getInterfaceObs(
                'ch.epfl.mobots.Aseba',
                '/',
                'ch.epfl.mobots.AsebaNetwork');
        this.eventFilter = this.network
            .mergeMap(network => Observable.bindCallback(network.CreateEventFilter.bind(network)))
            .mergeMap(eventPath => getInterfaceObs(
                    'ch.epfl.mobots.Aseba',
                    eventPath,
                    'ch.epfl.mobots.EventFilter'));
    }


    dispatchEvent(eventId, eventName, eventData) {
        throw new Error('Method dispatchEvent() not implemented');
    }

    networkCall(method, ...args) {
        return this.network.mergeMap(network =>
            Observable.bindCallback(network[method].bind(network))(this.name, ...args))
    }

    listenTo(eventName) {
        return this.eventFilter.mergeMap(eventFilter =>
            Observable.bindCallback(eventFilter.ListenEventName.bind(eventFilter))(eventName)
        );
    }

    startListening() {
        return this.eventFilter.mergeMap(eventFilter =>
            Observable.fromEvent(eventFilter, 'Event')
                    .do(([eventName, args]) => {
                        console.log(arguments);
                        this.dispatchEvent(eventName, args) })
        );
    }

    loadScript(script) {
        return Observable.bindNodeCallback(fs.writeFile)(
                TMP_SCRIPT_NAME, script, 'utf-8')
            .mergeMap(() => Observable.bindCallback(this.network.LoadScripts.bind(this.network))(
                    TMP_SCRIPT_NAME))
//            .then(() => q.nfcall(fs.unlink,
//                    TMP_SCRIPT_NAME));
    }

    get(variable) {
        return this.networkCall('GetVariable', variable)
            .map(value => Array.isArray(value)
                ? value.map(parseInt)
                : parseInt(value));
    }

    set(variable, value) {
        return this.networkCall('SetVariable', variable, value);
    }
}


class Thymio extends ThymioDBusObject {
    static makeAction(method, ...args) {
        return {
            method,
            args
        };
    }

    constructor(main, listeners) {
        super('thymio-II');
        this.main = main;
        this.listeners = listeners;
    }

    dispatchEvent(eventName, eventData) {
        //console.log(eventName);
        this.execute(this.listeners[eventName]);
    }

    execute(actions) {
        actions.forEach(this.executeAction.bind(this))
    }

    executeAction(action) {
        this[action.method].apply(this, action.args)
                .subscribe();
    }

    move(speed) {
        const arg = [speed];
        this.set('motor.left.target', arg)
            .concat(this.set('motor.right.target', arg));
    }

    moveBackward() {
        return this.move(-200);
    }

    moveForward() {
        return this.move(200);
    }

    run() {
        const executeMain = this.execute.bind(this, this.main);

        if (!this.listeners) {
            executeMain();
        }
        else {
            const eventNames = Object.keys(this.listeners);
            const asebaScript = broadcastEvents(this.name, eventNames);

//            this.listenTo('tapped').done();
//                .then(this.listenTo.bind(this, 'obstacle'))
            this.startListening()
                .mergeMap(this.loadScript.bind(this, asebaScript))
                .then(executeMain)
                .subscribe();
        }
    }

    stop() {
        return this.move(0);
    }
}

module.exports = Thymio;
