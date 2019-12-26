package com.tecweb.java8.joda;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class SimpleZoneDate {
    public static void main(String ... args){
        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println(currentZone);
        ZoneId zoneId = ZoneId.of("Asia/Calcutta");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        System.out.println(zonedDateTime);
    }
}
