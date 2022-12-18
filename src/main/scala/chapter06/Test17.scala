package chapter06

object Test17 {
  def main(args: Array[String]): Unit = {
    var s: Student17 = new Student17("alice", 18)
    s.study()
    s.sayHi()
    println("1" * 100)
    var person: Person17 = new Student17("bob", 23)
    person.sayHi()
    println(s.isInstanceOf[Person17])
    println(s.isInstanceOf[Student17])
    if (person.isInstanceOf[Student17]) {
      var newStudent = person.asInstanceOf[Student17]
      newStudent.study()
    }
    println(classOf[Person17])
    println(classOf[Student17])
    //2.测试枚举类
    println(WorkDay.MONDAY)

  }

}

class Person17(val name: String, val age: Int) {
  def sayHi(): Unit = {
    println("hi from person " + name)
  }
}

class Student17(name: String, age: Int) extends Person17(name, age) {
  override def sayHi(): Unit = {
    println("hi from student " + name)
  }

  def study(): Unit = {
    println("student " + name + "study")
  }
}

//定义枚举类对象
object WorkDay extends Enumeration {
  val MONDAY = Value(1, "Monday")
  val TUESDAY = Value(2, "Tuesday")
}
//定义应用类对象
object TestApp extends App{
println("app start ")
  type MyString = String
  val a:MyString="abc"
  print(a)
}
