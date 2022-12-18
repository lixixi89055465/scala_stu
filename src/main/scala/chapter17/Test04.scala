package chapter17

object Test04 {
  def main(args: Array[String]): Unit = {
    val list1 = List(23, 65, 86)
    println(list1)
    println(list1(1))
    list1.foreach(println)
    //3 添加元素
    println("1" * 100)

    val list2 = list1.+:(10)
    println(list2)
    val list3 = list1.:+(23)
    println(list3)
    val list4 = list1 :+ 34
    println(list4)
    println("2" * 100)
    val list5 = list2.::(2)
    println(list5)
    val list6 = Nil.::(43)
    println(list6)
    val list7 = 32 :: 88 :: 32 :: Nil
    println(list7)
    val list71 = 17 :: 88 :: 43 :: 16 :: Nil
    println(list71)
    val list72 = 13 :: 88 :: 32 :: Nil
    println(list72)
    val list8 = list6 :: list7
    println(list8)
    val list9 = list6 ::: list7
    println("list9" + list9)
    val list10 = list6 ++ list7
    println(list10)


  }

}
