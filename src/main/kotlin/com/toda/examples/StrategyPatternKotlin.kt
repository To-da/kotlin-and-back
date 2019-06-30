package com.toda.examples

import com.toda.nexamples.hello

/**
 *
 *Example of high-order fgunction usage
 *
 */
class StrategyPatternKotlin {

    inline fun execute(primaryF: () -> String, isSecondaryReqF: () -> Boolean, secondaryF: () -> Unit) {
        loggingAction(primaryF())
        if (isSecondaryReqF()) secondaryF()
    }

    fun loggingAction(doPrimary: String) {
        println("This is primary action output: $doPrimary")
    }

}

fun main() {
    StrategyPatternKotlin().execute({ "Foo" }, { true }, { println("foo") })
    StrategyPatternKotlin().execute(::returnString, { true }, ::printSomething)

    //limited scope
    println("master".hello())
}


fun returnString(): String {
    return "randomString"
}

fun printSomething() {
    println("random foo")
}