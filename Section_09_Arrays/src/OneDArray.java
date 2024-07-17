import java.util.Scanner;

public class OneDArray {
    private int[] arrayA = {0, 0, 0, 0, 0};
    private int[] arrayB = {1, 2, 3, 4, 5};
    private int[] arrayC = {0, 0, 0, 0, 0};
    private int[] arrayD = {0, 0, 9, 0, 0};

    public void initOneDArray(Scanner scanner) {
        printArray("Array A:", arrayA);
        printArray("Array B:", arrayB);
        printArray("Array C:", arrayC);
        printArray("Array D:", arrayD);

        int sum = calculateSum(arrayB);
        System.out.println("Sum of array elements: ");
        System.out.println("SUM: " + sum);

        System.out.println("Enter an element to search:");
        int elementToSearch = scanner.nextInt();

        searchElement(arrayB, elementToSearch);
        searchElementWithForEach(arrayB, elementToSearch);
        findMaxElement(arrayB);
        findSecondLargestElement(arrayB);
        findSecondMaxElement(arrayB);
    }

    private void printArray(String message, int[] array) {
        System.out.println(message);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private int calculateSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    private void searchElement(int[] array, int element) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println("Element " + element + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No Element Found");
        }
    }

    private void searchElementWithForEach(int[] array, int element) {
        boolean found = false;
        int index = 0;
        for (int value : array) {
            if (value == element) {
                System.out.println("Element " + element + " found at index " + index);
                found = true;
                break;
            }
            index++;
        }
        if (!found) {
            System.out.println("No Element Found");
        }
    }

    public void findMaxElement(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max Element is " + max);
    }

    private void findSecondLargestElement(int[] array) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int value : array) {
            if (value > max1) {
                max2 = max1;
                max1 = value;
            } else if (value > max2 && value != max1) {
                max2 = value;
            }
        }

        System.out.println("The two largest elements are: " + max1 + " and " + max2);
    }

    public void findSecondMaxElement(int[] array) {
        int max1, max2;
        max1 = max2 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max1) {
                max2 = max1;
                max1 = array[i];
            } else if (array[i] > max2) {
                max2 = array[i];
            }
        }
        System.out.println("The second max element is : " + max2);

    }
}
