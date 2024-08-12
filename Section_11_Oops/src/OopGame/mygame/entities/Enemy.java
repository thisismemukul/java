package OopGame.mygame.entities;

/**
 * Represents an enemy in the game.
 * Demonstrates encapsulation by managing the enemy's damage and position.
 */
public class Enemy extends GameObject {
    private int damage;  // Enemy's damage
    private int speed;   // Speed at which the enemy moves

    public Enemy(int x, int y, int damage, int speed) {
        super(x, y);  // Call the superclass constructor
        this.damage = damage;
        this.speed = speed;
    }

    @Override
    public void update() {
        // Example logic for enemy movement: Move left by `speed` units each update
        x -= speed;
        // Print the position to visualize movement
        System.out.println("Enemy position: (" + x + ", " + y + ")");
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
