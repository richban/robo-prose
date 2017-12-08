/**
 * @fileoverview
 *
 */

const Immutable = require('immutable');
const lodash = require('lodash');
const { Some, None } = require('option-t');


String.prototype.toFirstUppercase = function() {
    return this[0].toUpperCase() + this.substring(1);
};


const Option = (value, isValid) => {
    const isSome = isValid ? isValid(value) : value;
    return isSome ? new Some(value) : new None();
};


const castValue = augmentedValue => {
    if (!augmentedValue.value) {
        return augmentedValue;
    }

    var parser;
    switch (augmentedValue.type) {
        case 'boolean':
            parser = val => val.toLowerCase() === 'true';
            break;

        case 'float':
            parser = parseFloat;
            break;

        default:
            parser = lodash.identity;
            break;
    }

    return Immutable.Map(augmentedValue)
        .update('value', parser)
        .toObject();
};

module.exports = {
    castValue,
    Option,
    toFirstUppercase: str => str.toFirstUppercase()
};
