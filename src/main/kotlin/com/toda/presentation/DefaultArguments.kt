package com.toda.presentation

data class User(
        var name: String ,
        var surname: String,
        var age: Int,
        var id: Int = generateId()
)

fun main() {
    val user = User("foo", "foos", 3, 1)
    val userb = User("foo", "foos", 3, 1)
    val userc = user.copy(id = 5, name = "giks")
//    val userb = user
    println(user == userb) //structural (data) equality
    println(user === userb) //referential equality
    val (_, surname, age, _) = user
        println("My surname is $surname with age of $age.")
}

fun generateId() : Int {                                
    return kotlin.random.Random.nextInt()
}