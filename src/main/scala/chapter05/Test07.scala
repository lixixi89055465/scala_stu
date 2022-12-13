package chapter05

;

object Test07 {
  def main(args: Array[String]): Unit = {
    def func1(i: Int): String => (Char => Boolean) = {
      def f1(s: String): Char => Boolean = {
        def f2(c: Char): Boolean = {
          if (i == 0 && s == " " && c = '0') false else true
        }

        f2
      }

      f1
    }

    println(func1(0)("0")('0'))
  }
}
