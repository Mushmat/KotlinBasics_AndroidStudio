package com.example.kotlinbasics

fun main(){
    println("Enter your age as an whole number.")
    var age = 0
    age = readln().toInt()
    if(age in 18..39){
        println("You can not enter the club as u r old.")
    }
    else{
        println("You cannot enter the club.")
    }
}