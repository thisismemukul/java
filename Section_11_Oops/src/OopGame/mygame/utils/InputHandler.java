package OopGame.mygame.utils;

import java.util.Scanner;

/**
 * Utility class for handling user input.
 * Demonstrates encapsulation by managing input reading.
 */
public class InputHandler {
    private Scanner scanner;

    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    public String getInput() {
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }
}
