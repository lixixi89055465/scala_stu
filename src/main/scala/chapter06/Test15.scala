package chapter06

object Test15 {
  def main(args: Array[String]): Unit = {
    val s = new Student15
    s.increase()
  }

}

//定义 球类特征
trait Ball {
  def describe(): String = "ball"
}

//定义一个颜色特征
trait ColorBall extends Ball {
  var color: String = "red"

  override def describe(): String = color + "-" + super.describe()
}

//定义种类特征
trait CategoryBall extends Ball {
  var category: String = "foot"

  override def describe(): String = category + "-" + super.describe()
}

//定义一个自定义球的类
class MyfootBall extends CategoryBall with ColorBall {
  override def describe(): String = "my ball is a " + super.describe()
}

//再定义一个特征
trait KnowLedge15 {
  var amount: Int = 0

  def increase(): Unit = {
    println("Knowledge increased")
  }
}

trait Talent15 {
  def singing(): Unit

  def dancing(): Unit = {
    println("Talen 15 increased")
  }

}

//class Student15 extends Person13 with Talent15 with KnowLedge15 {
class Student15 extends Person13 with KnowLedge15 with Talent15 {
  override def singing(): Unit = println("dancing")

  override def dancing(): Unit = println("singing")

  override def increase(): Unit = {
    super[Person13].increase()
  }
}
