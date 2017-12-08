/**
 * @fileoverview
 */

const argv = require('yargs').argv;
const { Observable } = require('rxjs/Observable');
require('rxjs/add/observable/fromEvent');
const parser = require('./js/ecore-to-thymio.js');
const { StringDecoder } = require('string_decoder');
const { spawn } = require('child_process');

const MODEL_FILE = argv.model
        || argv._[0]
        || '../robo-prose-model/model/RoboProse.ecore';
const INSTANCE_FILE = argv.instance
        || argv._[1];

const CONSTRAINTS_CWD = '../robo-prose-constraints';

const decoder = new StringDecoder('utf-8');

console.log(`Checking constraints validity for ${ INSTANCE_FILE }`);
const constraintsProcess = spawn('sbt', [`run ${ INSTANCE_FILE }`], {
    cwd: CONSTRAINTS_CWD
});

Observable.fromEvent(constraintsProcess.stdout, 'data')
    .map(buffer => decoder.write(buffer))
    .filter(output => output.includes('not satisfied')
        || output.includes('violated'))
    .do(line => process.stdout.write(line))
    .subscribe();

Observable.fromEvent(constraintsProcess, 'close')
    .do(exitCode => {
        if (exitCode) {
            throw new Error('Constraints not satisfied');
        }
    })
    .first()
    .concat(
        parser(MODEL_FILE, INSTANCE_FILE)
            .do(thymio => thymio.run())
    )
    .catch(err => Observable.empty())
    .subscribe();
