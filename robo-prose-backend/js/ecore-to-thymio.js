/**
 * @fileoverview
 *
 */

const Ecore = require('ecore/dist/ecore.xmi');
const fs = require('fs');
const lodash = require('lodash');
const { Observable } = require('rxjs');

const { Option } = require('./shared');
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
                            makeAttrProps(attribute)
                                .cast(attribute.get('defaultValueLiteral'))
                        ]
                    )
                )
            ]
        )
    );


const makeThymio = ([defaults, contents]) => {
    const robot = contents.first();

    const main = mapActionList(robot.get('main'), defaults);
    const listeners = mapListeners(robot.get('listeners'), defaults);

    return new Thymio(main, listeners);
};


const makeAttrProps = attribute => {
    const attrType = attribute.get('eType');

    const type = attrType.get('name')
                         .toLowerCase()
                         .replace(/^e/, '');

    const literals = Option(attrType.get('eLiterals'))
        .map(lit => lit.map(val => val.get('literal')))
        .unwrapOr(null);

    var caster;
    switch (type) {
        case 'boolean':
            caster = value => value.toLowerCase() === 'true';
            break;

        case 'float':
            caster = parseFloat;
            break;

        default:
            caster = lodash.identity;
            break;
    }

    return {
        cast: value => {
            if (!value) {
                return value;
            }

            return caster(value);
        },
        literals,
        type
    };
};


const mapActionList = (actionList, defaults) => {
    const actions = actionList.get('actions')
        .map(model2ThymioAction.bind(null, defaults));
    const ending = Option(actionList.get('ending'))
        .map(ending => ending.eClass.get('name').toLowerCase())
        .unwrapOr(null);

    return {actions, ending};
};


const mapListeners = (listeners, defaults) =>
    Option(listeners, l => l && l.size() > 0)
        .map(listeners =>
            listeners.map(listener =>
                [
                    listener.get('event').eClass.get('name').toLowerCase(),
                    {
                        actions: mapActionList(listener, defaults),
                        listeners: mapListeners(listener.get('sublisteners'),
                            defaults)
                    }
                ]
            )
        )
        .mapOr(null, lodash.fromPairs);


const model2ThymioAction = (defaults, action) => {
    const attributes = action.eClass.values.eAllAttributes.call(action.eClass);
    const values = lodash.fromPairs(attributes
        .map(attribute => {
            const attrName = attribute.get('name');
            const attrProps = makeAttrProps(attribute);
            return [
                attrName,
                {
                    value: attrProps.cast(action.get(attrName)),
                    props: attrProps
                }
            ]
        })
    );

    const actionName = action.eClass.get('name').toLowerCase();
    const actionDefaults = defaults[actionName];

    if (values.isRandom &&
            (values.isRandom.value || actionDefaults.isRandom)) {
        return Thymio.makeAction(values, true, actionName);
    }

    const defaultizedValues = lodash.mapValues(values,
        (value, name) => value.value || actionDefaults[name]);

    const makeAction = Thymio.makeAction.bind(null, defaultizedValues, false);
    const direction = Option(defaultizedValues.direction)
        .map(dir => dir.toFirstUppercase());

    switch (actionName) {
        case 'move':
            return makeAction(`move${ direction.unwrap() }`);

        case 'stop':
            return makeAction('stop');

        case 'turn':
            return makeAction(`turn${ direction.unwrap() }`);
    }
};


const readEcoreFile = filePath => {
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
