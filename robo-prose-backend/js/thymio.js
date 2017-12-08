/**
 *
 */

const dbus = require('dbus-native');
const fs = require('fs');
const lodash = require('lodash');
const { Observable } = require('rxjs');
const path = require('path');

const broadcastEvents = require('./aseba-broadcaster.js');

const THROTTLE_TIME = 100;
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

    filterEvents(events) {
        return this.eventFilter
               .mergeMap(eventFilter =>
                   Observable.from(events)
                         .mergeMap(eventName =>
                             ThymioDBus.bindMethod(eventFilter,
                                    'ListenEventName', eventName))
                         .concat(Observable.of(eventFilter))
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
        return this.networkCall('SetVariable', variable, value);
    }

    setLeftWheel(value) {
        value = Array.isArray(value) ? value : [value];
        return this.set('motor.left.target', value);
    }

    setRightWheel(value) {
        value = Array.isArray(value) ? value : [value];
        return this.set('motor.right.target', value);
    }

    setWheels(valueLeft, valueRight) {
        valueRight = valueRight || valueLeft;

        return this.setLeftWheel(valueLeft)
            .concat(this.setRightWheel(valueRight));
    }

    startListening(eventFilter) {
        return Observable.fromEvent(eventFilter, 'Event',
                    (eventId, eventName, eventData) => [eventName, eventData])
             .auditTime(THROTTLE_TIME)
             .map(([eventName, eventData]) =>
                 this.dispatchEvent(eventName, eventData));
    }
}

const BASE_SPEED = 500;
const TURN_RADIUS = 4.5; // half wheel distance
class Thymio extends ThymioDBus {
    static makeAction(values, isRandom, method) {
        return {
            isRandom,
            values,
            method
        };
    }

    static randomize(values) {
        return lodash.mapValues(values, ({value, props: {type, literals}}) => {
            if (value) {
                return value;
            }

            if (literals) {
                const index = Math.floor(Math.random() * literals.length);
                return literals[index];
            }

            switch (type) {
                case 'boolean':
                    return Math.random() > 0.5;

                case 'float':
                    return Math.random() * 100;
            }
        });
    }

    static runFor(observable, time) {
        return observable.concat(Observable.timer(time));
    }

    static setDegrees(turnObs, degrees) {
        if (!degrees) {
            return turnObs;
        }

        const radians = Math.PI * degrees / 180;
        const cmsSpeed = BASE_SPEED * 20 / 500 * 0.72;
        const timeStop = TURN_RADIUS * radians / cmsSpeed;

        return Thymio.runFor(turnObs, timeStop * 1000);
    }

    constructor(main, listeners) {
        super('thymio-II');
        this.main = this.actionsToObs(main);
        this.listeners = lodash.mapValues(listeners,
            this.actionsToObs.bind(this));
    }

    actionsToObs({actions, ending}) {
        const actionsObs = Observable.from(actions)
            .concatMap(this.executeAction.bind(this));

        switch (ending) {
            case 'repeat':
                return Observable.interval(0)
                    .concatMapTo(actionsObs);

            case 'wait':
                return actionsObs.concat(this.stop());

            case 'startover':
                return actionsObs.concat(this.main);

            default:
                return actionsObs;
        }
    }

    dispatchEvent(eventName, eventData) {
        return this.listeners[eventName];
    }

    executeAction(action) {
        return Observable.of(action)
            .concatMap(action => {
                const values = action.isRandom
                        ? Thymio.randomize(action.values)
                        : action.values;

                const actionObs = this[action.method].call(this, values);

                if (action.method.startsWith('turn')
                        && values.duration
                        && values.degrees) {
                    values.duration = 0;
                }

                return values.duration
                        ? Thymio.runFor(actionObs, values.duration * 1000)
                        : actionObs;
            });
    }

    move({direction}) {
        const methodName = `move${ direction.toFirstUppercase() }`;
        return this[methodName]();
    }

    moveBackwards() {
        return this.setWheels(-BASE_SPEED);
    }

    moveForwards() {
        return this.setWheels(BASE_SPEED);
    }

    run() {
        if (!this.listeners) {
            this.main.subscribe();
        }
        else {
            const eventNames = Object.keys(this.listeners);
            const asebaScript = broadcastEvents(this.name, eventNames);

            this.loadScript(asebaScript)
                .concat(this.filterEvents(eventNames))
                .last()
                .concatMap(eventFilter =>
                    this.startListening(eventFilter)
                        .startWith(this.main)
                        .switch()
                )
                .subscribe();
        }
    }

    stop() {
        return this.setWheels(0);
    }

    turn({direction, degrees}) {
        const methodName = `turn${ direction.toFirstUppercase() }`;
        return this[methodName]({degrees});
    }

    turnLeft({degrees}) {
        const turnObs = this.setWheels(-BASE_SPEED, BASE_SPEED);
        return Thymio.setDegrees(turnObs, degrees);
    }

    turnRight({degrees}) {
        const turnObs = this.setWheels(BASE_SPEED, -BASE_SPEED);
        return Thymio.setDegrees(turnObs, degrees);
    }
}

module.exports = Thymio;
