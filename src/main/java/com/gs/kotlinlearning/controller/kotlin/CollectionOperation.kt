package com.gs.kotlinlearning.controller.kotlin

/**
 * @author     ：JackieChan
 * @date       ：2019/9/17 21:46
 * @version:     1.0
 * @description：集合 操作
 */
//移动窗口技术
fun testWindowed() {
    val numbers = listOf("one", "two", "three", "four", "five")
    println(numbers.windowed(3))
}

fun main() {
    testWindowed()
}
