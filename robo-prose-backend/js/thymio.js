/**
 *
 */

class Thymio {
    static makeAction(method, ...args) {
        return {
            method: method,
            args: args
        };
    }

    constructor(main, listeners) {
        this.main = main;
        listeners.forEach(this.addListener.bind(this));
    }

    run() {
        this.main.forEach(this.runAction.bind(this));
    }

    runAction(action) {
        this[action.method].apply(this, action.args);
    }
}

module.exports = Thymio;
