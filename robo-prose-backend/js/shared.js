/**
 * @fileoverview
 *
 */

const { Some, None } = require('option-t');


String.prototype.toFirstUppercase = function() {
    return this[0].toUpperCase() + this.substring(1);
};


const Option = (value, isValid) => {
    const isSome = isValid ? isValid(value) : value;
    return isSome ? new Some(value) : new None();
};

module.exports = {
    Option,
    toFirstUppercase: str => str.toFirstUppercase()
};
