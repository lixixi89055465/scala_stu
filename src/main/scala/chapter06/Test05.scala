package chapter06

object Test05 {
  def main(args: Array[String]): Unit = {
    val student = new Student1()
  }
}

class Student1() {
  var name: String = _
  var age: Int = _
  println("1. 主构造方法被调用 ")

  //声明辅助构造方法
  def this(name: String) {
    this()
    println("2. 辅助构造方法一起被调用")
    this.name = name
    println(s"name:${name} age: ${age}")
  }

  def this(name: String, age: Int) {
    this()
    println("3. 辅助构造方法二被调用")
    this.name = name
    println(s"name: ${name} age: ${age}")
  }

  def Student1(): Unit = {
    println("一般方法被调用")
  }
}
