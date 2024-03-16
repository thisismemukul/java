package com.java.oops.level2;
interface Flyable{
    void  fly();
}
class Birds implements Flyable{
    @Override
    public void fly() {
        System.out.println("with wings");
    }
}

class Aeroplane implements Flyable{
    @Override
    public void fly() {
        System.out.println("with fuel");
    }
}
public class FlyableRunner {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Birds(),new Aeroplane()};
        for(Flyable object:flyingObjects){
            object.fly();
        }
    }
}
