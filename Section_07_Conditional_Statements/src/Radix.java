import java.util.Scanner;

public class Radix {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        String number = sc.nextLine();

        if (number.matches("[01]+")){
        System.out.println("It  is a binary number, radix: 2 ");
        } else if (number.matches("[0-7]+")) {
        System.out.println("It  is a octal number, radix: 8 ");
        }else if (number.matches("[0-9]+")) {
            System.out.println("It  is a decimal number, radix: 10 ");
        }else if (number.matches("[0-9A-F]+")) {
            System.out.println("It  is a hexadecimal number: radix: 16 ");
        } else {
        System.out.println("Invalid number  ");
        }
    }
}
