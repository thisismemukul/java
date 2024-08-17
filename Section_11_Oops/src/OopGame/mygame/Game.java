package OopGame.mygame;


import OopGame.mygame.scenes.GameScene;

/**
 * Main entry point for the game.
 * Demonstrates encapsulation by managing game state through methods.
 */
public class Game {
    private GameScene currentScene;

    public Game() {
        // Initialize the game scene
        currentScene = new GameScene();
    }

    public void start() {
        // Main game loop
        while (true) {
            currentScene.update();  // Update game state
            currentScene.render();  // Render game objects
            try {
                Thread.sleep(100);  // Slow down the loop to make it viewable
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
