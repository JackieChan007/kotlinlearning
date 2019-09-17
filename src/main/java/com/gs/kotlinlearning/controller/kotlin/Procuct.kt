package com.gs.kotlinlearning.controller.kotlin

//定义dto
data class Procuct(var kind: String, var price: Int)

class ProductKind {
    private var kind: String = ""
    private var price: Int = 0
}

fun main() {
    var pro = Procuct("apple", 11)
    println(pro.kind)
    var productKind = ProductKind()

}