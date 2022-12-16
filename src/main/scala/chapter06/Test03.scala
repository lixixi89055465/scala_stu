package chapter06

import scala.beans.BeanProperty

object Test03 {
  def main(args: Array[String]): Unit = {

  }

}

// 定义一个类
class Student {
  private var name: String = "alice"
  @BeanProperty
  val age: Int = 18
  val sex: String = "male"
}
