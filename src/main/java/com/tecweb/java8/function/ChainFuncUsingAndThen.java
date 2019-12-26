package com.tecweb.java8.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ChainFuncUsingAndThen {
    public static void main(String ... args){
        Function<String, List<String>> splitString = s -> {
            return Arrays.asList(s.split(","));
        };

        Function<List, Integer> counter = l -> {
            return l.size();
        };

        String irregularVerbs = "be, built, come, fight, go ";
        int verbsCount = splitString.andThen(counter).apply(irregularVerbs);
        System.out.println("There are " + verbsCount + " irregular vers present in " + irregularVerbs);

        String upCaseString = f.apply("jose");
        System.out.println(upCaseString);
    }

    static Function<String, String> f = s -> s.toUpperCase();
}
