package chapter05

import scala.annotation.tailrec

object Test10 {
  def main(args: Array[String]): Unit = {
    //    println(fact(5))
    println(tailFact(5))
  }

  def fact(n: Int): Int = {
    if (n == 0) return 1
    return fact(n - 1) * n
  }

  //伪递归实现
  def tailFact(n: Int): Int = {
    @tailrec
    def loop(n: Int, currRes: Int): Int = {
      if (n == 0) return currRes
      loop(n - 1, currRes * n)
    }

    loop(n, 1)
  }
}
