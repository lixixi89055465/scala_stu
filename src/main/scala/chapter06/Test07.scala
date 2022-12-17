package chapter06

object Test07 {
  def main(args: Array[String]): Unit = {
    val s1 = new Student7(name = "alice", age = 18)
    println("="*100)
    val s2 = new Student7(name = "bob", age = 20, stdNo = "std001")

  }

}

//定义一个父类
class Person7() {
  var name: String = _
  var age: Int = _
  println("1. 父类的主构造器调用")

  def this(name: String, age: Int) {
    this()
    println("2. 父类的辅助构造器调用")
    this.name = name
    this.age = age
  }

  def printInfo(): Unit = {
    println(s"Person : $name $age ")

  }

}

//定义子类
class Student7(name: String, age: Int) extends Person7 {
  var stdNo: String = _
  println("3. 子类的主构造器调用 ")

  def this(name: String, age: Int, stdNo: String) {
    this(name, age)
    println("4. 子类的辅助构造器调用")
    this.stdNo = stdNo
  }


}