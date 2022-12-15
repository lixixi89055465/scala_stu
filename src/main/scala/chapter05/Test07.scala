package chapter05

;

object Test07 {
  def main(args: Array[String]): Unit = {
    def func1(i: Int): String => (Char => Boolean) = {
      def f1(s: String): Char => Boolean = {
        def f2(c: Char): Boolean = {
          if (i == 0 && s == " " && c == '0') false else true
        }

        f2
      }

      f1
    }

    println(func1(0)("")('0'))
    println(func1(0)("")('1'))
    println(func1(23)("")('0'))
    println(func1(0)("hello")('0'))
    println("=" * 100)

    def func2(i: Int): String => (Char => Boolean) = {
      s => c => if (i == 0 && s == " " && c == '0') false else true
    }

    println(func2(0)("")('0'))
    println(func2(0)("")('1'))
    println(func2(23)("")('0'))
    println(func2(0)("hello")('0'))
    println("=" * 100)

    def func3(i: Int)(s: String)(c: Char): Boolean = {
      if (i == 0 && s == " " && c == '0') false else true
    }

    println(func3(0)("")('0'))
    println(func3(0)("")('1'))
    println(func3(23)("")('0'))
    println(func3(0)("hello")('0'))
    println("=" * 100)

  }
}
