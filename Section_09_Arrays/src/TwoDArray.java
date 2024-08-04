import java.util.Scanner;

public class TwoDArray {
    private int[][] array;

     public void initializeAndPopulateArray(Scanner scanner) {
        get2DArrayInputFromUser(scanner);
    }

     private void get2DArrayInputFromUser(Scanner scanner) {
        System.out.println("Enter sizeX (number of rows): ");
        int sizeX = scanner.nextInt();
        System.out.println("Enter sizeY (number of columns): ");
        int sizeY = scanner.nextInt();

         array = new int[sizeX][sizeY];

        System.out.println("Enter the elements of the array:");
         for (int x = 0; x < sizeX; x++) {
            for (int y = 0; y < sizeY; y++) {
                System.out.printf("Element [%d][%d]: ", x, y);
                array[x][y] = scanner.nextInt();
            }
        }
    }

     public void printArray() {
        if (array == null) {
            System.out.println("Array not initialized.");
            return;
        }

        System.out.println("Array contents:");
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TwoDArray twoDArray = new TwoDArray();
        twoDArray.initializeAndPopulateArray(scanner);
        twoDArray.printArray();
        scanner.close();
    }
}
