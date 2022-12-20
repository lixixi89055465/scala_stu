package chapter08

object Test06 {
  def main(args: Array[String]): Unit = {
    val list: List[(String, Int)] = List(("a", 12), ("b", 35), ("c", 27), ("a", 13))
    //1. Map转换，实现key不变，value 2倍
    val newList = list.map(tuple => (tuple._1, tuple._2 * 2))
    println(newList)
    //2 用模式匹配对元组元素负值，实现功能
    val newList2 = list.map(tuple => {
      tuple match {
        case (word, count) => (word, count * 2)
      }
    })
    println(newList2)
    //3 省略lambda表达式的写法，进行简化
    val newList3 = list.map(
      {
        case (word, count) => (word, count * 2)
      }
    )
    println(newList3)
    //偏函数的应用 ，求绝对值
    val positiveAbs: PartialFunction[Int, Int] = {
      case x if x > 0 => x
    }
    val negativeAbs: PartialFunction[Int, Int] = {
      case x if x < 0 => -x
    }
    val zeroAbs: PartialFunction[Int, Int] = {
      case 0 => 0
    }

    def abs(x: Int): Int = (positiveAbs orElse negativeAbs orElse zeroAbs) (x)

  }

}
