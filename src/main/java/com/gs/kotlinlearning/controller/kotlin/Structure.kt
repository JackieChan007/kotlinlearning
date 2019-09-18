package com.gs.kotlinlearning.controller.kotlin

/**
 * @author     ：JackieChan
 * @date       ：2019/9/17 21:58
 * @version:     1.0
 * @description：解构声明
 */


fun testFun0(): Unit {

}

fun handleStrings(list: List<String>) {
    if (list is ArrayList) {
// `list` 会智能转换为 `ArrayList<String>`
    }
}

fun testStruct() {
    var map = mapOf<String, Int>("one" to 1, "two" to 2)
    for ((key, value) in map) {
        println("$key:$value")
    }
    var value = map.mapValues { entry -> entry.key }
    println("********lambda***********")
    println(value is Map)
    println(value.size)
    println(value)
}

fun testEqual(str: String?, str2: String): Boolean {
    return str == str2
}

fun testNull() {
    val listWithNulls: List<String?> = listOf("Kotlin", null)
    for (item in listWithNulls) {
        item?.let { println(it) } // 输出 Kotlin 并忽略 null
        println(item) // 输出 Kotlin 并忽略 null
    }
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun main() {
    var int: Int = 0
    int.inc()
    var sum = int.plus(3)
    println(int.inc())
    println(int.inv())
    println(sum)
    var str1: String = "a"
    var str2: String = "b"
    println(str1 == str2)
    testStruct()
    println(testEqual(null, "string"))
    testNull()
    try {

        var nothing = fail("test Nothing")
    }catch (nothing :Nothing){
//        nothing.
    }
    var list= listOf(null)
    println(list)
}