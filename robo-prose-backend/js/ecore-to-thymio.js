/**
 * @fileoverview
 *
 */

const Ecore = require('ecore/dist/ecore.xmi');
const fs = require('fs');
const lodash = require('lodash');
const { Observable } = require('rxjs');
const path = require('path');

const { Option } = require('./util');
const Thymio = require('./thymio.js');


const resourceSet = Ecore.ResourceSet.create();


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


const augmentValue = (attributes, value, name) => {
    const attrType = attributes
        .find(attr => attr.get('name') === name)
        .get('eType');

    const type = attrType.get('name')
        .toLowerCase()
        .replace(/^e/, '');

    const literals = Option(attrType.get('eLiterals'))
        .map(lit => lit.map(val => val.get('literal')))
        .unwrapOr(null);

    return {value, type, literals};
};


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

    const main = mapActionList(robot.get('main'), defaults);

    const listeners = Option(robot.get('listeners'), l => l.size() > 0)
        .map(listeners =>
            listeners.map(listener =>
                [
                    listener.get('event').eClass.get('name').toLowerCase(),
                    mapActionList(listener, defaults)
                ]
            )
        )
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
    const attributes = action.eClass.values.eAllAttributes.call(action.eClass);
    const attrNames = attributes.map(attr => attr.get('name'));
    const values = lodash.fromPairs(attrNames
        .map(attrName =>
            [
                attrName,
                action.get(attrName)
            ]
        )
    );

    const actionName = action.eClass.get('name').toLowerCase();
    const actionDefaults = defaults[actionName];
    const isRandom = (values.isRandom || actionDefaults.isRandom) === 'true';

    if (isRandom) {
        const augmentedValues = lodash.mapValues(values,
            augmentValue.bind(null, attributes));
        return Thymio.makeAction(augmentedValues, true, actionName);
    }


    const defaultizedValues = lodash.mapValues(values,
        (value, name) => value || actionDefaults[name]);

    const makeAction = Thymio.makeAction.bind(null, defaultizedValues, false);

    switch (actionName) {
        case 'move':
            return makeAction(`move${ defaultizedValues.direction.toFirstUppercase() }`);

        case 'stop':
            return makeAction('stop');

        case 'turn':
            return makeAction(`turn${ defaultizedValues.direction.toFirstUppercase() }`);
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
