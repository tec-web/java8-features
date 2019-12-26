package com.tecweb.java8.methodref;

public class SimpleConstructorMethodRef {
    static class Sample{
        public Sample(){
            System.out.println("Sample object was created");
        }

        @Override
        public String toString() {
            return "I am a sample Object";
        }
    }

    @FunctionalInterface
    interface SampleInterface{
        Sample get();
    }

    public static void main(String ... args){
        SampleInterface si = Sample::new;
        Sample result = si.get();
        System.out.println(result);
    }
}
