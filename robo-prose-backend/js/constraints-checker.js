/**
 * @fileoverview
 */

const { spawn } = require('child_process');
const path = require('path');
const { StringDecoder } = require('string_decoder');

const { Observable } = require('rxjs/Observable');
require('rxjs/add/observable/fromEvent');


class ConstraintsError extends Error {
    constructor() {
        super('Constraints not satisfied');
    }
}


const constraintsChecker = (filePath, cwd) => {
    const decoder = new StringDecoder('utf-8');
    const fileName = path.basename(filePath);

    console.log(`Checking constraints validity for ${ fileName }`);
    const constraintsProcess = spawn('sbt', [`run ${ filePath }`], {
        cwd: cwd
    });

    Observable.fromEvent(constraintsProcess.stdout, 'data')
        .map(buffer => decoder.write(buffer))
        .filter(output => output.includes('not satisfied')
            || output.includes('violated'))
        .subscribe(line => process.stdout.write(line));

    // By node.js specifications, will only be fired
    // when data event will be over
    return Observable.fromEvent(constraintsProcess, 'close')
        .do(exitCode => {
            if (exitCode === 42) {
                throw new ConstraintsError();
            }
        })
        .first();
};


const invalidConstraintsFilter = err =>
    err instanceof ConstraintsError
        ? Observable.empty()
        : Observable.throw(err);


module.exports = {
    constraintsChecker,
    invalidConstraintsFilter
};
