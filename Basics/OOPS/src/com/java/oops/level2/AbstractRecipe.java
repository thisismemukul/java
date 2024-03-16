package com.java.oops.level2;

abstract public class AbstractRecipe {
    public  void execute(){
        getReady();
        doTheDish();
        cleanUp();
    }
    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanUp();

}
