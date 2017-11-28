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
        self => self.getListeners != null },

      "RoboProse with eventListener must have an event attached"
        -> inv[EventListener] { self =>
          self.getEvent != null
        },

      "Event can be type of Obstacle or Tapped"
        -> inv[RoboProse] { self =>
          self.getListeners.forall { l =>
            l.getEvent.isInstanceOf[Obstacle] ||
              l.getEvent.isInstanceOf[Tapped]
          }
        },

      "Acttion can be type of Move, Turn or Stop" -> inv[Main] {
        self => self.getActions.forall { a =>
          a.isInstanceOf[Move] || a.isInstanceOf[Turn] ||
          a.isInstanceOf[Stop]
        }
      },

      "Acttion can be type of Move, Turn or Stop" -> inv[Move] {
        self => self.getDirection.getValue
      },
  )
}
