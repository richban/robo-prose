// (c) mdsebook, wasowski, tberger

package dk.itu.dsl.roboprose.constraints

import scala.collection.JavaConversions._ // for natural access to EList
import mdsebook.scala.EMFScala._
import dk.itu.dsl.roboprose.model._
import scala.util.Try

object Constraints {

  def has[A] (a : => A) = Option(a).nonEmpty

  def uniqueEvent (listeners: List[EventListener]): Boolean = {
    listeners.map(l => l.getEvent.getClass.getSimpleName)
      .groupBy(identity).forall( pair => pair._2.length == 1)
  }

  def isSet(f: Float): Boolean = f != 0.0
  def isSet(b: Boolean): Boolean = b

  def isIndefinite (action: Action): Boolean = {
    !(Try(isSet(action.asInstanceOf[ContinuosAction].getDuration)).getOrElse(false) ||
    Try(isSet(action.asInstanceOf[RandomAction].isIsRandom)).getOrElse(false) ||
    Try(isSet(action.asInstanceOf[Turn].getDegrees)).getOrElse(false))
  }

  val invariants: Map[String, Constraint] = Map (

      "Root must have at least one robot." -> inv[Root] {
          self => self.getRobot != null },

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
        -> inv[Event] { self =>
            self.isInstanceOf[Obstacle] ||
              self.isInstanceOf[Tapped]
        },

      "Acttion can be type of Move, Turn or Stop" -> inv[Action] {
        self => self.isInstanceOf[Move] || self.isInstanceOf[Turn] ||
          self.isInstanceOf[Stop]
      },

      "Move action requires a duration" -> inv[Move] {
        self => has(self.getDirection.getValue)
      },

      "There should be no EventListeners for the same event on the top level"
        ->
          inv[RoboProse] {
            self => uniqueEvent(self.getListeners.toList)
          },

      "There should be no SubListeners for the same event on the same level"
        ->
          inv[EventListener] {
          self => uniqueEvent(self.getSublisteners.toList)
        },

      "If the last action is not indefinite and ending is required"
        -> inv[ActionsList] { self =>
        (!isIndefinite(self.getActions.last) implies has(self.getEnding)) &&
          (isIndefinite(self.getActions.last) implies !has(self.getEnding))
        },

      "Turn Action can't have degrees and duration set at the same time"
        -> inv[Turn] { self =>
        (isSet(self.getDuration) implies !isSet(self.getDegrees)) &&
            (isSet(self.getDegrees) implies !isSet(self.getDuration))
        },
      )
}
