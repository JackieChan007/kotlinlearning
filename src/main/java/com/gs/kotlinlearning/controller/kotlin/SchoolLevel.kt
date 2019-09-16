package com.gs.kotlinlearning.controller.kotlin

/**
 * 直接申明主构造函数(如果类不包含其他的操作，可以省略大括号)
 */
class SchoolLevel(private val schoolStar :String) {
    val schoolStatus :String="five stars"
    var schoolFamous :String ="very famous"
}

/**
 * 省略大括号
 */
class SchoolInfo(private val schoolLevel :String)