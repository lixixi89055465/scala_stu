package chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Test02 {
  def main(args: Array[String]): Unit = {
    //1. 创建可变数组
    //    val arr1 = new ArrayBuffer()
    val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    val arr2 = ArrayBuffer(23, 43, 54, 56, 65)
    println(arr2.mkString("-"))
    println(arr2)
    println(arr2.toString())
    //    println(arr1(0))
    println(arr2(1))
    arr2(1) = 433
    println(arr2)
    println("1" * 100)
    //3. 添加元素
    arr1.append(23)
    val newArr1 = arr1 :+ 15
    println(arr1)
    println(newArr1)
    arr1 += 18
    println(arr1.mkString("-"))
    val newArr2 = arr1 += 190
    println(newArr2.mkString("-"))
    newArr2 += 14
    println(arr1)
    println(arr1.mkString("1"))

    77 +=: arr1
    print(arr1)
    println(newArr2)
    arr1.append(36)
    arr1.prepend(11, 75)
    arr1.insert(1, 23, 59)
    println(arr1)
    println("2" * 100)

    arr1.insertAll(2, newArr1)
    println(newArr1)
    println(arr1)
    println("3" * 100)
    arr1.remove(3)
    println(arr1)
    arr1.remove(0, 4)
    println(arr1)
    arr1 -= 36
    println(arr1)
    //5 .可变数组转为不可变数组
    val arr: ArrayBuffer[Int] = ArrayBuffer(23, 45, 6, 77, 323)
    val newArr: Array[Int] = arr.toArray
    println(newArr.mkString(","))
    // 6 不可变数组转换为可变数组
    val buffer: mutable.Buffer[Int] = newArr.toBuffer
    println(buffer.mkString(","))
    println(newArr.mkString(","))
  }

}
