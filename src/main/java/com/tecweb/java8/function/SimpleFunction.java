package com.tecweb.java8.function;

import java.util.function.Function;

public class SimpleFunction {
    public static void main(String ... args){
        Function<Integer, Integer> funcAdd = (a) -> {
            return a * a;
        };
    }
}
