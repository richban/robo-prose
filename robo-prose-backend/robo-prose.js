/**
 * @fileoverview
 */

const path = require('path');

const { argv } = require('yargs');

const { constraintsChecker, invalidConstraintsFilter }
    = require('./js/constraints-checker');
const parser = require('./js/ecore-to-thymio');


const INSTANCE_FILE = path.resolve(argv.instance || argv._[0]);
const MODEL_FILE = path.resolve(argv.model || argv._[1]
    || '../robo-prose-model/model/RoboProse.ecore');
const CONSTRAINTS_CWD = path.resolve(argv.constraints || argv._[2]
    || '../robo-prose-constraints');


constraintsChecker(INSTANCE_FILE, CONSTRAINTS_CWD)
    .concat(parser(MODEL_FILE, INSTANCE_FILE))
    .last()
    .catch(invalidConstraintsFilter)
    .subscribe(thymio => thymio.run());
