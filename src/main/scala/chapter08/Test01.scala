package chapter08

object Test01 {
  def main(args: Array[String]): Unit = {
    //1.
    val x: Int = 2
    val y: String = x match {
      case 1 => "one"
      case 2 => "tow"
      case 3 => "three"
      case _ => "other"
    }
    println(y)
    //2. 用模式匹配实现简单二元运算
    val a = 25
    val b = 25

    def matchDualOp(op: Char): AnyVal = op match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case '%' => a % b
//      case _ => "-1"
    }

    println(matchDualOp('+'))
    println(matchDualOp('/'))
    println(matchDualOp('\\'))

    //3 模式守卫
    def abs(num: Int): Int = {
      num match {
        case i if i >= 0 => i
        case i if i < 0 => -i
      }
    }

    println(abs(54))
    println(abs(-4))


  }

}
