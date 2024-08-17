package OopGame.mygame.entities;

/**
 * Abstract base class for all game objects.
 * Demonstrates abstraction by hiding complex details and exposing a simple interface.
 */
public abstract class GameObject {
    protected int x,y; //Position of the game objects

    //Constructor
    public GameObject(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Abstract methods that must be implemented by subclasses

    public abstract void update();  // Update the state of the game object
    public abstract void render();  // Render the game object on the screen

}
