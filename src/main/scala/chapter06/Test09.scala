package chapter06

object Test09 {

}

abstract class Person9 {
  //非抽象属性
  var name: String = "person"
  //抽象熟悉
  var age: Int

  //非抽象方法
  def eat(): Unit = {
    println("person eat")
  }

  //抽象方法
  def sleep(): Unit
}

//定义具体的实现子类
class Student9 extends Person9 {
  //实现抽象属性和方法
  var age: Int = 18

  def sleep(): Unit = {
    println("student sleep")
  }
  //重写非抽象属性和方法
//  override val name:String="student"
  name="Student9"

  override def eat(): Unit = {
    println("student eat")
  }

}