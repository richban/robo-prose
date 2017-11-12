/**
 * @fileoverview
 *
 */

const Ecore = require('ecore/dist/ecore.xmi');
const path = require('path');
const q = require('q');
const fs = require('fs');


const resourceSet = Ecore.ResourceSet.create();

const isModel = element =>
    element.eClass.values.name === 'EPackage';


const readEcoreFile = (filePath) => {
    filePath = path.resolve(filePath);
    const resource = resourceSet.create({
        uri: filePath
    });

    return q.nfcall(fs.readFile, filePath, 'utf-8')
        .then(fileContents => {
            try {
                resource.parse(fileContents, Ecore.XMI);

                const contents = resource.get('contents');
                const first = contents.first();
                if (isModel(first)) {
                    // This is a model, so add it to the registry
                    Ecore.EPackage.Registry.register(first);
                    return first;
                }

                return contents;
            }
            catch (err) {
                throw new Error(err);
            }
        });
};

module.exports = (filePath) => {
    return readEcoreFile(filePath)
};
