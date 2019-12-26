package com.tecweb.java8.interfaces;

public interface CallableInterface {
    default void invoke(String methodName){
        System.out.println("Calling " + methodName +  " from CallableInterface");
    }
    static void main(String ... args){
        System.out.println("Executing Interface main's method");
    }
}
