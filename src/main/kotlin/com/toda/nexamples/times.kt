package com.toda.nexamples

import com.toda.examples.StrategyPatternKotlin

fun main() {

    5 times
            {
                println("run $it")
            }

    //public visibility by default
    StrategyPatternKotlin().loggingAction("foo")

    Singleton.runOnlyOnce()

    sayMyName()
    println("master".hello())
}

private infix fun Int.times(function: (Int) -> Unit) {
    for (i in 1..this) {
        function.invoke(i)
    }
}


