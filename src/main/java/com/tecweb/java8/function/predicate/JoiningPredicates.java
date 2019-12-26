package com.tecweb.java8.function.predicate;

import java.util.function.Predicate;

public class JoiningPredicates {
    public static void main(String ... args){
        Predicate<Integer> isPositive = I -> I > 0;
        Predicate<Integer> isMultipleOFive = I -> (I % 5) == 0;

        for (int i = Byte.MIN_VALUE; i <= Byte.MAX_VALUE; i+= 9){
            System.out.println("Is number " +  i + " positive? " + isPositive.test(i));
            System.out.println("Is number " +  i + " negative? " + isPositive.negate().test(i));
            System.out.println("Is number " +  i + " positive and multiple of five? " + isPositive.and(isMultipleOFive).test(i));
            System.out.println("Is number " +  i + " positive or multiple of five? " + isPositive.or(isMultipleOFive).test(i));
        }
    }
}
