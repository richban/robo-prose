/**
 * @fileoverview
 */

const argv = require('yargs').argv;
const parser = require('./js/ecore-to-thymio.js');

const MODEL_FILE = argv.model
        || argv._[0]
        || '../robo-prose-model/model/RoboProse.ecore';
const INSTANCE_FILE = argv.instance
        || argv._[1];

parser(MODEL_FILE, INSTANCE_FILE)
    .done();
