package com.java.oops.level2;
abstract class Animal{
    abstract void bark();

}
 class Dog extends Animal{
    @Override
    public void bark() {
        System.out.println("Bow Bow");
    }
}
class Cat extends Animal{
    @Override
    public void bark() {
        System.out.println("Meow");
    }
}

public class AnimalRunner {

    public static void main(String[] args) {
    Animal[] animals = {new Cat(), new Dog()};
    for (Animal animal:animals){
animal.bark();
    }
    }
}
