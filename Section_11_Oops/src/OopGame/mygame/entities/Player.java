package com.mygame.entities;

import OopGame.mygame.entities.GameObject;

/**
 * Represents the player in the game.
 * Demonstrates encapsulation by managing the player's health and position.
 */
public class Player extends GameObject {
    private int health;  // Player's health
    private int speed;   // Speed at which the player moves

    public Player(int x, int y, int health, int speed) {
        super(x, y);  // Call the superclass constructor
        this.health = health;
        this.speed = speed;
    }

    @Override
    public void update() {
        // Example logic for player movement: Move right by `speed` units each update
        x += speed;
        // Print the position to visualize movement
        System.out.println("Player position: (" + x + ", " + y + ")");
    }

    @Override
    public void render() {
        // Render player on screen
        System.out.println("Rendering player at (" + x + ", " + y + ")");
    }

    public void move(int dx, int dy) {
        // Move player by dx and dy
        x += dx;
        y += dy;
    }

    public int getHealth() {
        return health;
    }
}
