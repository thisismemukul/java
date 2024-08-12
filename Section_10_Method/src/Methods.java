import java.util.Scanner;

public class Methods {

    private int a, b;

    // Existing method for arithmetic operations
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

    // Overloaded method examples
    public void overloaded() {
        // Area Calculation
        System.out.println("Area of a rectangle (length 5, width 7): " + calculateArea(5, 7));
        System.out.println("Area of a square (side 4): " + calculateArea(4));
        System.out.println("Area of a circle (radius 3): " + calculateArea(3.0));

        // Reverse Methods
        System.out.println("Reverse of integer 1234: " + reverse(1234));
        int[] array = {1, 2, 3, 4, 5};
        System.out.print("Reverse of array [1, 2, 3, 4, 5]: ");
        int[] reversedArray = reverse(array);
        for (int i : reversedArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Validation Methods
        System.out.println("Name and age validation: " + validate("Alice", 30));
        System.out.println("Name validation: " + validate("Bob"));
    }

    public void practicingVariables(){
        show();
        show(20,30);
        show(20,30,340,50);
        show(20,30,59,33,56,2,5,23,5532,234,23);
        show(new int [] {20,302,5,23,5532,234,23});
        show(20,30,59,33,56,2,5,23,5532,234,23);
    }

    private void show(int ...A){
        for (int x: A){
            System.out.println(x);
        }
    }

    public void recursion(){
        fun(3);
    }
    private void fun(int n){
        if(n>0){
            fun(n-1);
            System.out.println(n);
        }
    }

    // Area calculation (overloaded methods)
    public int calculateArea(int length, int width) {
        return length * width;
    }

    public int calculateArea(int side) {
        return side * side;
    }

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Reverse methods (overloaded methods)
    public int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    // Validation methods (overloaded methods)
    public boolean validate(String name, int age) {
        return name != null && !name.isEmpty() && age > 0;
    }

    public boolean validate(String name) {
        return name != null && !name.isEmpty();
    }

    // Existing arithmetic methods
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
            return 0; // or some error value
        }
    }

    // Method to take user input
    protected void takeInputFromUser(Scanner scanner) {
        System.out.println("Enter first number: ");
        a = scanner.nextInt();
        System.out.println("Enter second number: ");
        b = scanner.nextInt();
    }
}
