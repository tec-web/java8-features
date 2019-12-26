package com.tecweb.java8.primitive;

import java.util.function.IntPredicate;
import java.util.function.ToIntFunction;

public class SimplePrimitive {
    static IntPredicate evenNumber = i -> (i % 2) == 0;
    static ToIntFunction<String> countWords = s -> {
        return s.split(" ").length;
    };

    public static void main(String... args) {
        String[] shakespeareQuotes =
                {"To be, or not to be: that is the question",
                        "There is nothing either good or bad, but thinking makes it so"};

        for (String quote : shakespeareQuotes) {
            int wordCount = countWords.applyAsInt(quote);
            System.out.println("The phrase " + quote + " has " + wordCount + " words");
        }

        if (evenNumber.test(14)) {
            System.out.println("14 is even number");
        }
    }
}
