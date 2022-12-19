package chapter07

object Test15 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)

    //1 .reduce
    //    val a =list.reduce((a: Int, b: Int) => a + b)
    val a = list.reduce(_ + _)
    println(a)
    val b = list.reduceLeft(_ + _)
    println(b)
    val c = list.reduceRight(_ + _)
    println(c)
    //    val list2 = List(3, 4, 5, 9, 10)
    val list2 = List(3, 4, 5, 8, 10)

    println("2" * 100)
    println(list2.reduce(_ - _))
    println(list2.reduceLeft(_ - _))
    println(list2.reduceRight(_ - _))
    println("3" * 100)

    println(list.fold(10)(_ + _))
    println(list.foldLeft(10)(_ + _))
    println(list.foldLeft(10)(_ - _))
    println("4" * 100)

    // 3- (4 -(5 -(9 -(10-11)))))
    println(list2.foldRight(11)(_ - _))


  }

}
