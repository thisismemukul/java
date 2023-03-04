package com.java.oops.level2;

public class ChessGame implements GamingConsole{

    @Override
    public void up() {
    System.out.println("move up");
    }

    @Override
    public void down() {
    System.out.println("Go into hole");
    }

    @Override
    public void left() {
    System.out.println("left");
    }

    @Override
    public void right() {
    System.out.println("right");
    }
}
