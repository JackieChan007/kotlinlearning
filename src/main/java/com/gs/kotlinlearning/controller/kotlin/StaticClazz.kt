package com.gs.kotlinlearning.controller.kotlin

/**
 * @author     ：JackieChan
 * @date       ：2019/9/18 22:35
 * @version:     1.0
 * @description：静态类、单例
 */
object StaticClazz {
    private val TAG = "DemoManager"
    fun a() {
        println("chen")
        println(TAG)
    }
}

class StaticClass {


    companion object {
        private val TAG = "print companion demoManager"

        fun b() {
            println(TAG)
        }
    }
}

class DemoManager {
    fun init() {
        b()
    }

    companion object {

        private val MY_TAG = "DemoManager"
        fun b() {
            println("此时 companion objec t表示 伴生对象")
            println(MY_TAG)
        }
    }
}

fun main() {
    StaticClazz.a()
    StaticClass.b()
    DemoManager.b()
}