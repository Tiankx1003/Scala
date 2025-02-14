package com.tian.review.day05.implicitdemo

/**
 * 隐式转换
 *
 * @author tian
 *         2019/9/9 19:26
 */
object ImplicitDemo1 {
    def main(args: Array[String]): Unit = {
        implicit def double2Int(d: Double) = d.toInt

        val a: Int = 10.2 //自动寻找implicit修饰的传参只有Double返回Int的函数
        println(a)
    }
}
