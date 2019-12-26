package com.tecweb.java8.function.consumer;

import java.util.function.Consumer;

public class SimpleConsumer {
    public static void main(String[] args){
        Consumer <String> toUpperCase = s -> System.out.println(s.toUpperCase());
        Consumer <String> toLowerCase = s -> System.out.println(s.toLowerCase());

        toLowerCase.andThen(toUpperCase).accept("hello world!");

        showHashCode("Bart", s -> System.out.println(s.hashCode()));
    }

    static void showHashCode(String str, Consumer<String> consumer){
        consumer.accept(str);
    }
}
