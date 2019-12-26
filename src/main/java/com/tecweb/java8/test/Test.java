package com.tecweb.java8.test;

import java.util.stream.IntStream;

public class Test {
    /* this runs only on Java9+*/
    public static void main(String[] args) {
        IntStream.iterate(10, i -> i - 2)
                .limit(5)
                .skip(1)
                .dropWhile(i -> i < 6)
                .sorted()
                .takeWhile(i -> i > 2)
                .forEach(System.out::println);
    }
}
