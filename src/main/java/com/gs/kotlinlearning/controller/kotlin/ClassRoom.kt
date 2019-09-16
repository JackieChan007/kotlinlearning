package com.gs.kotlinlearning.controller.kotlin

/**
 * 去掉 constructor关键字
 */
class ClassRoom(roomNum: Int, students: Int) {
    private val roomNum: Int
    private val students: Int

    init {
        this.roomNum = roomNum
        this.students = students
    }

}