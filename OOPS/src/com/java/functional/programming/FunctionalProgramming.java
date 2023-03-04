package com.java.functional.programming;

import java.util.List;

public class FunctionalProgramming {
    public static void main(String[] args) {
        List<String> list = List.of("Apple","Banana","Cat","Dog");
        printBasic(list);
        printWithFP(list);
        printBasicWithFiltering(list);
        printWithFPFiltering(list);
    }

    private static void printBasic(List<String> list) {
        for(String string: list){
            System.out.println(string);
        }
    }  private static void printBasicWithFiltering(List<String> list) {
        for(String string: list){
            if(string.endsWith("at"))
                System.out.println(string);
        }
    }
    private static void printWithFP(List<String> list) {
        list.stream().forEach(
          element->  System.out.println("element-"+element)
        );
    }
    private static void printWithFPFiltering(List<String> list) {
        list.stream()
                .filter(
                        element-> element.endsWith("at")
                )
                .forEach(
          element->  System.out.println("element-"+element)
        );
    }
}
