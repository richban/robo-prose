/**
 *
 */

const { Some, None } = require('option-t');

module.exports = (value, isValid) => {
    const isSome = isValid ? isValid(value) : value;
    return isSome ? new Some(value) : new None();
};
