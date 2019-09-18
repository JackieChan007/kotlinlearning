package com.gs.kotlinlearning.controller.kotlin

/**
 * @author     ：JackieChan
 * @date       ：2019/9/18 22:35
 * @version:     1.0
 * @description：静态类
 */
object StaticClazz {
    private val TAG = "DemoManager"
    fun a() {
        println("chen")
        println(TAG)
    }
}

fun main() {
    StaticClazz.a()
}