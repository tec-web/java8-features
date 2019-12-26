package com.tecweb.java8.function.supplier;

import java.util.UUID;
import java.util.function.Supplier;

public class SimpleSupplier {
    static Supplier<String> generateId = () -> {
      return UUID.randomUUID().toString();
    };

    static Supplier<String> major = () -> {
      String[] marathonMajors = {"London", "Boston", "Tokyo", "Berlin", "Chicago", "NY"};
      int randomMajor = (int)(Math.random() * 6);
      return marathonMajors[randomMajor];
    };

    public static void main(String ... args){
        String id = generateId.get();
        System.out.println(id);

        String nextMarathon = major.get();
        System.out.println("I will run The " + nextMarathon + " Marathon" );
    }
}
