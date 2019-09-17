package com.gs.kotlinlearning.controller.kotlin


fun  testZip(){
    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")
    println(colors.zip(animals) { color, animal -> "The ${animal.capitalize()} is $color"})
}
fun testFilter(){
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    val filteredMap = numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10}
    println(filteredMap)
}
//测试map中+、-
fun testPlusAndMinus(){
    val numbersMap = mapOf("one" to 1, "two" to 2, "three" to 3)
    val numMap = mapOf("one" to 1, "two" to 2, "four" to 4)
    val numM = mapOf("one" to 1, "two" to 2)
    var  numList =  listOf<String>("one","two","four")
    println(numbersMap + Pair("four", 4))
    println(numbersMap + Pair("one", 10))
    println(numbersMap + mapOf("five" to 5, "one" to 11))
    println("******test map+map ******")
    println(numbersMap+numMap)
    println(numbersMap-numM)
    print(numbersMap-numList)
}
fun  testPartition(){
    val numbers = listOf("one", "two", "three", "four")
    val (match, rest) = numbers.partition { it.length > 3 }
    println("*********test partition********")
    println(match)
    println(rest)
    println(match is List)
}
fun testSlice(){
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println("*******test slice *******")
    println(numbers.take(3))
    println(numbers.takeLast(3))
    println(numbers.drop(1))
    println(numbers.dropLast(5))
}
fun main(){
    var mList= mutableListOf<String>("one","two","three")
    var binVar= mList.binarySearch("one")
    println(binVar)
    testZip()
    testFilter()
    testPlusAndMinus()
    testPartition()
    testSlice()
}