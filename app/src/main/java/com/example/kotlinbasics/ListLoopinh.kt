package com.example.kotlinbasics

fun main()
{
    val integers = mutableListOf(1,2,3,4,5)
    for(index in 0 until integers.size){
        println(integers[index])
    }
    for(index in 0 until integers.size){
        integers[index] = integers[index] * 2
    }
    println(integers)
}