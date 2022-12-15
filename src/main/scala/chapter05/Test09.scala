package chapter05

object Test09 {
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int): Int = {
      a + b
    }

    def addByFour1(): Int => Int = {
      val a = 4

      def addB(b: Int): Int = {
        a + b
      }

      addB
    }

    def addByA(a: Int): Int => Int = {
      def addB(b: Int): Int = {
        a + b
      }

      addB
    }

    println(addByA(35)(12))
    val addByFour2 = addByA(4)
    val addByFive2 = addByA(5)
    println(addByFour2(5))
    println(addByFive2(50))

    // lambda 表达式简写
    def addByA1(a: Int): Int => Int = {
      (b: Int) => {
        a + b
      }
    }

    def addByA2(a: Int): Int => Int = {
      b => a + b
    }

    def addByA3(a: Int): Int => Int = a + _

    // 5 。柯里化
    def addCurrying(a: Int)(b: Int): Int = {
      a + b
    }

    println(addCurrying(10)(20))

  }

}
