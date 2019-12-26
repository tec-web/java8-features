package com.tecweb.java8.joda;

import java.time.LocalDate;
import java.time.LocalTime;

public class IntroToJoda {
    public static void main(String ... args){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println("Date is " + date);
        System.out.println("Time is "  + time);

        int dayOfMonth = date.getDayOfMonth();
        int dayOfYear = date.getDayOfYear();
        int dayOfWeek = date.getDayOfWeek().getValue();

        System.out.printf("%s %d , %s %d , %s %d",
                "dayOfMonth", dayOfMonth, " dayOfWeek ", dayOfWeek, "dayOfYear ", dayOfYear);
    }
}
