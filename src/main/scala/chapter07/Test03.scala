package chapter07

object Test03 {
  def main(args: Array[String]): Unit = {
    val array: Array[Array[Int]] = Array.ofDim[Int](2, 3)
    println(array(0)(2))
    for (i <- 0 until array.length; j <- 0 until array(i).length) {
      println(array(i)(j))
    }
    println("1"*100)

    array.foreach(line => line.foreach(println))
    println("2"*100)
    array.foreach(_.foreach(println))
  }

}
