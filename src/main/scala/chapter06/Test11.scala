package chapter06

object Test11 {
  def main(args: Array[String]): Unit = {
    //    val s = new Student11(name = "alice", age = 18)
    //    s.printInfo()
    val st = Student11.newStudent(name = "alice", age = 18)
    st.printInfo()

  }

}

class Student11 private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student: name= ${name}, age = ${age} , school = ${Student11.school}")
  }
}

//伴生对象
object Student11 {
  val school: String = "atguigu"

  def newStudent(name: String, age: Int): Student11 = new Student11("alice", 18)

  def apply(name: String, age: Int): Student11 = new Student11(name = "bob", age = 19)
}