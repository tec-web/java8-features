package com.tecweb.java8.joda;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.stream.Stream;

public class SimpleDates {
    public static void main(String ... args){
        LocalDate birthDate = LocalDate.of(1970, 12, 24);
        Period period = Period.between(birthDate, LocalDate.now());

        System.out.printf("Years %d , Month %d , Days %d" , period.getYears(), period.getMonths(), period.getDays());

        int[] years = {1974, 1979, 1981, 1986, 1990, 2004, 2006, 2020};
        for(int y : years){
            if(SimpleDates.isLeapYear(y)){
                System.out.printf("%d year is leap year \n" , y);
            }else{
                System.out.printf("%d year is not leap year \n" , y);
            }
        }
    }

    static boolean isLeapYear(int year){
        Year y = Year.of(year);
        return  y.isLeap();
    }
}
