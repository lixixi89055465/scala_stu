package chapter1

class Student(name: String, age: Int) {
  def printInfo(): Unit = {
    println(this.name + "\t" + this.age + "\t" + Student.school)
  }
}

//引入伴生对象
object Student {
  val school: String = "atguigu"

  def main(args: Array[String]): Unit = {
    val alice = new Student(name = "alice", age = 18)
    val bob = new Student(name = "bob", age = 32)
    alice.printInfo()
    bob.printInfo()

  }
}