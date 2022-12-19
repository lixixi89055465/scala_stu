package chapter08

object Test02 {
  def main(args: Array[String]): Unit = {
    def describeConst(x: Any): String = x match {
      case 1 => "Int one"
      case "hello" => "String hello"
      case true => "boolean true"
      case '+' => "Char + "
      //      case _ => ""
      case abc => ""
    }

    println(describeConst("hello"))
    println(describeConst('+'))
    println(describeConst(0.3))

    //2 匹配类型
    def describeType(x: Any): String = x match {
      case i: Int => "Int" + i
      case s: String => "String " + s
      case list: List[String] => "List" + list
      case array: Array[Int] => "Array[Int] " + array.mkString(",")
      case a => "Something else: " + a
    }

    println(describeType(5))
    println(describeType("5"))
    println(describeType(List("5","hello")))
    println(describeType(List(23,54)))
    return 0
  }

}
