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


const makeMetaModelDefaults = ePackage =>
    lodash.fromPairs(ePackage.values.eClassifiers._internal
        .filter(eClass => eClass.values.eAllAttributes)
        .map(eClass =>
            [
                eClass.get('name').toLowerCase(),
                eClass.values.eAllAttributes.call(eClass)
            ]
        )
        .filter(pair => pair[1].length > 0)
        .map(pair =>
            [
                pair[0],
                lodash.fromPairs(pair[1]
                    .map(attribute =>
                        [
                            attribute.get('name'),
                            attribute.get('defaultValueLiteral')
                        ]
                    )
                )
            ]
        )
    );


const makeThymio = ([defaults, contents]) => {
    const robot = contents.first().get('robot');

    const main = mapActionList(robot.get('main'));

    const listeners = Option(robot.get('listeners'), l => l.size() > 0)
        .map(listeners => {
            return listeners.map(listener =>
                [
                    listener.get('event').eClass.get('name').toLowerCase(),
                    mapActionList(listener)
                ]
            )
        })
        .map(lodash.fromPairs);

    return new Thymio(main, listeners.unwrapOr(null));
};


const mapActionList = (actionList, defaults) => {
    const actions = actionList.get('actions')
                              .map(model2ThymioAction.bind(null, defaults));
    const ending = Option(actionList.get('ending'))
        .map(ending => ending.eClass.get('name').toLowerCase())
        .unwrapOr(null);

    return {actions, ending};
};


const model2ThymioAction = (defaults, action) => {
    const actionName = action.eClass.get('name').toLowerCase();
    const attrNames = action.eClass.values.eAllAttributes.call(action.eClass)
        .map(attr => attr.get('name'));
    const values = lodash.fromPairs(attrNames
        .map(attrName =>
            [
                attrName,
                action.get(attrName) || defaults[actionName][attrName]
            ]
        )
    );

    switch (actionName) {
        case 'move':
            return Thymio.makeAction(`move${ values.direction.toFirstUppercase() }`,
                parseFloat(values.duration));

        case 'stop':
            return Thymio.makeAction('stop', parseFloat(values.duration));

        case 'turn':
            return Thymio.makeAction(`turn${ values.direction.toFirstUppercase() }`,
                parseFloat(values.duration), parseFloat(values.degrees));
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

    if (first.eClass.get('name') !== 'EPackage') {
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
