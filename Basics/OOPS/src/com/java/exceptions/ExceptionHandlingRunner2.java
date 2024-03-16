package com.java.exceptions;

import java.util.concurrent.ExecutionException;

public class ExceptionHandlingRunner2 {
    public static void main(String[] args) {
        method1();
        System.out.println("Main ended");
    }

    private static void method1() {
        method2();
        System.out.println("method 1 ended");
    }

    private static void method2() {
        try{
            String str  = null;
            str.length();
            System.out.println("method2 ended");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
