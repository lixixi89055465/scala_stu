package chapter17

import scala.collection.mutable

object Test07 {
  def main(args: Array[String]): Unit = {
    val set1 = mutable.Set(13, 23, 53, 12, 13, 23, 78)
    println(set1)
    println("1"*100)
    set1+=11
    println(set1)

  }

}
