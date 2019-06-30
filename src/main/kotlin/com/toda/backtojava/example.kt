package com.toda.backtojava

fun main() {
    helloFunction(2, MyFunction(2), ::intToString)

    fun3.invoke("foo", String::toInt)
}

fun helloFunction(
        foo: Int = 1,
        f: ((Int) -> String) -> String,
        f2: (Int) -> String
): String {
    return (foo + 1).toString().plus(f)
}

fun intToString(integer: Int): String = integer.toString()

class MyFunction(val value: Int) : ((Int) -> String) -> String {

    override fun invoke(int: (Int) -> String): String {
        return value.toString()
    }
}

val lambdaIntToString = Int::toString

val stringToString = { s: String -> "${s.toUpperCase()}foo" }

val producePrinter: () -> () -> Unit = { { println("I am printing") } }

val stringToLong = { s: String -> s.toLong() }

//val right: (Int) -> (String) -> Long = { i -> { stringToLong(i) } }

val rightInfered = { i: Int -> i.toString()}

val fun3: (String, (String) -> Int) -> Int = { value, func -> func(value) }
