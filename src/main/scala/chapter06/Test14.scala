package chapter06

object Test14 {
  def main(args: Array[String]): Unit = {
    val s = new Student14
    s.study()
    s.increase()
    println("1" * 100)
    s.play()
    s.increase()
    println("2" * 100)
    s.dating()
    s.increase()
    println("3" * 100)
    //动态混入
    val sWithTalent = new Student14 with Talent {
      override def singing(): Unit = println("student is good at dancing")

      override def dancing(): Unit = println("student is good at dancing")
    }
    sWithTalent.sayHello()
    sWithTalent.play()
    sWithTalent.study()
    sWithTalent.dating()
    sWithTalent.dancing()
    sWithTalent.singing()

  }

}

//再定义一个特征
trait KnowLedge {
  var amount: Int = 0

  def increase(): Unit
}

trait Talent {
  def singing(): Unit

  def dancing(): Unit

}

class Student14 extends Person13 with Young with KnowLedge {
  //重写冲突的属性
  override val name: String = "simon"

  //实现抽象方法
  def dating(): Unit = println(s"student $name is dating")

  def study(): Unit = println(s"student $name is studying !")

  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from :student $name")
  }

  override def increase(): Unit = {
  }
}
