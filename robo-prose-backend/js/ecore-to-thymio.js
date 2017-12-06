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


const resourceSet = Ecore.ResourceSet.create();


String.prototype.toFirstUppercase = function() {
    return this[0].toUpperCase() + this.substring(1);
};


// Just a passthrough by now, will need some recursion
const applyDefaults = lodash.identity;
//const applyDefaults = ([defaults, contents]) => {
//    lodash.forEach(contents.values, (value) => {
//        if (value instanceof EList) {
//            console.log('aaa');
//        }
//    });
//    return [defaults, contents];
//};


const makeMetaModelDefaults = (ePackage) =>
    lodash.fromPairs(ePackage.values.eClassifiers._internal
        .filter(eClass => eClass.values.eAllAttributes)
        .map(eClass =>
            [
                eClass.values.name.toLowerCase(),
                eClass.values.eAttributes.call(eClass)
            ]
        )
        .filter(pair => pair[1].length > 0)
        .map(pair =>
            [
                pair[0],
                lodash.fromPairs(pair[1]
                    .map(attribute =>
                        [
                            attribute.values.name,
                            attribute.values.defaultValueLiteral
                        ]
                    )
                )
            ]
        )
    );


const makeThymio = ([defaults, contents]) => {
    const robot = contents.first().get('robots').first();

    const main = robot.get('main').get('actions')
                      .map(model2ThymioAction.bind(null, defaults));

    const listeners = Option(robot.get('listeners'), l => l.size() > 0)
        .map(listeners => {
            return listeners.map(listener => {
                const eventName = listener.get('event')
                                          .eClass.values.name.toLowerCase();
                const actions = listener.get('actions');
                return [
                    eventName,
                    actions.map(model2ThymioAction.bind(null, defaults))
                ];
            });
        })
        .map(lodash.fromPairs);

    return new Thymio(main, listeners.unwrapOr(null));
};


const model2ThymioAction = (defaults, action) => {
    switch (action.eClass.values.name.toLowerCase()) {
        case 'move':
            var direction = action.get('direction') || defaults.move.direction;
            var duration = action.get('duration') || defaults.move.duration;

            return Thymio.makeAction(`move${ direction.toFirstUppercase() }`,
                parseFloat(duration));

        case 'stop':
            return Thymio.makeAction('stop',
                action.get('duration'));

        case 'turn':
            var direction = action.get('direction') || defaults.turn.direction;
            var duration = action.get('duration') || defaults.turn.duration;
            var degrees = action.get('degrees') || defaults.turn.degrees;

            return Thymio.makeAction(`turn${ direction.toFirstUppercase() }`,
                parseFloat(duration), parseFloat(degrees));
    }
};


const readEcoreFile = filePath => {
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
        .map(makeMetaModelDefaults)
        .concat(readEcoreFile(instancePath))
        .pairwise()
        .last()
        .map(applyDefaults)
        .map(makeThymio);
};
