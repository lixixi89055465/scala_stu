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
    println(describeType(List("5", "hello")))
    println(describeType(List(23, 54)))
    //        return 0

    //3. 匹配数组
    for (arr <- List(
      Array(0),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0),
      Array(2, 3, 7, 15),
      Array("hello", 20, 30),
    )) {
      val result = arr match {
        case Array(0) => "0"
        case Array(1, 0) => "Array(1,0)"
        case Array(x, y) => "Array: " + x + ", " + y //匹配两元素数组
        case Array(0, _*) => "已0开头的数组 "
        case Array(x, 1, z) => "中间为1的三元素数组 "
        case _ => "something else "
      }
      println(result)
    }
    println("4" * 100)
    //4. 列表数组
    for (arr <- List(
      Array(0),
      Array(1, 0),
      Array(0, 0, 0),
      Array(1, 1, 0),
      Array(88),
    )) {
      val result = arr match {
        case Array(0) => "0"
        case Array(x, y) => "List(x,y) :" + x + ", " + y
        case Array(0, _*) => "List(0, ...) "
        case Array(a) => "List(a) :" + a
        case _ => "something else "
      }
      println(result)
    }
    println("2" * 100)
    //方式二
    val list = List(1, 2, 5, 7, 24)
    list match {
      case first :: second :: rest => println(s"first:$first,second:$second,rest:$rest")
      case _ => println("something else ")
    }
    //5 匹配元组
//    for (tuple <- List(
//      (0, 1),
//      (0, 0),
//      (0, 1, 0),
//      (0, 1, 1),
//      (0, 23, 56),
//      ("hello", true, 0.5)
//    )) {
//      case (a, b) => " " + a + ", " + b
//      case (0, _) => "(0,_)"
//      case (a, 1, _) => "(a,1,_) " + a
//      case _ => "something else "
//
//    }
  }
}
