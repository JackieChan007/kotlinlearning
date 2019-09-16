package com.gs.kotlinlearning.controller.kotlin

class TestKotlin {
    fun kotlin() {
        val a = "Kotlin"
        val b: String? = null
        val c :String? =null
        val e= c?.length
        println(e)
        println(b?.length)
        println(a?.length) // 无需安全调用
        println("test maven kotlin")
        //捕获异常进行处理
        try {
            val d =c!!.length
        }catch ( e: Exception ){
           e.printStackTrace()
        }
        val nullableList: List<Int?> = listOf(1, 2, null, 4)
        val intList: List<Int> = nullableList.filterNotNull()
        println(intList)
    }
}