package com.java.oops.level2;

public class Recipe1 extends AbstractRecipe{

    @Override
    void getReady() {
    System.out.println("get the raw materials");
    }

    @Override
    void doTheDish() {
    System.out.println("Do the dish");
    }

    @Override
    void cleanUp() {
    System.out.println("Cleanup");

    }
}
