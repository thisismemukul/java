package com.mygame.entities;

import OopGame.mygame.entities.GameObject;

/**
 * Represents the player in the game.
 * Demonstrates encapsulation by managing the player's health and position.
 */
public class Player extends GameObject {
    private int health;  // Player's health

    public Player(int x, int y, int health) {
        super(x, y);  // Call the superclass constructor
        this.health = health;
    }

    @Override
    public void update() {
        // Example logic for player movement or state changes
        // For now, we'll just print the position
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
