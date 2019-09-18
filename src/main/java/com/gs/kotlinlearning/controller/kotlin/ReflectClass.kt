package com.gs.kotlinlearning.controller.kotlin

/**
 * @author     ：JackieChan
 * @date       ：2019/9/17 23:28
 * @version:     1.0
 * @description：kotlin 反射
 */
class City(var name: String, var addr: String) {}

fun testReflect() {
    var clazz = City::class.java
    var clzz = City::class
    println(clazz == clzz)
    var city=City("sh","sh")
    city.addr="zz"
}
fun kotlinJava(){
    val list=ArrayList<String>(2)
    list.add("sh")
    val size=list.size
    println(size)
    val item=list[0]
    val vale= list[1]
    vale.substring(1)
}

fun main() {
    testReflect()
    kotlinJava()
}