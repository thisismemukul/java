import java.util.Scanner;

public class PracticingLoops {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        PracticingLoops loops = new PracticingLoops();
        int i = 1;

        loops.callWhile(i);
        loops.callDoWhile(i);
        loops.forLoop(i);
        // loops.infiniteForLoop();
        loops.multipleArgsInForLoop();

//        System.out.println("Enter a number to print table: ");
//        int number = scanner.nextInt();
//        loops.tableProgramme(number);
//
//        System.out.println("Enter a number to calculate sum of N: ");
//        int N = scanner.nextInt();
//        loops.sumOfN(N);
//
//        loops.sumOfNumbers();
//
//        System.out.println("Enter a number to calculate factorial of a number: ");
//        number = scanner.nextInt();
//        loops.factorialOfANumIterative(number);
//        loops.calculateFactorialRecursive(number);

        System.out.println("Enter a number to display digits: ");
        int number = scanner.nextInt();
        loops.displayDigits(number);
        loops.countDigitsOfNumber(number);
        loops.armstrongNumber(number);
        loops.reverseNumber(number);
        loops.palindromeNumber(number);
        scanner.close();
    }

    public void callWhile(int i) {
        while (i < 100) {
            System.out.println(i);
            i *= 2;
        }
    }

    public void callDoWhile(int i) {
        do {
            System.out.println(i);
            i *= 2;
        } while (i < 100);
    }

    public void forLoop(int i) {
        for (i = 1; i <= 10; i++) {
            System.out.println("i: " + i);
        }
    }

    public void infiniteForLoop() {
        for (; ; ) {
            System.out.println("I am infinity :)");
        }
    }

    public void multipleArgsInForLoop() {
        for (int i = 1, j = 1; j <= 1000; i++, j *= 2) {
            System.out.println("i: " + i + "\t" + "j: " + j);
        }
    }

    public void tableProgramme(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

    public void sumOfN(int numbers) {
        int sum = 0;
        for (int i = 1; i <= numbers; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + numbers + " natural numbers is: " + sum);
    }

    public void sumOfNumbers() {
        double sum = 0;

        System.out.println("Enter numbers to calculate their sum. Type 'done' to finish:");
        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                double number = Double.parseDouble(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or type 'done' to finish.");
            }
        }
        System.out.println("The sum of the entered numbers is: " + sum);
    }

    public void factorialOfANumIterative(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial is : " + factorial);
    }

    public long calculateFactorialRecursive(int number) {
        if (number == 0) {
            return 1;
        } else {
            long result = number * calculateFactorialRecursive(number - 1);
            System.out.println("Calculated factorial(" + number + ") = " + number + " * factorial(" + (number - 1) + ")");
            return result;
        }
    }

    public void displayDigits(int number) {
        StringBuilder digits = new StringBuilder();
        System.out.println("here");
        while (number > 0) {
            int digit = number % 10;
            digits.append(digit).append(" ");
            number /= 10;
        }
        System.out.println(digits.reverse().toString().trim());
    }

    public void countDigitsOfNumber(int number) {
        int digits = 0;
        while (number > 0) {
            digits++;
            number /= 10;
        }
        System.out.println("total number of digits : " + digits);
    }

    public void armstrongNumber(int number) {
        int originalNumber = number;
        int sumOfCubes = 0;
        while (number > 0) {
            int digit = number % 10;
            sumOfCubes += digit * digit * digit;
            number /= 10;
        }

        if (sumOfCubes == originalNumber) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }

    public int reverseNumber(int number){
        int reversedNumber=0;
        while (number>0){
            int digit = number%10;
            reversedNumber = reversedNumber * 10 + digit;
            number/=10;
        }
        System.out.println("reversedNumber : "+ reversedNumber);
        return reversedNumber;
    }

    public void palindromeNumber(int number){
        int reversedNumber = reverseNumber(number);
        if(reversedNumber==number){
            System.out.println("Number is a palindrome number");
        }else {
            System.out.println("Number is not a palindrome number");
        }
    }
}
