# Game Development Using Object-Oriented Programming (OOP) Concepts

## Overview

This project demonstrates the use of Object-Oriented Programming (OOP) principles to build a simple game. The game includes basic movement for `Player` and `Enemy` entities and uses various OOP concepts to manage game objects and scenes.

## OOP Concepts Used

### Encapsulation

**Encapsulation** is the concept of bundling data and methods that operate on that data within a single unit, usually a class. It helps in hiding the internal state and requiring all interactions to be performed through the object's methods.

- **Player and Enemy Classes:**
    - **Player Class:** Encapsulates the player's state (e.g., `health`, `x`, `y`) and provides methods like `move(int dx, int dy)` and `getHealth()` to interact with this state.
    - **Enemy Class:** Encapsulates the enemy's state (e.g., `damage`, `x`, `y`) and provides methods like `getDamage()` to interact with this state.
    - **Example:**
      ```java
      public class Player extends GameObject {
          private int health;
          private int speed;
  
          public Player(int x, int y, int health, int speed) {
              super(x, y);
              this.health = health;
              this.speed = speed;
          }
  
          @Override
          public void update() {
              x += speed;
              System.out.println("Player position: (" + x + ", " + y + ")");
          }
  
          public void move(int dx, int dy) {
              x += dx;
              y += dy;
          }
  
          public int getHealth() {
              return health;
          }
      }
      ```

### Inheritance

**Inheritance** is a mechanism where one class acquires the properties and behavior of another class. It helps in reusing code and establishing a hierarchy.

- **Player and Enemy Classes:**
    - Both `Player` and `Enemy` classes inherit from the `GameObject` class. This inheritance provides common properties (`x`, `y`) and abstract methods (`update()`, `render()`) that each subclass implements.
    - **Example:**
      ```java
      public abstract class GameObject {
          protected int x, y;
  
          public GameObject(int x, int y) {
              this.x = x;
              this.y = y;
          }
  
          public abstract void update();
          public abstract void render();
      }
      ```

### Polymorphism

**Polymorphism** is the ability of a single function or method to work in different ways based on the object it is acting upon. It allows objects of different classes to be treated as objects of a common superclass.

- **GameScene Class:**
    - The `GameScene` class uses polymorphism by calling the `update()` and `render()` methods on `Player` and `Enemy` objects. Although both are of type `GameObject`, they provide different implementations of these methods.
    - **Example:**
      ```java
      @Override
      public void update() {
          player.update();
          enemy.update();
      }
      
      @Override
      public void render() {
          player.render();
          enemy.render();
      }
      ```

### Abstraction

**Abstraction** involves hiding complex implementation details and showing only the necessary features. It helps in managing complexity by providing a simplified view of the object.

- **GameObject and Scene Classes:**
    - **GameObject Class:** An abstract class that defines a common interface (`update()`, `render()`) without specifying how these methods should be implemented. Subclasses like `Player` and `Enemy` implement these methods.
    - **Scene Class:** An abstract class that provides a blueprint for different game scenes. Subclasses like `GameScene` implement the specific details of how to update and render the scene.
    - **Example:**
      ```java
      public abstract class Scene {
          public abstract void update();
          public abstract void render();
      }
      ```
