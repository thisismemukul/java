package com.java.oops.level2;

public class FanRunner {
    public static void main(String[] args){
    Fan fan = new Fan("Manufracture 1",0.345,"GREEN");
//    fan.isOn(true);
        fan.switchOn();
        System.out.println(fan);
        fan.setSpeed((byte)4);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }
}
