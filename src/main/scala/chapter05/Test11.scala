package chapter05

object Test11 {
  def main(args: Array[String]): Unit = {
    def f0(a: Int): Unit = {
      println("a:" + a)
      println("a:" + a)
    }

    f0(23)

    def f1(): Int = {
      println("f1: 调用")
      12
    }

    f0(f1())

    //2. 传名 参数,传递的不再是具体的值，而是代码块
    def f2(a: => Int): Unit = {
      println("a:" + a)
      println("a:" + a)
    }

    f2(23)
    println("="*100)
    f2(f1())
  }


}
