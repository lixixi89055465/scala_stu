package chapter08

object Test05 {
  def main(args: Array[String]): Unit = {
    val st = new Student1("alice", 18)
    //针对对象实例的内容进行匹配
    val result = st match {
      case Student1("alice", 18) => "Alice ，18"
      case _ => "Else"
    }
    println(result)
  }
}

//定义样例类
case class Student1(name: String, age: Int) {

}