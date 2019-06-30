package com.toda.delegation

enum class AnimalKind {
    INSECT,
    MAMMAL,
    FISH
}

interface Animal {
    fun makeSound()
    fun classification(): AnimalKind

}

class Dog(val soundPrinter: (String) -> (Unit)) : Animal {

    /**
     * start with classification(): AnimalKind { return AnimalKind.MAMMAL }
     */
    override fun classification() = AnimalKind.MAMMAL

    override fun makeSound() {
        //soundPrinter.invoke("bark")
        soundPrinter("bark")
    }
}

class Labradoodle(b: Animal) : Animal by b {
//    override fun makeSound() {
//        println("wuff bark wuff")
//    }
}

fun main() {
    // s -> println(s) ...  println(it)
    val b = Dog(::println)
    Labradoodle(b).makeSound()
    println(Labradoodle(b).classification())
}