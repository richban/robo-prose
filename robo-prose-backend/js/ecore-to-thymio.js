/**
 * @fileoverview
 *
 */

const Ecore = require('ecore/dist/ecore.xmi');
const fs = require('fs');
const lodash = require('lodash');
const path = require('path');
const q = require('q');
const { Some } = require('option-t');

const Thymio = require('./thymio.js');


//String.prototype.firstUppercase = function() {
//    return this[0].toUpperCase() + this.slice(1);
//};

const resourceSet = Ecore.ResourceSet.create();


const makeThymio = contents => {
    const robot = contents.first().get('robots').first();

    const main = robot.get('main').get('actions')
                      .map(model2ThymioAction);

    const maybeListeners = robot.get('listeners');
    const listeners = new Some(maybeListeners.size() > 0
            ? maybeListeners
            : null
        ).map(listeners => {
            listeners.map(listener => {
                const eventName = listener.event
                                          .eClass.values.name.toLowerCase();
                const actions = listener.get('actions');
                return [
                    eventName,
                    actions.map(model2ThymioAction)
                ];
            })
        })
        .map(lodash.fromPairs);

    return new Thymio(main, listeners.unwrap());
};

const model2ThymioAction = action => {
    switch (action.eClass.values.name.toLowerCase()) {
        case 'move':
            const direction = action.get('isForward')
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

    return q.nfcall(fs.readFile, filePath, 'utf-8')
        .then(fileContents => {
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
        .then(registerEcoreModel)
        .then(readEcoreFile.bind(null, instancePath))
        .then(makeThymio);
};
