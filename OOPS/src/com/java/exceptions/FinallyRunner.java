package com.java.exceptions;

import java.util.Scanner;

public class FinallyRunner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numbers = {1, 2, 33, 3};
            int number = numbers[5];
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Before scanner close");
        }
    }
}
