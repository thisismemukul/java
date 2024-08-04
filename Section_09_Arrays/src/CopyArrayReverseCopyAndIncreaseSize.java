import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayReverseCopyAndIncreaseSize {
    private int[] array;

    public void playWithArray(Scanner scanner) {
        getArrayInputFromUser(scanner);
        boolean exit = false;
        while (!exit) {
            System.out.println("Choose an operation:");
            System.out.println("1. Copy array");
            System.out.println("2. Reverse copy array");
            System.out.println("3. Increase size of array");
            System.out.println("4. Print array");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    copyArray();
                    break;
                case 2:
                    reverseCopyArray();
                    break;
                case 3:
                    increaseSizeOfArray(scanner);
                    break;
                case 4:
                    printArray();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void getArrayInputFromUser(Scanner scanner) {
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
    }

    private void copyArray() {
        int[] copiedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
    }

    private void reverseCopyArray() {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        System.out.println("Reversed copied array: " + Arrays.toString(reversedArray));
    }

    private void increaseSizeOfArray(Scanner scanner) {
        System.out.println("Enter the new size of the array:");
        int newSize = scanner.nextInt();

        if (newSize <= array.length) {
            System.out.println("New size must be greater than current size.");
            return;
        }

        int[] newArray = new int[newSize];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
        System.out.println("Array size increased to " + newSize + ". Current array: " + Arrays.toString(array));
    }

    private void printArray() {
        System.out.println("Current array: " + Arrays.toString(array));
    }
}
