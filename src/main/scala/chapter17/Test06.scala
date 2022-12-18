package chapter17

object Test06 {
  def main(args: Array[String]): Unit = {
    val set1 = Set(13, 23, 53, 12, 13, 23, 78)
    println(set1)
    val set2 = set1 + (20)
    val set3 = set1.+(20)
    println(set1)
    println(set2)
    println(set3)
    val set4=set2++set3
    println(set2)
    println(set3)
    println(set4)
    val set5=set4-12
    println(set5)


  }

}
