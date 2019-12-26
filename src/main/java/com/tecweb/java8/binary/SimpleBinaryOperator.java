package com.tecweb.java8.binary;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class SimpleBinaryOperator {
    static BinaryOperator<String> sayHello = (s, t) ->  s.concat(t);
    static IntBinaryOperator areaOfRectangle = (l, w) -> l * w;

    public static void main(String ... args){
        final String HELLO_STRING = "Hello ";
        final int lengthOfMySquare = 12;
        final int widthOfMySquare = 34;
        System.out.println(sayHello.apply(HELLO_STRING, "Jose"));
        System.out.println("The area of my rectangle is: " +
                areaOfRectangle.applyAsInt(lengthOfMySquare, widthOfMySquare));
    }
}
