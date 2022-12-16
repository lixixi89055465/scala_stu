package chapter06

import scala.beans.BeanProperty

object Test03 {
  def main(args: Array[String]): Unit = {
    val student = new Student()
    println(student.age)
    println(student.sex)
    student.sex = "female"
    println(student.sex)

  }

}

// 定义一个类
class Student {
  private var name: String = "alice"
  @BeanProperty
  val age: Int = 18
  var sex: String = _
}
