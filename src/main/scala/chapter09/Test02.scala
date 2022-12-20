package chapter09

object Test02 {
  def main(args: Array[String]): Unit = {
    //    println(12.myMax(15))
    val new12 = new MyRichInt(12)
    println(new12.myMax(15))

    //1.隐式函数
    implicit def convert(num: Int): MyRichInt = new MyRichInt(num)

    println(12.myMax(15))
    println("1" * 100)

    class MyRichInt2(val self: Int) {
      //自定义比较大小的方法
      def myMax2(n: Int): Int = if (n < self) self else n

      def myMin2(n: Int): Int = if (n < self) n else self
    }
    val new13 = new MyRichInt2(12)
    println(new13.myMin2(15))

    //3 .隐式参数
    implicit val str: String = "alice"

    //    def sayHello(implicit name: String): Unit = {
    //      println("hello , " + name)
    //    }
    def sayHello()(implicit name: String): Unit = {
      println("hello , " + name)
    }

    def sayHi(implicit name: String = "atguigu"): Unit = {
      println("hello , " + name)
    }

    //    sayHello("alice")
    //    sayHello()
    //    sayHi()
    sayHello
    sayHi
    println("3" * 100)

//    def hiAge(): Unit = {
//      println("hi," + implicitly[Int])
//    }
//    hiAge()

  }
}

class MyRichInt(val self: Int) {
  //自定义比较大小的方法
  def myMax(n: Int): Int = if (n < self) self else n

  def myMin(n: Int): Int = if (n < self) n else self

}
