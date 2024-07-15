public class Patterns {
    public static void main(String[] args) {
        Patterns patterns = new Patterns();
        patterns.printStar();
        patterns.printStar1();
        patterns.printSquare(5);
        patterns.printRightAngledTriangle(5);
        patterns.printInvertedRightAngledTriangle(5);
        patterns.printPyramid(5);
        patterns.printDiamond(5);
        patterns.printHollowSquare(5);
    }

    public void printStar() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j >= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void printStar1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j + i > 5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printRightAngledTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printInvertedRightAngledTriangle(int size) {
        for (int i = size; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printPyramid(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printDiamond(int size) {
        // Upper part of the diamond
        for (int i = 1; i <= size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = size - 1; i >= 1; i--) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printHollowSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
