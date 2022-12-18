package chapter17

object Test01 {
  def main(args: Array[String]): Unit = {
    //1 .创建数组
    var arr: Array[Int] = new Array[Int](5)
    //另一种方式创建
    var arr2 = Array(1, 2, 34, 3, 5, 543, 90)
    println(arr2(0))
    println(arr2(1))
    arr(2) = 5
    println(arr)
    println(arr(2))
    println("2" * 100)
    for (i <- 0 until arr.length) {
      println(arr(i))
    }
    println("3" * 100)
    for (i <- arr.indices) {
      println(arr(i))
    }
    println("4" * 100)
    for (elem <- arr2) println(elem)
    println("5" * 100)
    val iter = arr2.iterator
    while (iter.hasNext) {
      println(iter.next())
    }
    println("6" * 100)
    arr2.foreach((elem: Int) => println(elem))
    println("7" * 100)
    arr2.foreach(println)
    println(arr2.mkString("--"))
    var newArr = arr2 :+ (43)
    println(arr2.mkString("--"))
    println(newArr.mkString("--"))
    var newArr2 = newArr.+:(555)
    println(newArr2.mkString("--"))
    val newArr3 = newArr2 :+ 144
    println(newArr3.mkString("--"))
    val newArr4 = 28 +: newArr3
    println(newArr4.mkString("--"))
    val newArr41 = 18 +: 29 +: newArr3
    println(newArr41.mkString("--"))
  }
}
