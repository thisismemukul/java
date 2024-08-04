import java.util.Scanner;
import java.util.Arrays;

public class RotateInsertOneDArray {
    private int[] array;

    public void playWithArray(Scanner scanner) {
        getArrayInputFromUser(scanner);
        boolean exit = false;
        while (!exit) {
            System.out.println("Choose an operation:");
            System.out.println("1. Rotate array");
            System.out.println("2. Insert element");
            System.out.println("3. Delete element");
            System.out.println("4. Print array");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    rotateArray(scanner);
                    break;
                case 2:
                    insertElement(scanner);
                    break;
                case 3:
                    deleteElement(scanner);
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

    private void rotateArray(Scanner scanner) {
        System.out.println("Enter the number of positions to rotate (positive for right, negative for left):");
        int positions = scanner.nextInt();
        int n = array.length;
        positions = positions % n;
        if (positions < 0) {
            positions += n;
        }
        reverseArray(0, n - 1);
        reverseArray(0, positions - 1);
        reverseArray(positions, n - 1);
    }

    private void reverseArray(int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    private void insertElement(Scanner scanner) {
        System.out.println("Enter the position to insert the element:");
        int position = scanner.nextInt();
        System.out.println("Enter the element to insert:");
        int element = scanner.nextInt();

        if (position < 0 || position > array.length) {
            System.out.println("Invalid position. Please try again.");
            return;
        }

        array = Arrays.copyOf(array, array.length + 1);

        for (int i = array.length - 1; i > position; i--) {
            array[i] = array[i - 1];
        }

        array[position] = element;
    }

    private void deleteElement(Scanner scanner) {
        System.out.println("Enter the position of the element to delete:");
        int position = scanner.nextInt();

        if (position < 0 || position >= array.length) {
            System.out.println("Invalid position. Please try again.");
            return;
        }

        for (int i = position; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array = Arrays.copyOf(array, array.length - 1);
    }

    private void printArray() {
        System.out.println("Current array: " + Arrays.toString(array));
    }

}
