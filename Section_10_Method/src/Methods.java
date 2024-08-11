import java.util.Scanner;

public class Methods {

    private int a, b;

    public void playWithMethods(Scanner scanner) {
        takeInputFromUser(scanner);
        boolean exit = false;
        while (!exit) {
            System.out.println("Choose an Operation: ");
            System.out.println("1. Find Max");
            System.out.println("2. Find Sum");
            System.out.println("3. Find Sub");
            System.out.println("4. Find Mul");
            System.out.println("5. Find Div");
            System.out.println("6. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> System.out.println("Max: " + findMax(a, b));
                case 2 -> System.out.println("Sum: " + findSum(a, b));
                case 3 -> System.out.println("Sub: " + findSub(a, b));
                case 4 -> System.out.println("Mul: " + findMul(a, b));
                case 5 -> System.out.println("Div: " + findDiv(a, b));
                case 6 -> exit = true;
                default -> System.out.println("Invalid choice, please try again!!!");
            }
        }
    }

    private int findSum(int x, int y) {
        return x + y;
    }

    private int findMax(int x, int y) {
        return (x >= y) ? x : y;
    }

    private int findSub(int x, int y) {
        return x - y;
    }

    private int findMul(int x, int y) {
        return x * y;
    }

    private int findDiv(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }

    protected void takeInputFromUser(Scanner scanner) {
        System.out.println("Enter first number: ");
        a = scanner.nextInt();
        System.out.println("Enter second number: ");
        b = scanner.nextInt();
    }
}
