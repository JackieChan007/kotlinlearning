package com.gs.kotlinlearning.controller.kotlin

class SingleClass private constructor(val value:String) {
    companion object{
        fun ofSingleClass(value:String):SingleClass{
            return SingleClass(value)
        }
        @JvmStatic
        fun ofSingleClazz(value:String):SingleClass{
            return SingleClass(value)
        }
    }
}