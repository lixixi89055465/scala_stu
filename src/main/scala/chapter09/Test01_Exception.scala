package chapter09

object Test01_Exception {
  def main(args: Array[String]): Unit = {
    try {
      val n = 1 / 0
    } catch {
      case e: ArithmeticException => {
        println("发生算数异常")
      }
      case e: Exception => {
        println("发生一般异常")
      }
    } finally {
      println("处理结束 ")
    }

  }

}