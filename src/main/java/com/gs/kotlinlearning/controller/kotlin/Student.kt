package com.gs.kotlinlearning.controller.kotlin

/**
 * 主构造函数
 */
class Student constructor(name: String, age: Int) {
    val name: String
    val age: Int

    init {
        this.age = age
        this.name = name
    }

}