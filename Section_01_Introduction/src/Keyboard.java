import java.util.Scanner;

public class Keyboard {
    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter Your name: ");
        String name = s.nextLine();
        System.out.print("Enter First Number: ");
        num1 = s.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = s.nextInt();
        int sum = num1 + num2;
        System.out.printf("Hi %s, Sum of %d and %d is %d\n", name, num1, num2, sum);
    }
}
