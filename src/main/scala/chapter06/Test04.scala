package chapter06

object Test04 {
  def main(args: Array[String]): Unit = {
    val person: Person = new Person()
    println(person.sex)
    println(person.age)
    person.printInfo()
    println("="*50)
    val worker = new Worker()
    worker.printInfo()
  }
}

class Person {
  private var idCard: String = "324324234"
  var name: String = "alice"
  var sex: String = "female"
  private[chapter06] var age: Int = 18

  def printInfo(): Unit = {
    println(s"Person : $idCard  $name $sex $age ")
  }

}
