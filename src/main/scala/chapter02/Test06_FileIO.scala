package chapter02

import java.io.{File, PrintWriter}

import scala.io.{Source, StdIn}

object Test06_FileIO1 {
  def main(args: Array[String]): Unit = {
    Source.fromFile("src/main/resources/test.txt").foreach(print);
    val writer = new PrintWriter(new File("src/main/resources/test.txt"))
    writer.write("hello scala from java writer")
    writer.close()

  }
}
