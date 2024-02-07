package com.sheta.tasks_basic_kotlin

fun main() {
    var x = 5
    var sum = 1
    while (x >= 1){
        println(x)
        sum *= x--
    }
    println(sum)

}