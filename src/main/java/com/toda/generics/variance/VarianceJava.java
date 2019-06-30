package com.toda.generics.variance;

import java.util.Arrays;
import java.util.Collection;

public class VarianceJava {

    public interface Producer<T> {
        T produce();
    }

    void demo(Producer<String> stringProducer) {
//        Producer<Object> objProducer = stringProducer;  //not allowed
    }

    interface Consumer<T> {
        void consume(T param);
    }

    void demo2(Consumer<Number> consumer) {
        consumer.consume(1L);
        //...
  //      Consumer<Integer> intConsumer = consumer;  //not allowed
    }

    void demo3() {
        Collection<Integer> numbers = Arrays.asList(1, 2, 3);
        //     Collection<Object> integers  = numbers;    //not allowed
    }

}
