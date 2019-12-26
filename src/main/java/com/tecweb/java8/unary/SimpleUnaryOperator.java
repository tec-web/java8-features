package com.tecweb.java8.unary;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class SimpleUnaryOperator {
    static UnaryOperator<Integer> square = i -> i * i;
    static IntUnaryOperator cube = i -> i * i * i;

    public static void main(String ... args){
         final int NUMBER = 8;

        int squareNumber = square.apply(NUMBER);
        int cubeNumber = cube.applyAsInt(NUMBER);

        System.out.println("The square of " + NUMBER + " is " + squareNumber);
        System.out.println("The cube of " + NUMBER + " is " + cubeNumber);
    }
}
