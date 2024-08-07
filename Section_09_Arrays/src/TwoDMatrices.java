import java.util.Scanner;

public class TwoDMatrices {

    private int[][] A;
    private int[][] B;
    private int[][] C;
    private int[][] D; // To store the result of multiplication

    // Public method to initialize, populate, and perform operations on matrices
    public void matrices(Scanner scanner) {
        getInputFromUser(scanner);
        computeMatrixSum();  // Compute the sum of matrices A and B into C
        printMatrices();     // Print the matrices
        multiplyMatrices(); // Multiply matrices A and B and store the result in D
        printMultiplicationResult(); // Print the result of the multiplication
    }

    // Private method to get size and elements of matrices from the user
    private void getInputFromUser(Scanner scanner) {
        System.out.println("Enter sizeX (number of rows): ");
        int sizeX = scanner.nextInt();
        System.out.println("Enter sizeY (number of columns): ");
        int sizeY = scanner.nextInt();

        A = new int[sizeX][sizeY];
        B = new int[sizeX][sizeY];
        C = new int[sizeX][sizeY];
        D = new int[sizeX][sizeY]; // Initialize D with the same size

        getElements(sizeX, sizeY, scanner, A, "A");
        getElements(sizeX, sizeY, scanner, B, "B");
    }

    // Private method to populate a matrix with elements from the user
    private void getElements(int sizeX, int sizeY, Scanner scanner, int[][] matrix, String arrayName) {
        System.out.println("Enter the elements of matrix " + arrayName);
        for (int x = 0; x < sizeX; x++) {
            for (int y = 0; y < sizeY; y++) {
                System.out.printf("Element [%d][%d]: ", x, y);
                matrix[x][y] = scanner.nextInt();
            }
        }
    }

    // Private method to compute the sum of matrices A and B and store the result in C
    private void computeMatrixSum() {
        for (int x = 0; x < A.length; x++) {
            for (int y = 0; y < A[0].length; y++) {
                C[x][y] = A[x][y] + B[x][y];
            }
        }
    }

    // Private method to multiply matrices A and B and store the result in D
    private void multiplyMatrices() {
        int rowsA = A.length;
        int colsA = A[0].length;
        int rowsB = B.length;
        int colsB = B[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrix multiplication not possible: number of columns in A must equal number of rows in B.");
        }

        // Initialize matrix D with the appropriate size
        D = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                D[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    D[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }

    // Private method to print the matrices
    private void printMatrices() {
        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("Matrix B:");
        printMatrix(B);
        System.out.println("Matrix C (A + B):");
        printMatrix(C);
    }

    // Private method to print the result of matrix multiplication
    private void printMultiplicationResult() {
        System.out.println("Matrix D (A * B):");
        printMatrix(D);
    }

    // Private method to print a matrix with aligned columns
    private void printMatrix(int[][] matrix) {
        // Determine the maximum number of digits in the matrix elements for formatting
        int maxElementLength = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                maxElementLength = Math.max(maxElementLength, Integer.toString(element).length());
            }
        }

        // Print each row of the matrix
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%" + (maxElementLength + 1) + "d", element);
            }
            System.out.println();
        }
    }
}
