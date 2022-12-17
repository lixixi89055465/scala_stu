package chapter06

object Test06 {
  def main(args: Array[String]): Unit = {
    val s2 = new Student2()
    println(s"s2: name= ${s2.name}, s2: age = ${s2.age}")
    val s3 = new Student3("bob", 23)
    println(s"s3: name= ${s3.name}, s3: age = ${s3.age}")
    val s4 = new Student4("alice", 21)
    s4.printInfo()
    val s5 = new Student5("alice", 21)
    println(s"s5: name= ${s5.name}, s5: age = ${s5.age}")
//    s5.age = 12
  }

}

//定义类
//无参构造器
class Student2 {
  //单独定义属性
  var name: String = _
  var age: Int = _
}

class Student3(var name: String, var age: Int)

class Student4(name: String, age: Int) {
  def printInfo(): Unit = {
    println(s"Student4: name=${name},age= ${age}")
  }

}

class Student44(_name: String, _age: Int) {
  var name = _name
  var age = _age
}

class Student5(val name: String, val age: Int)
