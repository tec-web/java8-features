package com.tecweb.java8.streams;

import java.util.List;

public class SimpleStreamFilter {
    public static void main(String ... agrs){
        List<Integer> integers = List.of(12, 35, 68, 95, 61, 47);

        integers.stream().filter(i -> (i%2) == 0).forEach(System.out::println);
    }
}
