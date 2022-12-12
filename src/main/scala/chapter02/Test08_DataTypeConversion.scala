package chapter02

object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    for (i <- 0 to 10) {
      //      println(i)
    }
    for (i: Int <- 1.to(10)) {
      //      print(i)
    }
    for (i <- Range(1, 10)) {
      print(i + ",hello world")
    }
    println()
    for (i <- 1 until 10) {
      print(i + ", until")
    }
    println()
    for (i <- Array(12, 34, 53)) {
      print(i + ",")
    }
    println()
    for (i <- List(12, 34, 53)) {
      print(i + ",")
    }
    println()
    for (i <- Set(12, 34, 53)) {
      print(i + ",")
    }
    println()
    for (i <- 1 to 3 if i != 2) {
      print(i + "\t")
    }

    println()
    for (i <- 1 to 10 by 2) {
      print(i + "\t")
    }
    println()
    for (i <- 0 to 30 by 3) {
      print(i + "\t")
    }
    println("1" * 100)
    for (i <- 1 to 10 reverse) {
      print(i)
    }
    println("2" * 100)
    for (data <- 1.0 to 10.0 by 0.3) {
      print(data)
    }
    println()
    for (i <- 1 to 4; j <- 1 to 5) {
      print(s"$i * $j = ${i * j} \t ")
    }

  }
}
