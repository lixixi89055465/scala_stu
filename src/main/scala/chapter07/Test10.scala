package chapter07

object Test10 {
  def main(args: Array[String]): Unit = {
    val tuple: (String, Int, Char, Boolean) = ("hello", 100, 'a', true)
    println(tuple)
    println(tuple._1)
    println(tuple._2)
    println(tuple.productElement(1))
    for (elem <- tuple.productIterator) {
      println(elem)
    }
  }

}
