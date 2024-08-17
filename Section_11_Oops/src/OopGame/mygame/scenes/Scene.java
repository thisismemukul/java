package OopGame.mygame.scenes;

/**
 * Abstract base class for game scenes.
 * Demonstrates abstraction by defining a general interface for different scenes.
 */
public abstract class Scene {
    public abstract void update();  // Update scene state
    public abstract void render();  // Render scene objects
}
