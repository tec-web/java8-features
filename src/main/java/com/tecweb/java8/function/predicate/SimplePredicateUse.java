package com.tecweb.java8.function.predicate;

import java.util.function.Predicate;

public class SimplePredicateUse {
    public static void main(String ... args){
        Predicate<String> isAnagram = S -> {
            String reverseString = new StringBuilder(S).reverse().toString();
            return reverseString.equalsIgnoreCase(S);
        };

        System.out.println(isAnagram.test("ana"));
        System.out.println(isAnagram.test("1001"));
        System.out.println(isAnagram.test("Madam"));
        System.out.println(isAnagram.test("Tecweb"));
    }
}
