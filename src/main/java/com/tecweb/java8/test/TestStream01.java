package com.tecweb.java8.test;

import java.util.List;
import java.util.Optional;

public class TestStream01 {
    public static void main(String... args) {
        List<Simpson> simpsonList = List.of(new Simpson("Homer", 35),
                new Simpson("Margie", 35), new Simpson("Bart", 10),
                new Simpson("Lisa", 8));
        Optional<Simpson> result =  simpsonList.stream().filter(s -> s.getName().equals("Bart"))
                .filter(s -> s.getAge() > 9)
                .findFirst();

        if(result.isPresent()) {
            System.out.print(result.get().name);
            System.out.println(result.get().age);
        }
    }

    static class Simpson {
        private String name;
        private int age;

        public Simpson(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            System.out.println(name);
            return name;
        }

        public int getAge() {
            System.out.println(this.age);
            return age;
        }
    }
}
