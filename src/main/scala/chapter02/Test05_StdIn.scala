package chapter02

import scala.io.StdIn

object Test05_StdIn1 {
  def main(args: Array[String]): Unit = {
    println("请输入姓名:")
    var str = StdIn.readLine()
    println(str)
    var age= StdIn.readLine()
    println(age)
  }

}
