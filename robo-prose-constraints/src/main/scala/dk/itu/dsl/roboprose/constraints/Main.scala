// (c) mddbook, wasowski, tberger
// Example constraints implemented for the FSM models in Scala
// This is the main runner for the constraints example
// Run using 'sbt run'
package dk.itu.dsl.roboprose.constraints

import scala.collection.JavaConversions._

import mdsebook.scala.EMFScala._
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import dk.itu.dsl.roboprose.model.RoboprosePackage

object Main extends App {

    def map2nd[A, B, C] (f : B => C)(pair : (A, B)) : (A, C) =
        (pair._1, f(pair._2))

    def isValidInstance (constraints : Map[String, Constraint])(entity : EObject) =
        constraints.filter(_._2 appliesTo entity)
            .map(map2nd(_ check entity))

    def checkInstances (instances: Stream[(String, Iterator[EObject])]) = {
        val isValidInstanceLambda = isValidInstance _
        val checker = isValidInstanceLambda(Constraints.invariants)

        instances.forall(pair => {
            val (fileName, entities) = pair

            val constraintsValidity = entities.map(checker)
                .filter(_.nonEmpty)
                .foldLeft(Map.empty[String, Boolean])((acc, entityMap) => {
                    acc ++ entityMap.filter (entry => {
                        val (name, isSatisfied) = entry
                        !isSatisfied || !(acc contains name)
                    })
                })

            constraintsValidity.foreach(pair => {
                val (name, isValid) = pair
                val negation = if (isValid) "" else " not"
                println(s"Constraint ${name} is${negation} satisfied by ${fileName}")
            })

            val isValid = constraintsValidity.forall(_._2)
            println(if (isValid)
                    s"All constraints in ${fileName} are satisfied!"
                else
                    s"Some constraint in ${fileName} is violated!")
            isValid
        })
    }

    // register a resource factory for XMI files
    Resource.Factory.Registry.INSTANCE.
        getExtensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)

    // register the package magic (impure)
    RoboprosePackage.eINSTANCE.eClass

    val fileNames = if (args.length != 0)
            Stream(args(0))
        else
            Stream(
                //"../robo-prose-model/instances/RoboProseInstance1.xmi",
                //"../robo-prose-model/instances/RobotProseTurnInvalidInstance.xmi",
                "../robo-prose-model/instances/RoboProseIndefinite.xmi"
            )

    // Model instances
    val instances = fileNames
        .map(fileName => (fileName.split("/").last, URI.createURI(fileName)))
        .map(map2nd((new ResourceSetImpl).getResource(_, true)))
        // http://download.eclipse.org/modeling/emf/emf/javadoc/2.11/org/eclipse/emf/ecore/util/EcoreUtil.html#getAllProperContents%28org.eclipse.emf.ecore.resource.Resource,%20boolean%29
        .map(map2nd[String, Resource, Iterator[EObject]](EcoreUtil.getAllProperContents[EObject](_, false)))

    sys.exit(if (checkInstances(instances)) 0 else 1)
}
