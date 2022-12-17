package chapter06

object Test13 {
  def main(args: Array[String]): Unit = {
    val s: Student13 = new Student13()
    s.sayHello()
    println("1" * 100)
    s.sayHello()
    println("2" * 100)
    s.study()
    println("3" * 100)
    s.dating()
    println("4" * 100)
    s.play()
  }

}

// 定义一个父类
class Person13 {
  val name: String = "Person"
  var age: Int = 18

  def sayHello(): Unit = {
    println("hello from :" + name)
  }

  def increase(): Unit = {
    println("Person13 increased")
  }
}

//定义一个特质
trait Young {
  //声明抽象和非抽象属性
  var age: Int
  val name: String = "young"

  //声明抽象和非抽象的方法
  def play(): Unit = {
    println(s"Young people  $name is playing ")
  }

  def dating(): Unit
}

class Student13 extends Person13 with Young {
  //重写冲突的属性
  override val name: String = "simon"

  //实现抽象方法
  def dating(): Unit = println(s"student $name is dating")

  def study(): Unit = println(s"student $name is studying !")

  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from :student $name")
  }

}


