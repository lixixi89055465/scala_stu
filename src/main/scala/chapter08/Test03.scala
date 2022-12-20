package chapter08

object Test03 {
  def main(args: Array[String]): Unit = {
    //1 在声明变量时匹配
    val (x, y) = (10, "hello")
    print(x, y)
    val List(first, second, _*) = List(9, 78)
    println(s"first：= $first second :=$second ")
    var fir :: sec :: rest = List(23, 15, 9, 87)
    println(s"first: $fir ; second : $sec ; ")
    //2.1 原本的遍历方式
    var list = List(
      ("a", 2),
      ("b", 5),
      ("b", 5),
      ("a", 9),
    )
    for (elem <- list) {
      println(elem._1 + " " + elem._2)
    }
    for ((word, count) <- list) {
      println(word + ":\t" + count)
    }
    for ((word, _) <- list) {
      println(word + ":\t" + _)
    }
    for (("a", count) <- list) {
      println(count)
    }
  }

}
