package com.tecweb.java8.interfaces.impl;

import com.tecweb.java8.interfaces.CallableInterface;
import com.tecweb.java8.interfaces.ExecutableInterface;

public class ExecutableClass implements CallableInterface, ExecutableInterface {
    public static void main(String ... args){
        ExecutableClass ec = new ExecutableClass();
        ec.invoke("POST");
        ExecutableInterface.staticMethod();
    }

    public void staticMethod(){
        System.out.println("Executing ExecutableClass instance´s method");
        System.out.println("Overriding Interfaces static's methods is not enable");
    }

    public void invoke(String methodName){
        CallableInterface.super.invoke(methodName);
    }
}