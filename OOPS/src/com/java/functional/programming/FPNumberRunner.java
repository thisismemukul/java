package com.java.functional.programming;

import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
//        numbers.stream().forEach(
//                element-> System.out.println(element)
//        );
        int sum = getSumFP(numbers);
//        normalSum(numbers);
        System.out.println(sum);
    }

    private static int getSumFP(List<Integer> numbers) {
        int sum = numbers.stream().filter(number->number%2==1).reduce(0,(number1, number2)->number1+number2);
        return sum;
    }

    private static void normalSum(List<Integer> numbers) {
        int sum =0;
        for (int number: numbers){
            sum+=number;
        }
        System.out.println(sum);
    }
}
