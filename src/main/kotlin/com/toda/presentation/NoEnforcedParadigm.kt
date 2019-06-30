package com.toda.presentation

import kotlin.reflect.KProperty

/**
 * Structured / Imperative
 */

fun structured(): Int {
    var foo = " "

     if (foo.isBlank()) {
        foo = "foo"
        return 1
    }  else {
        return 0
    }
}

/**
 * OOP
 * Interfaces, classes, objects
 */

interface Face {
   fun grr(): String
}

class Foo: Face {
    override fun grr(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

//DELETEGATION

interface SoundBehavior {                                                          // 1
    fun makeSound()
}

class ScreamBehavior(val n:String): SoundBehavior {                                // 2
    override fun makeSound() = println("${n.toUpperCase()} !!!")
}

class RockAndRollBehavior(val n:String): SoundBehavior {                           // 2
    override fun makeSound() = println("I'm The King of Rock 'N' Roll: $n")
}

// Tom Araya is the "singer" of Slayer
class TomAraya(n:String): SoundBehavior by ScreamBehavior(n)                       // 3

// You should know ;)
class ElvisPresley(n:String): SoundBehavior by RockAndRollBehavior(n)             // 3

fun main() {
    val tomAraya = TomAraya("Trash Metal")
    tomAraya.makeSound()                                                            // 4
    val elvisPresley = ElvisPresley("Dancin' to the Jailhouse Rock.")
    elvisPresley.makeSound()
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

/**
 * FP
 * scoping functions, high level functions,
 */
fun functional(): Int {
    fun double(x: Int) = x * 2

    println("Double: ${double(2)}")

    var foo = " "
    
    return if (foo.isBlank()) 1 else 0
}