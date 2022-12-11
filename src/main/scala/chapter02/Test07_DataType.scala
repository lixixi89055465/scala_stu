package chapter02

import chapter1.Student

object Test07_DataType {
  def main(args: Array[String]): Unit = {
    var c1 = 'c'
    val i1 = (c1 + 1).toChar
    println(i1)

    def m1(): Unit = {
      println("m1 被调用执行 !!")
    }

    var a = m1()
    println(a)

    //    val s: Student = new Student("fasf", 22)
    //    s = null
    //    println(s)
    def m2(n: Int): Int = {
      if (n == 0)
        throw new NullPointerException
      else
        return n
    }

    var b = m2(0)
    println(b)
  }
}
