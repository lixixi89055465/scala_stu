package chapter08


class Student(val name: String, val age: Int) {
}

object Student {
  def apply(name: String, age: Int): Student = new Student(name, age)

  def unapply(student: Student): Option[(String, Int)] = {
    if (student == null) {
      None
    }
    Some(student.name, student.age)
  }

}

object Test04 {
  def main(args: Array[String]): Unit = {
    val student = new Student("alice", 18)
    val result = student match {
      case  Student ("alice", 18) => "Alice , 18 "
      case _ => "Else"
    }
    println(result)
  }


}
