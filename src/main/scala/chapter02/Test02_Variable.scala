package chapter02

import chapter1.Student

object Test02_Variable {
  def main(args: Array[String]): Unit = {
    var name = "abc";
    println(name * 3)
    var age = 132;
    printf("%d 随 %s", age, name)
    println(s"${age}岁的${name} 在尚硅谷学习")
    var num: Double = 2.3353
    println(f"The num is ${num}%2.2f")
    println(raw"The num is ${num}%2.2f")
    var sql=
      s"""
         |select *
         |from
         |student
         |where name=${name}
         | and
         | age>${age}

       """.stripMargin
    println(sql)
  }
}
