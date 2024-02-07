package com.sheta.tasks_basic_kotlin

fun main() {
    var x = 5
    var result = 1
    while (x >= 1){
        println(x)
        result *= x--
    }
    println("result = $result")

}