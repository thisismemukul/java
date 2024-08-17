package OopGame.mygame.scenes;

import OopGame.mygame.entities.Enemy;
import com.mygame.entities.Player;

/**
 * Represents a specific game scene.
 * Demonstrates inheritance by using game objects (Player, Enemy) and polymorphism.
 */
public class GameScene extends Scene {
    private Player player;
    private Enemy enemy;

    public GameScene() {
        // Initialize game objects
        player = new Player(100, 100, 100,20);
        enemy = new Enemy(200, 200, 20,10);
    }

    @Override
    public void update() {
        // Update all game objects in the scene
        player.update();
        enemy.update();
    }

    @Override
    public void render() {
        // Render all game objects in the scene
        player.render();
        enemy.render();
    }
}

