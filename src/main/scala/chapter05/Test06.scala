package chapter05

object Test06 {
  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f 调用")
      n + 1
    }

    val result: Int = f(123)
    println(result)
    //1 . 函数作为值进行传递
    val f1: Int => Int = f _
    println(f1)
    println(f1(12))
    val f2 = f _
    println(f2)
    println(f2(35))

    def fun(): Int = {
      println("func 函数")
      100
    }

    println("1" * 100)
    //    val f3 = fun
    val f3: () => Int = fun
    val f4 = fun _
    println(f3)
    println(f4)

    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def add(a: Int, b: Int): Int = {
      a + b
    }

    println(dualEval(add, 4, 5))
    println(dualEval((a,b)=>a+b,12,32))


  }

}
