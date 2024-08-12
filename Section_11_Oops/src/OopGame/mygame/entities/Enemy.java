package OopGame.mygame.entities;

/**
 * Represents an enemy in the game.
 * Demonstrates encapsulation by managing the enemy's damage and position.
 */
public class Enemy extends GameObject {
    private int damage;  // Enemy's damage

    public Enemy(int x, int y, int damage) {
        super(x, y);  // Call the superclass constructor
        this.damage = damage;
    }

    @Override
    public void update() {
        // Example logic for enemy movement or state changes
        // For now, we'll just print the position
    }

    @Override
    public void render() {
        // Render enemy on screen
        System.out.println("Rendering enemy at (" + x + ", " + y + ")");
    }

    public int getDamage() {
        return damage;
    }
}
