package chapter05

object Test12 {
  def main(args: Array[String]): Unit = {

    def myWhile(condition: => Boolean): (=> Unit) => Unit = {
      def doLoop(op: => Unit): Unit = {
        if (condition) {
          op
          myWhile(condition)(op)
        }
      }

      doLoop _
    }

    var n = 10
    myWhile(n >= 1)({
      println(n)
      n -= 1
    })

    //3. 用柯里化实现
    def myWhile3(condition: => Boolean)(op: => Unit): Unit = {
      if (condition) {
        op
        myWhile3(condition)(op)
      }

    }

    print("=" * 100)
    n = 10
    myWhile3(n >= 1) {
      println(n)
      n -= 1
    }

  }

}
