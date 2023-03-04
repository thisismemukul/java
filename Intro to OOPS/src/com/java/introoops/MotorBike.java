package com.java.introoops;

public class MotorBike {
    //state
    private int speed;
    MotorBike(int speed){
        this.speed=speed;
    }

    void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }
    int getSpeed(){
        return this.speed;
    }
    //be
    void start(String bikeName) {
        System.out.println(bikeName+" Kare Vrom vrommmm....vrommm..vromm");
    }
}
