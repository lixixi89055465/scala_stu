package chapter02

//import scala.collection.parallel.immutable
//import scala.collection.immutable
//import scala.util.control.Breaks
import scala.util.control.Breaks._

object Test08_DataTypeConversion1 {
  def main(args: Array[String]): Unit = {
    def dualFunctionOneAndTwo(fun: (Int, Int) => Int): Int = {
      fun(1, 2)
    }

    val add = (a: Int, b: Int) => a + b
    val minus = (a: Int, b: Int) => a - b
    println(dualFunctionOneAndTwo(add))
    println(dualFunctionOneAndTwo(minus))
    dualFunctionOneAndTwo((a, b) => a + b)
    dualFunctionOneAndTwo(_ + _)
    dualFunctionOneAndTwo(_ - _)
    dualFunctionOneAndTwo(-_ + _)
  }
}
