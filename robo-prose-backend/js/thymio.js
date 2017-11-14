/**
 *
 */

const dbus = require('dbus-native');
const q = require('q');

class ThymioDBusObject {
    constructor(name) {
        this.name = name;

        this.bus = dbus.sessionBus();
        this.network = q.ninvoke(this.bus, 'getInterface',
                'ch.epfl.mobots.Aseba',
                '/',
                'ch.epfl.mobots.AsebaNetwork');
    }

    networkCall(method, ...args) {
        return this.network.then(network =>
            q.ninvoke(network, method, this.name, ...args))
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
            method: method,
            args: args
        };
    }

    constructor(main, listeners) {
        super('thymio-II');
        this.main = main;
        if (listeners) {
            listeners.forEach(this.addListener.bind(this));
        }
    }

    move(speed) {
        const arg = [speed];
        return q.all([
            this.set('motor.left.target', arg),
            this.set('motor.right.target', arg)
        ]);
    }

    moveBackward() {
        return this.move(200);
    }

    moveForward() {
        return this.move(-200);
    }

    run() {
        this.main.forEach(this.runAction.bind(this));
    }

    runAction(action) {
        this[action.method].apply(this, action.args)
            .done();
    }

    stop() {
        return this.move(0);
    }
}

module.exports = Thymio;
