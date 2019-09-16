package com.gs.kotlinlearning.controller.kotlin

/**
 * 第三种构造函数，去掉init函数
 */
class School(schoolName :String,schoolAddr :String) {
    private val schoolName :String=schoolName
    private val schoolAddr :String =schoolAddr
}