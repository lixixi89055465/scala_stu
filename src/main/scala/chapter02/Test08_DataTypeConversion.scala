package chapter02

object Test08_DataTypeConversion {
  def main(args: Array[String]): Unit = {
    var a1: Byte = 10
    val b1: Long = 2353L
    val result1: Int = (a1 + b1).toInt
    println(result1)
    val a2: Byte = 10
    val b2: Int = a2
    val c2: Byte = b2.toByte
    println(c2)
    val a3: Byte = 10
    val b3: Int = a2
    val c3: Byte = b3.toByte
    println(c3)
    println("4" * 100)
    val a4: Byte = 12
    val b4: Short = 25
    val c4: Char = 'C'
    var result4: Int = (a4 + b4)
    println(result4)

    println("5" * 100)
    val m: Int = "12".toInt
    val f: Float = "12.3".toFloat
    val f2: Int = "12.4".toFloat.toInt
    println(m)
    println(f)
    println(f2)
  }
}
