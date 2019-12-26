package com.tecweb.java8.interfaces;

public interface ExecutableInterface {
    default void invoke(String methodName){
        System.out.println("Calling " + methodName +  " from ExecutableInterface");
    }

    static void staticMethod(){
        System.out.println("Executing ExecutableInterface static method ");
    }
}
