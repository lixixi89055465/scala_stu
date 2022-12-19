package chapter07

object Test17 {
  def main(args: Array[String]): Unit = {
    val stringList: List[String] = List(
      "hello",
      "hello world",
      "hello scala",
      "hello spark from scala",
      "hello flink from scala",
    )
    //    val wordList1: List[Array[String]] = stringList.map(_.split(" "))
    //    println(wordList1)
    //    val wordList2 = wordList1.flatten
    //    println(wordList2)
    val wordList = stringList.flatMap(_.split(" "))
    println(wordList)
    //2 相同的单词进行分组
    val groupMap: Map[String, List[String]] = wordList.groupBy(word => word)
    println(groupMap)
    //3 对分组之后的list 取长度，得到每个单词的个数
    val countMap: Map[String, Int] = groupMap.map(kv => (kv._1, kv._2.length))
    println(countMap)
    //4 将map 转换为List,并排序取前3
    val sortList: List[(String, Int)] = countMap.toList.sortWith(_._2 > _._2)
    println(sortList)
    val sortList1 = sortList.take(3)
    println(sortList1)


  }

}
