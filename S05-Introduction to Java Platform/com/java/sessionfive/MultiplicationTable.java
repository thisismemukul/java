package com.java.sessionfive;

public class MultiplicationTable {
    void print(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d*%d=%d", n, i, n * i).println();
        }
    }
}
