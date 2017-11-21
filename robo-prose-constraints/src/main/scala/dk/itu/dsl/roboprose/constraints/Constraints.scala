// (c) mdsebook, wasowski, tberger

package dk.itu.dsl.roboprose.constraints

import scala.collection.JavaConversions._ // for natural access to EList
import mdsebook.scala.EMFScala._
import dk.itu.dsl.roboprose.model._

object Constraints {
  
  def has[A] (a : => A) = Option(a).nonEmpty
  
  val invariants: Map[String, Constraint] = Map (
      
      "Root must have at least one robot." -> inv[Root] {
          self => self.getRobots != null },

      "RoboProse requires a main" -> inv[RoboProse] {
        self => self.getMain != null },

      "Main requires actions" -> inv[RoboProse] {
        self => !self.getMain.getActions.isEmpty },

      "RoboProse may have eventListener" -> inv[RoboProse] {
        self => self.getListeners == null }
  )
}   
