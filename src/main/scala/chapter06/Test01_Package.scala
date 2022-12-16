
//用嵌套风格定义包
package com {

  import com.atguigu.scala.Inner

  //在外层包中定义单例对象
  object Outer {
    var out: String = "out"

    def main(args: Array[String]): Unit = {
      println("out")
      println(Inner.in)
    }
  }

  //  object
  package atguigu {
    package scala {

      //内层包中定义单例对象
      object Inner {
        val in: String = "in"

        def main(args: Array[String]): Unit = {
          println("inner")

          println(Outer.out)
          Outer.out = ""
          println(Outer.out)
          //          commonMethod()
        }
      }

    }

  }

}

package aaa {
  package bbb {

    object Test01_Package {
      def main(args: Array[String]): Unit = {
        import com.atguigu.scala.Inner
        println(Inner.in)
      }

      def a: Unit = {

      }
    }

  }

}