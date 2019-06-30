package com.toda.nexamples

import kotlin.random.Random

class User(
        var name: String,
        var surname: String,
        var age: Int,
        var id: Int = generateId()
)

class User2(
        var id: Int,
        var name: String = "foo",
        var surname: String,
        var age: Int
)

fun main() {
    val user = User(name = "foo", surname = "foos", age = 3)
    println(user)

    arithmeticSeriesSum(1, 10)

    functionWithDefaults("s", 1)
}

fun generateId(): Int {
    return 1
}

fun functionWithDefaults(first1: String, second: Int, second2: Int = 1, first: String = "") {
    Random.nextInt()
    println(first)
}

fun arithmeticSeriesSum(a: Int = 1, n: Int, d: Int = 1): Int {
    return n / 2 * (2 * a + (n - 1) * d)
}
