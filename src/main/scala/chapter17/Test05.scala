package chapter17

import scala.collection.mutable.ListBuffer

object Test05 {
  def main(args: Array[String]): Unit = {
    val list1: ListBuffer[Int] = new ListBuffer[Int]()
    val list2 = ListBuffer(12, 53, 75)
    println(list1)
    println(list2)
    println("1" * 100)
    list1.append(15, 63)
    list2.prepend(30, 23)
    println(list1)
    println(list2)
    println("2" * 100)
    list1 += 25 += 11
    println(list1)
    31 +=: 96 +=: list1
    println(list1)
    println("2" * 100)
    val list3 = list1 ++ list2
    println(list3)
    //    list1 ++= list2
    //    println(list1)
    list1 ++=: list2
    println(list1)
    println(list2)
    println("3" * 100)
    //4 修改元素
    list2(3) = 30
    list2.update(0, 89)
    println(list2)
    //5 删除元素
    list2.remove(2)
    list2-=30
    println(list2)

  }

}
