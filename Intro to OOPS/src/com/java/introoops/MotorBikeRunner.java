package com.java.introoops;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(200);
        System.out.println("Speed from constructor "+ ducati.getSpeed());
        System.out.println(honda.getSpeed());
        ducati.start("Ducati");
        ducati.setSpeed(100);
        System.out.println(ducati.getSpeed());
        honda.start("Honda");
        honda.setSpeed(80);
        System.out.println(honda.getSpeed());
        ducati.setSpeed(100);
        honda.setSpeed(0);
    }
}
