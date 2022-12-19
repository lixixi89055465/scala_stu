package chapter07

import scala.collection.mutable

object Test09 {
  def main(args: Array[String]): Unit = {
    //1. 创建
    val map1: mutable.Map[String, Int] = mutable.Map("a" -> 13, "b" -> 34, "hello" -> 3)
    println(map1)
    println(map1.getClass)
    println("1" * 100)
    // 2 . 添加元素
    map1.put("c", 5)
    map1.put("b", 5)
    println(map1)
    map1 += (("e", 7))
    println(map1)
    //3.删除元素
    println(map1("c"))
    map1.remove("c")
    println(map1.getOrElse("c", 0))
    println("2" * 100)
    map1 -= "e"
    println(map1)
    //4.删除元素
    map1.update("c", 10)
    map1.update("f", 9)
    println(map1)

    val map2: Map[String, Int] = Map("a" -> 13, "b" -> 34, "hello" -> 3)
    map1 ++= map2
    println(map1)
    println(map2)
    val map3: Map[String, Int] = map2 ++ map1
    println("map3")
    println(map3)

  }
}
