package chapter07

object Test13 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4, 5, 6, 7, 8)
    val list2 = List(13, 25, 36, 4, 59, 61, 72, 83)
    println(list1.sum)
    println(list1.product)
    println(list1.max)
    println(list1.min)
    println(list1.sorted)
    println(list1.sorted(Ordering[Int].reverse))
    val a = list1.zip(list2)
    println(a.sortBy(_._2)(Ordering[Int].reverse))
    val b = a.sortWith((a, b) => {
      a._1 < b._1
    })
    val c = list1.sortWith(_ > _)


  }

}
