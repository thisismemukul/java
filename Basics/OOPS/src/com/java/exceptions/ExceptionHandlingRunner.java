package com.java.exceptions;

public class ExceptionHandlingRunner {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        String str  = null;
        str.length();
    }
}
