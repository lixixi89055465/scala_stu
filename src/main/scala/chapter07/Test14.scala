package chapter07

object Test14 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    //1. 过滤
    //    val a = list.filter((elem: Int) => elem % 2 == 0)
    val a = list.filter(_ % 2 == 0)
    println(a)
    // 2. map
    // 把集合中每个数乘二
    println(list.map(_ * 2))
    println(list.map(x => x * x))
    //3. 扁平化
    val nestedList: List[List[Int]] = List(List(1, 2, 3),
      List(3, 4, 5), List(6, 7, 8, 9))
    println(nestedList)
    println("1" * 100)
    val flatList = nestedList(0) ::: nestedList(1) ::: nestedList(2)
    println(flatList)
    println("2" * 100)
    val flatten2 = nestedList.flatten
    println(flatten2)
    //4 扁平映射
    //将一组字符串进行分词，并保存成单词的列表
    println("4" * 100)
    var strings: List[String] = List(
      "hello world ",
      "hellow katty",
      "hellow java",
      "hellow scala",
    )
    val splitList: List[Array[String]] = strings.map(_.split(" "))
    println(splitList)
    val flattenList = splitList.flatten
    println(flattenList)

    println("5" * 100)
    val flatmapList = strings.flatMap(_.split(" "))
    println(flatmapList)
    println("分组 ")
    println(list.groupBy(_ % 2))
    val groupMap2 = list.groupBy(data => {
      if (data % 2 == 0) "偶数" else "奇数"
    })
    println("6" * 100)
    val wordList = List("china", "cccc", "abc", "about")
    println(wordList.groupBy(_.charAt(0)))


  }

}
