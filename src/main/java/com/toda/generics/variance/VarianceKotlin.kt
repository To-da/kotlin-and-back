package com.toda.generics.variance

interface ProducerK<out T> {
    fun produce(): T
}

fun demo(stringProducer: ProducerK<String>) {
    val objProducer: ProducerK<Any> = stringProducer
}

interface ConsumerK<in T> {
    fun consume(param: T)
}

fun demo2(consumer: ConsumerK<Number>) {
    consumer.consume(1L)
    //...
    val intConsumer: ConsumerK<Int> = consumer
}

fun demo3() {
    val integers: Collection<Int> = listOf(1, 2, 3)

    val numbers: Collection<Number> = integers
}