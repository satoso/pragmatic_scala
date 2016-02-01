//import scala.beans.BeanProperty
class Person(/*@BeanProperty*/ val firstName: String, val lastName: String) {
  var position: String = _
  println(s"Creating ${toString}")
  def this (firstName: String, lastName: String, positionHeld: String) {
    this (firstName, lastName)
    position = positionHeld
    println("aux constructor has been called")
  }
  override def toString : String = {
    s"$firstName $lastName holds $position position"
  }
}
val john = new Person("John", "Smith", "Analyst")
println(john)
val bill = new Person("Bill", "Walker")
println(bill)
