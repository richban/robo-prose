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

package mdsebook.fsm.xtext.scala

import scala.collection.JavaConversions._

import mdsebook.fsm.FsmPackage
import mdsebook.fsm.FiniteStateMachine
import mdsebook.fsm.scala.transforms.{ Fsm2Java, Fsm2Dot }
import mdsebook.fsm.xtext.FsmStandaloneSetup
import mdsebook.scala.EMFScala._
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import java.io.PrintWriter

object Generators extends App {

  // Change input file name of your state machine model here;
  // path is relative to project root
  val instanceFileName = "../mdsebook.fsm/test-files/CoffeeMachine.fsm"

  // Register our meta-model package for abstract syntax
  FsmPackage.eINSTANCE.eClass

  // Register a suitable resource factory for FSM files (generated by Xtext)
  // The "Fsm" prefix is the name of our language
  // it needs to change to refer to code generated for your language
  new FsmStandaloneSetup().createInjectorAndDoEMFRegistration

  // we are loading our file here
  val uri = URI.createURI(instanceFileName)
  var resource = new ResourceSetImpl().getResource(uri, true);

  // The call to get(0) below gives you the first model root.
  // If you open a directory instead of a file,
  // you can iterate over all models in it,
  // by changing 0 to a suitable index
  val m: FiniteStateMachine = resource.getContents.get(0).asInstanceOf[FiniteStateMachine]

  val name = "src-gen/" + m.getName.capitalize

  new PrintWriter(name + ".java") { write(Fsm2Java compileToJava m); close }
  new PrintWriter(name + ".dot") { write(Fsm2Dot compileToDot m); close }

}

