package chapter07

object Test12 {

  def main(args: Array[String]): Unit = {
    val list1=List(1,2,3,4,5,6,7,8)
    val list2=List(13,25,36,4,59,61,72,83)
    println(list1.head)
    println(list1.tail)
    println(list1.last)
    println(list1.take(3))
    println(list1.drop(3))
    println(list1.dropRight(3))
    println(list1.init)
    val union=list1.union(list2)
    println(union)
    println("2"*100)
    println(list1)
    println(list2)
    for (elem <- list1.sliding(4,2)) {
      println(elem)
    }
    for (elem <- list2.sliding(3, 3)) {
      println(elem)
    }
  }

}
