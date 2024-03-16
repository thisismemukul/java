package com.java.loops;

public class MyNumberRunner {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(5);
        boolean isPrime = number.isPrime();
        System.out.println("Prime "+isPrime);
        int sum = number.sumUptoN();
        System.out.println("sum "+sum);
        number.patern();
    }
}
