package chapter09


object Test03 {
  def main(args: Array[String]): Unit = {
    //1.协变和逆变
    //    val child: Parent = new Child
    //    val childList: MyCollection[Parent] = new MyCollection[Child]
    val child: Parent = new Child
    val childList: MyCollection[subChild] = new MyCollection[Child]

    //2. s上下限
    def test[A <: Child](a: A): Unit = {
      println(a.getClass.getName)
    }
//    test[Parent](new Child)
//    test[Child](new Child)
    test[Child](new subChild)

  }
}

class Parent {}

class Child extends Parent {}

class subChild extends Child {}

//class MyCollection[+E] {
class MyCollection[-E] {

}
