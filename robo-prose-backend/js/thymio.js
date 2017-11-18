/**
 *
 */

const dbus = require('dbus-native');
const fs = require('fs');
const lodash = require('lodash');
const path = require('path');
const q = require('q');


class ThymioDBusObject {
    constructor(name) {
        this.name = name;

        const bus = dbus.sessionBus();

        this.network = q.ninvoke(bus, 'getInterface',
                'ch.epfl.mobots.Aseba',
                '/',
                'ch.epfl.mobots.AsebaNetwork');
        this.events = this.network
            .then(network => q.ninvoke(network, 'CreateEventFilter'))
            .then(eventPath => q.ninvoke(bus, 'getInterface',
                    'ch.epfl.mobots.Aseba',
                    eventPath,
                    'ch.epfl.mobots.EventFilter'))
            .then(eventFilter => {
                return q.ninvoke(eventFilter, 'on', 'Event')
                    .then(([eventName, args]) => this.dispatchEvent(eventName, args));
            })

    }

    dispatchEvent(eventId, eventName, eventData) {
        throw new Error('Method dispatchEvent() not implemented');
    }

    networkCall(method, ...args) {
        return this.network.then(network =>
            q.ninvoke(network, method, this.name, ...args))
    }

    makeAsebaScript(events) {
        return `
<!DOCTYPE aesl-source>
<network>


<!--list of global events-->
<event size="0" name="tapped"/>

<!--list of constants-->


<!--show keywords state-->
<keywords flag="true"/>


<!--node thymio-II-->
<node name="${ this.name }">
${ events }
</node>


</network>
        `;
    }

    loadScript(script) {
        return q.nfcall(fs.writeFile, 'aseba.aseba', script, 'utf-8')
            .then(() => q.ninvoke(this.network, 'LoadScripts', path.resolve('aseba.aseba')));
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
        if (listeners) {
            lodash.forEach(listeners, this.addEventListener.bind(this));
            this.events.done();
        }
    }

    addEvent(eventName) {
        var asebaBroadcast;
        switch (eventName) {
            case 'obstacle':
                break;
            //                    + 'emit tapped\n'


            case 'tapped':
                asebaBroadcast = `
onevent buttons
if button.right == 1 or button.left == 1 or button.forward == 1 or button.backward == 1 or button.center == 1 then
    emit tapped
end`;
                break;
        }
        this.asebaScript.push(asebaBroadcast);
    }

    addEventListener(listener, eventName) {
        if (!this.listeners) {
            this.listeners = {};
        }
        if (!this.asebaScript) {
            this.asebaScript = [];
        }
        this.addEvent(eventName);
        this.listeners[eventName] = listener;
    }

    dispatchEvent(eventName, eventData) {
        this.run(this.listeners[eventName]);
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

    run(actions) {
        actions = actions || this.main;
        this.loadScript(this.makeAsebaScript(this.asebaScript.join('\n\n')))
            .then(() => actions.forEach(this.runAction.bind(this)));
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
