package chapter06

object Test04_Access {

}

class Worker extends Person {
  override def printInfo(): Unit = {
    name="bob"
    age=25
    sex="male"
    println(s"Worker: $name\t$sex\t$age")
  }
}
