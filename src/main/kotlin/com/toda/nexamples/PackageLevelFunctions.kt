package com.toda.nexamples

fun sayMyName() {
    println("Toda Tosovsky")
}

fun String.hello():String {
     return "hello ${this.capitalize()}"
}