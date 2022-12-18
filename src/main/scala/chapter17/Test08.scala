package chapter17

object Test08 {
  def main(args: Array[String]): Unit = {
    //1. 创建
    val map1: Map[String, Int] = Map("a" -> 13, "b" -> 34, "hello" -> 3)
    println(map1)
    println(map1.getClass)
    map1.foreach(println)
    map1.foreach((kv: (String, Int)) => println(kv))
    //3 . 取map中所有的key 或者 value
    for (key <- map1.keys) {
      println(s"$key ----》 ${map1.get(key)}")
    }
  }

}
