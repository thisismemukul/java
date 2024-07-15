import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first term of AP (a): ");
        int firstTermAP = scanner.nextInt();
        System.out.print("Enter the common difference (d): ");
        int commonDifference = scanner.nextInt();
        System.out.print("Enter the number of terms for AP (n): ");
        int numberOfTermsAP = scanner.nextInt();
        generateAPSeries(firstTermAP, commonDifference, numberOfTermsAP);

        System.out.print("\nEnter the first term of GP (a): ");
        int firstTermGP = scanner.nextInt();
        System.out.print("Enter the common ratio (r): ");
        double commonRatio = scanner.nextDouble();
        System.out.print("Enter the number of terms for GP (n): ");
        int numberOfTermsGP = scanner.nextInt();
        generateGPSeries(firstTermGP, commonRatio, numberOfTermsGP);

        System.out.print("\nEnter the number of terms for Fibonacci series (n): ");
        int numberOfTermsFibonacci = scanner.nextInt();
        System.out.print("Choose method for Fibonacci series - 1 for Iterative, 2 for Recursive: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            generateFibonacciSeriesIterative(numberOfTermsFibonacci);
        } else if (choice == 2) {
            generateFibonacciSeriesRecursive(numberOfTermsFibonacci);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    public static void generateAPSeries(int a, int d, int n) {
        System.out.println("The AP series is:");
        for (int i = 0; i < n; i++) {
            int term = a + (i * d);
            System.out.print(term + " ");
        }
        System.out.println();
    }

    public static void generateGPSeries(int a, double r, int n) {
        System.out.println("The GP series is:");
        for (int i = 0; i < n; i++) {
            double term = a * Math.pow(r, i);
            System.out.print(term + " ");
        }
        System.out.println();
    }

    public static void generateFibonacciSeriesIterative(int n) {
        int firstTerm = 0, secondTerm = 1;
        System.out.println("The Fibonacci series (Iterative) is:");
        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
    }

    public static void generateFibonacciSeriesRecursive(int n) {
        System.out.println("The Fibonacci series (Recursive) is:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        System.out.println("Calculated fibonacci(" + n + ") = " + result);
        return result;
    }
}
