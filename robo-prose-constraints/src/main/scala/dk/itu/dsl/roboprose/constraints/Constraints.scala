// (c) mdsebook, wasowski, tberger

package dk.itu.dsl.roboprose.constraints

import scala.collection.JavaConversions._ // for natural access to EList
import mdsebook.scala.EMFScala._
import dk.itu.dsl.roboprose.model._

object Constraints {
  def has[A] (a : => A) = Option(a).nonEmpty
  
  val invariants: Map[String, Constraint] = Map (
      
      "Example constraint" -> inv[Main] (
          self => self.getActions.length > 1)
  )
}
