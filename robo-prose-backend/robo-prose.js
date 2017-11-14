/**
 * @fileoverview
 */

const parser = require('./js/ecore-to-thymio.js');

parser(process.argv[2], process.argv[3])
    .done();
