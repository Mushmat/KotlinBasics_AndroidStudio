package com.example.kotlinbasics

class Book(val title : String = "Unknown", val author : String = "Anynoymous", val yearPublished : Int= 2024){
    init {

    }
}

fun main(){
    var myBook = Book()
    println(myBook.title)
    println(myBook.author)
    println(myBook.yearPublished)
    var customBook = Book("Game of Blood","Chirayu Choudhary", 2017)
    println(customBook.title)
    println(customBook.author)
    println(customBook.yearPublished)
}