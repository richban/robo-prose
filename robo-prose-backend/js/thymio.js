/**
 *
 */

class ThymioDBusObject {

}

class Thymio extends ThymioDBusObject {
    static makeAction(method, ...args) {
        return {
            method: method,
            args: args
        };
    }

    constructor(main, listeners) {
        super();
        this.main = main;
        if (listeners) {
            listeners.forEach(this.addListener.bind(this));
        }
    }

    run() {
        this.main.forEach(this.runAction.bind(this));
    }

    runAction(action) {
        this[action.method].apply(this, action.args);
    }
}

module.exports = Thymio;
