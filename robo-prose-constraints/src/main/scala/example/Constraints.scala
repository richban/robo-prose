// (c) mdsebook, wasowski, tberger

package dk.itu.dsl.roboprose.constraints

import scala.collection.JavaConverters._ // for natural access to EList
import mdsebook.scala.EMFScala._
import dk.itu.dsl.roboprose.model._

object Constraints {
  
  def has[A] (a : => A) = Option(a).nonEmpty
  
  val invariants: Map[String, Constraint] = Map (
      
      "A person can not be parent of itself" -> inv[person.Person] (
          self => self.getChild.forall (_ != self)),
      
      "Fax implies printer (from PrinterPool)" -> inv[printerpoolt1.PrinterPool] (
          self => has(self.getFax) implies has(self.getPrinter)),

      "Fax implies Printer and Copier implies Scanner + Printer" ->
          (inv[printerpoolt2.PrinterPool] (
              self => has(self.getFax) implies has(self.getPrinter)) &&
          inv[printerpoolt2.PrinterPool] (
              self => has(self.getCopier) implies (has(self.getScanner) && has(self.getPrinter)))),
      
      "minSpeed must be 300 less than regular speed" -> inv[printerpoolt3.PrinterPool] (
          self => self.getSpeed - 300 == self.getMinSpeed),
      
      "Every color printer must have a head" -> inv[printerpoolt4.Printer] (
          self => self.isColor && has(self.getHead)),
      
      "Every color pool need at least one color printer" -> inv[printerpoolt5.PrinterPool] (
          self => self.isColor && self.getPrinters.exists (_.isColor))
  )
}
