package com.tecweb.java8.test;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    static class Hero{
        String name;

        public Hero(String name){
            this.name = name;
        }

        public int hashCode(){
            return this.name.length();
        }

        public boolean equals(Object obj){
          return this.name.equals(((Hero)obj).name);
        }

        public String toString(){
            return this.name;
        }
    }

    public static void main(String... args){
        Set<Hero> intSet = new HashSet<>();
        intSet.add(new Hero("Harry"));
        intSet.add(new Hero("Ron"));
        intSet.add(new Hero("Hermione"));
        intSet.add(new Hero("Harry"));

        Set<Hero> otherHeroes = Set.of(
          new Hero("Luke"),
                new Hero("Han"),
                new Hero("Luke"),
                new Hero("Lea")
        );

        intSet.stream().forEach(System.out::println);
        otherHeroes.stream().forEach(System.out::println);
    }
}
