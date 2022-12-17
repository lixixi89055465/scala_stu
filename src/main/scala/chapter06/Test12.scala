package chapter06

object Test12 {
  def main(args: Array[String]): Unit = {
    val s1 = Student12.getInstance()
    s1.printInfo()
    println(s1.hashCode())
    println(s1)
    val s2 = Student12.getInstance()
    s2.printInfo()
    println(s2.hashCode())
    println(s2)
  }
}


class Student12 private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student: name= ${name}, age = ${age} , school = ${Student11.school}")
  }
}

//饿汉式
//object Student12 {
//  private val student: Student12 = new Student12(name = "alice", age = 18)
//  def getInstance(): Student12 = student
//}
//懒汉式
object Student12 {
  private var student: Student12 = _

  def getInstance(): Student12 = {
    if (student == null) {
      student = new Student12(name = "alice", age = 34)
    }
    student
  }
}

