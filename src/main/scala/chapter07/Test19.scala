package chapter07

import scala.collection.mutable

object Test19 {
  def main(args: Array[String]): Unit = {
    val queue: mutable.Queue[String] = new mutable.Queue()
    queue.enqueue("a", "b", "c")
    println(queue)
    println(queue.dequeue())
    queue.enqueue("d","e")
    println(queue.dequeue())
    println(queue)
  }

}
