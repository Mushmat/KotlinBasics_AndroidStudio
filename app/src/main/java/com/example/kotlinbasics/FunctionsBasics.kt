package com.example.kotlinbasics

fun main(){
    println("Enter the first number")
    val number1 = readln().toInt()
    println("Enter the second number")
    val number2 = readln().toInt()

    val result = add(number1, number2)
    println("The addition of $number1 and $number2 gives out $result")
}

fun add(num1 : Int, num2: Int):Int{
    val result = num1 + num2
    return result
}