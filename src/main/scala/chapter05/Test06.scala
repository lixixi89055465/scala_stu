package chapter05

object Test06 {
  def main(args: Array[String]): Unit = {
    val fun = (i: Int, s: String, c: Char) => {
      if (i == 0 && s == "" && c == '0') {
        return false
      }
      return true
    }

    println(0,"",'0')
  }
}
