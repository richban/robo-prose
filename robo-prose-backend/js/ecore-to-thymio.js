/**
 * @fileoverview
 *
 */

const Ecore = require('ecore/dist/ecore.xmi');
const fs = require('fs');
const lodash = require('lodash');
const { Observable } = require('rxjs');
const path = require('path');

const Option = require('./option-wrapper');
const Thymio = require('./thymio.js');


//String.prototype.firstUppercase = function() {
//    return this[0].toUpperCase() + this.slice(1);
//};

const resourceSet = Ecore.ResourceSet.create();


const makeThymio = contents => {
    const robot = contents.first().get('robots').first();

    const main = robot.get('main').get('actions')
                      .map(model2ThymioAction);

    const listeners = Option(robot.get('listeners'), l => l.size() > 0)
        .map(listeners => {
            return listeners.map(listener => {
                const eventName = listener.get('event')
                                          .eClass.values.name.toLowerCase();
                const actions = listener.get('actions');
                return [
                    eventName,
                    actions.map(model2ThymioAction)
                ];
            });
        })
        .map(lodash.fromPairs);

    return new Thymio(main, listeners.unwrapOr(null));
};

const model2ThymioAction = action => {
    switch (action.eClass.values.name.toLowerCase()) {
        case 'move':
            const direction = action.get('forward') === 'true'
                    ? 'Forward'
                    : 'Backward';
            return Thymio.makeAction(`move${ direction }`);

        case 'stop':
            return Thymio.makeAction('stop');
    }
};

const readEcoreFile = (filePath) => {
    filePath = path.resolve(filePath);
    const resource = resourceSet.create({
        uri: filePath
    });

    return Observable.bindNodeCallback(fs.readFile)(filePath, 'utf-8')
        .map(fileContents => {
            try {
                resource.parse(fileContents, Ecore.XMI);
                return resource.get('contents');
            }
            catch (err) {
                throw new Error(err);
            }
        });
};

const registerEcoreModel = contents => {
    const first = contents.first();

    if (first.eClass.values.name !== 'EPackage') {
        throw new Error('Not an Ecore model');
    }

    // This is a model, so add it to the registry
    Ecore.EPackage.Registry.register(first);
    return first;
};

module.exports = (ecoreModelPath, instancePath) => {
    return readEcoreFile(ecoreModelPath)
        .map(registerEcoreModel)
        .map(readEcoreFile.bind(null, instancePath))
        .map(makeThymio);
};
