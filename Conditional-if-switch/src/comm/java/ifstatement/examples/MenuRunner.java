package comm.java.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter Number 2: ");
        int number2 = scanner.nextInt();

        System.out.println("Choices available are:- ");
        System.out.println("1-Add");
        System.out.println("2-Sub");
        System.out.println("3-Mul");
        System.out.println("4-Div");

        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        System.out.println("First number you entered is : "+ number1);
        System.out.println("Second number you entered is : "+ number2);
        System.out.println("Choice is : "+ choice);
        performOperationUsingNestedIfElse(number1,number2,choice);
        performOperationUsingNestedSwitch(number1,number2,choice);
    }
    public static void performOperationUsingNestedIfElse(int number1, int number2,int choice){
        if(choice==1){
            System.out.println("Result: "+ (number1+number2));
        }else if(choice==2){
            System.out.println("Result: "+ (number1-number2));
        }else if(choice==3){
            System.out.println("Result: "+ (number1*number2));
        }else if(choice==4){
            System.out.println("Result: "+ (number1/number2));
        }else System.out.println("Invalid option :(");
    }
    public static void performOperationUsingNestedSwitch(int number1,int number2,int choice){
        switch (choice){
            case 1:
                System.out.println("Result: "+ (number1+number2));
                break;
            case 2:
                System.out.println("Result: "+ (number1-number2));
                break;
            case 3:
                System.out.println("Result: "+ (number1*number2));
                break;
            case 4:
                System.out.println("Result: "+ (number1/number2));
                break;
            default:
                System.out.println("Invalid option :(");
        }
    }
}
