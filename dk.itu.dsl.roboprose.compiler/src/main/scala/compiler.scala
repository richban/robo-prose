// (c) mdsebook, wasowski, berger
//
// Runs the code generators from command line.  The easiest way to execute it:
//
// sbt run -> and then select mdsebook.fsm.xtext.scala.Generators
//
// In Eclipse you should be able to just right click this file and Run as > Scala Application.
//
// (otherwise you can package as a standalone JVM application)
// Right now the input file name is hard coded below, but you can easily
// change this to use command line arguments

package dk.itu.dsl.roboprose.xtext

import scala.collection.JavaConversions._

import dk.itu.dsl.roboprose.model._
import dk.itu.dsl.roboprose.RoboProseStandaloneSetup
import mdsebook.scala.EMFScala._
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util._
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.emf.ecore.resource._
import java.io.PrintWriter
import java.nio._
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

object Compiler extends App {

  var instanceFileName = ""

  if (args.length == 0) {
    println("Please specify a file:")
    instanceFileName = scala.io.StdIn.readLine()
  } else {
    instanceFileName = args(0)
  }
  

  //Strip the extension and add .xmi
  val preExtension = instanceFileName.lastIndexOf(".") 
  val outputFileName = instanceFileName.substring(0,preExtension)+".xmi"


  // Register our meta-model package for abstract syntax
  RoboprosePackage.eINSTANCE.eClass

  // register a resource factory for XMI files
  Resource.Factory.Registry.INSTANCE.
  getExtensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)

  new RoboProseStandaloneSetup().createInjectorAndDoEMFRegistration

  // we are loading our file here
  val uri = URI.createURI(instanceFileName)
  var resource = new ResourceSetImpl().getResource(uri, true);


	val rb: RoboProse = resource.getContents.get(0).asInstanceOf[RoboProse]
	// This is the place to put in the constraints maybe. 

  EcoreUtil.resolveAll(resource)

  val xmiResource = new ResourceSetImpl().createResource(URI.createURI(outputFileName))

  xmiResource.getContents().add(rb)

  xmiResource.save(null)

}