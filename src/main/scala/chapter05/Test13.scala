package chapter05

object Test13 {
  def main(args: Array[String]): Unit = {
    lazy val result: Int = sum(13, 45)
    println("1. 函数调用")
    println("2. result = " + result)
    println("4. result = " + result)

  }

  def sum(a: Int, b: Int): Int = {
    println("3 . sum 调用 ")
    a + b
  }

}
