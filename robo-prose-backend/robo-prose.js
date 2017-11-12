/**
 * @fileoverview
 */

const parser = require('./js/ecore-to-thymio.js');

parser(process.argv[2])
    .then(() => parser(process.argv[3]))
    .then(instance => console.log(instance))
    .done();
