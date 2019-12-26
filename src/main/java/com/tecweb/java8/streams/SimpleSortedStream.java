package com.tecweb.java8.streams;

import java.util.List;

public class SimpleSortedStream {
    public static void main(String ... args){
        List<Integer> anyIntegers = List.of(23, 46, 18, 52,39,50, 82);
        System.out.println("List of elements");
        anyIntegers.forEach(System.out::println);
        System.out.println("After Sorting (ASC)");
        anyIntegers.stream().sorted().forEach(System.out::println);
        System.out.println("After Sorting (DESC");
        anyIntegers.stream().sorted((i1, i2) -> i2.compareTo(i1)).forEach(System.out::println);
    }
}
