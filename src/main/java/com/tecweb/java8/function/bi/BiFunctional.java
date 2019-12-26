package com.tecweb.java8.function.bi;

import java.util.function.BiFunction;

public class BiFunctional {
    public static void main(String ... args){
     int t = 10;
     int u = 8;

     int addition = arithmeticOperation((a, b) -> a + b, t,u);
     int subtraction = arithmeticOperation((a, b) -> a - b, t,u);
     int multiply = arithmeticOperation((a, b) -> a * b, t,u);
     
     System.out.println("Addition " +  addition);
     System.out.println("Subtraction  " +  subtraction);
     System.out.println("Multiply  " +  multiply);
    }
    
    static int arithmeticOperation(BiFunction<Integer, Integer, Integer> operation, Integer t, Integer u){
        return operation.apply(t, u);
    }
}
