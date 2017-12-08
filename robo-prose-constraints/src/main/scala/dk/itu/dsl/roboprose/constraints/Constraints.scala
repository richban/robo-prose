// (c) mdsebook, wasowski, tberger

package dk.itu.dsl.roboprose.constraints

import scala.collection.JavaConversions._ // for natural access to EList
import mdsebook.scala.EMFScala._
import dk.itu.dsl.roboprose.model._

object Constraints {

  def has[A] (a : => A) = Option(a).nonEmpty

  def uniqueEvent (listeners: List[EventListener]): Boolean = {
    listeners.map(l => l.getEvent.getClass.getSimpleName)
      .groupBy(identity).forall( pair => pair._2.length == 1)
  }

//  def isIndefinite (action: Action): Boolean = {
//      !((action.isInstanceOf[ContinuosAction] &&
//        action.asInstanceOf[ContinuosAction].eIsSet(RoboprosePackage.CONTINUOS_ACTION__DURATION)) ||
//      (action.isInstanceOf[RandomAction] && action.asInstanceOf[RandomAction].isIsRandom) ||
//      (action.isInstanceOf[Turn] && action.asInstanceOf[Turn].eIsSet(RoboprosePackage.TURN__DEGREES)))
//  }

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
      }//,

//      "If the last action is not indefinite and ending is required"
//        -> inv[ActionsList] { self =>
//          !isIndefinite(self.getActions.last) implies has(self.getEnding)
//        }
      )
}
