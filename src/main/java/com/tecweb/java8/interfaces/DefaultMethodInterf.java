package com.tecweb.java8.interfaces;

public interface DefaultMethodInterf {
    default void defaultMethod(){
        System.out.println("Implementation of DefaultMethodInterf default's method");
    }
}
