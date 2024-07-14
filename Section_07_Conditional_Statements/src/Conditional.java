import java.util.Scanner;

public class Conditional {

    public void evenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }

    public void youngOrOld(int age) {
        if (age >= 14 && age <= 55) {
            System.out.println("You are Young.");
        } else {
            System.out.println("You are Old.");
        }
    }

    public int readInt(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conditional conditional = new Conditional();

        // EVEN or ODD
        int number = conditional.readInt("Enter a number: ", scanner);
        conditional.evenOrOdd(number);

        // YOUNG or OLD
        int age = conditional.readInt("Enter age: ", scanner);
        conditional.youngOrOld(age);

        scanner.close();
    }
}
