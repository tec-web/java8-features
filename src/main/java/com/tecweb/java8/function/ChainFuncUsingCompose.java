package com.tecweb.java8.function;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.function.Function;

public class ChainFuncUsingCompose {
    public static void main(String ... args){
        ChainFuncUsingCompose cf = new ChainFuncUsingCompose();

        Date today = new Date();
        System.out.println("The day after tomorrow will be: " +
                cf.formatDate.compose(cf.addTwoDays).apply(today));
    }

    Function<Date, String> formatDate = d -> {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        return sd.format(d);
    };

    Function<Date, Date> addTwoDays = d -> {
        Calendar cal = GregorianCalendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.DAY_OF_MONTH, 2);
        return cal.getTime();
    };
}
