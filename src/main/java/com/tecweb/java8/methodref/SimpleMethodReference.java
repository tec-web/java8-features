package com.tecweb.java8.methodref;

public class SimpleMethodReference {
    static void counter(){
        for(int i = 1; i <= 10; i++){
            System.out.println("Child thread counting to ten : " + i);
        }
    }
    public static void main(String ... args){
        Runnable r = SimpleMethodReference::counter;
        Thread t = new Thread(r);
        t.start();
        for(int j = 1; j <= 10; j++){
            System.out.println("Main thread playing around " + j);
        }
    }
}
