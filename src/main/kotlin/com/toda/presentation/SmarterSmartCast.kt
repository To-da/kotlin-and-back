package com.toda.presentation

fun main() {
    val x: Any = "11"
    when (x) {
        is Int -> print(x + 1)
        is String -> print(x.length + 1)
        is IntArray -> print(x.sum())
    }
}