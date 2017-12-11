/**
 * @fileoverview
 */

const path = require('path');

const chai = require('chai')
    .use(require('chai-spies'))
    .use(require('chai-as-promised'));
const should = chai.should();
const lodash = require('lodash');
const { Observable } = require('rxjs/Observable');


const { checkConstraints } = require('../js/constraints-checker');
const parse = require('../js/ecore-to-thymio');


const makeInstancePath = fileName =>
    path.resolve(__dirname, 'instances', `${ fileName }.xmi`);


describe.skip('Constraints check', function() {
    before(function () {
        this.parse = chai.spy(parse);
    })

    it('Should not parse input files if constraint check fails', function() {
        this.timeout(0);

        const instanceFile = makeInstancePath('InvalidConstraints');
        return checkConstraints(instanceFile, '../robo-prose-constraints')
            .concatMap(() => this.parse())
            .catch(() => Observable.of(0)
                    .mapTo(this.parse.should.have.not.been.called()))
            .toPromise()
            .should.eventually.be.fulfilled;
    });
});


describe('Model-to-model tests', function() {
    before(function() {
        this.isListenerParsed = listener => {
            if (!listener) {
                return true;
            }

            return listener.actions && lodash.every(listener.listeners,
                this.isListenerParsed);
        };
    });

    it('should map all the listeners recursively', function() {
        const instance = makeInstancePath('ThreeListeners');

        return parse('../robo-prose-model/model/RoboProse.ecore', instance)
            .map(thymio => {
                const allParsed = lodash.every(thymio.allListeners,
                    this.isListenerParsed);
                return allParsed.should.be.true;
            })
            .toPromise()
            .should.eventually.be.fulfilled;
    });
});
