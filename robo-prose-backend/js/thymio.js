/**
 *
 */

const dbus = require('dbus-native');
const fs = require('fs');
const path = require('path');
const q = require('q');

const broadcastEvents = require('./aseba-broadcaster.js');


const TMP_SCRIPT_NAME = path.resolve('broadcaster.aesl');
class ThymioDBusObject {

    constructor(name) {
        this.name = name;

        const bus = dbus.sessionBus();

        this.network = q.ninvoke(bus, 'getInterface',
                'ch.epfl.mobots.Aseba',
                '/',
                'ch.epfl.mobots.AsebaNetwork');
        this.eventFilter = this.network
            .then(network => q.ninvoke(network, 'CreateEventFilter'))
            .then(eventPath => q.ninvoke(bus, 'getInterface',
                    'ch.epfl.mobots.Aseba',
                    eventPath,
                    'ch.epfl.mobots.EventFilter'));
    }


    dispatchEvent(eventId, eventName, eventData) {
        throw new Error('Method dispatchEvent() not implemented');
    }

    networkCall(method, ...args) {
        return this.network.then(network =>
            q.ninvoke(network, method, this.name, ...args))
    }

    listenTo(eventName) {
        return this.eventFilter.then(eventFilter => {
            q.ninvoke(eventFilter, 'ListenEventName', eventName)
        });
    }

    startListening() {
        return this.eventFilter.then(eventFilter => {
            return q.ninvoke(eventFilter, 'on', 'Event')
                    .then(([eventName, args]) => {
                        console.log(arguments);
                        this.dispatchEvent(eventName, args) });
        });
    }

    loadScript(script) {
        return q.nfcall(fs.writeFile,
                TMP_SCRIPT_NAME, script, 'utf-8')
            .then(() => q.ninvoke(this.network, 'LoadScripts',
                    TMP_SCRIPT_NAME))
//            .then(() => q.nfcall(fs.unlink,
//                    TMP_SCRIPT_NAME));
    }

    get(variable) {
        return this.networkCall('GetVariable', variable)
            .then(value => Array.isArray(value)
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
                .done();
    }

    move(speed) {
        const arg = [speed];
        return q.all([
            this.set('motor.left.target', arg),
            this.set('motor.right.target', arg)
        ]);
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
            this.startListening().done();
            this.loadScript(asebaScript)
                .then(executeMain)
                .done();
        }
    }

    stop() {
        return this.move(0);
    }
}

module.exports = Thymio;
