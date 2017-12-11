/**
 * @fileoverview
 */

const path = require('path');

const chai = require('chai')
    .use(require('chai-as-promised'));
const should = chai.should();
const { Observable } = require('rxjs/Observable');


const parse = require('../js/ecore-to-thymio');


const makeInstancePath = fileName =>
    path.resolve(__dirname, 'instances', `${ fileName }.xmi`);


describe('Action execution phase', function() {
    it('should have set wheels speed after move action', function() {
//        this.timeout(5000);

        const instance = makeInstancePath('ThreeListeners');

        return parse('../robo-prose-model/model/RoboProse.ecore', instance)
            .do(thymio => thymio.run())
            .concatMap(thymio => Observable.timer(1000).mapTo(thymio))
            .concatMap(thymio => thymio.get('motor.left.speed'))
            .map(speed => speed[0])
            .toPromise()
            .should.eventually.not.equal(0);
    });
});
