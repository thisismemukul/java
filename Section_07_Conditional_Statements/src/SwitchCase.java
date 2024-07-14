import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer between 1 and 3:");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("Integer: You chose 1");
                break;
            case 2:
                System.out.println("Integer: You chose 2");
                break;
            case 3:
                System.out.println("Integer: You chose 3");
                break;
            default:
                System.out.println("Integer: Invalid choice");
                break;
        }

        // Scenario 2: Switch with char
        System.out.println("Enter a character (a, b, c):");
        char letter = scanner.next().charAt(0);
        switch (letter) {
            case 'a':
                System.out.println("Character: You chose 'a'");
                break;
            case 'b':
                System.out.println("Character: You chose 'b'");
                break;
            case 'c':
                System.out.println("Character: You chose 'c'");
                break;
            default:
                System.out.println("Character: Invalid choice");
                break;
        }

        // Scenario 3: Switch with String
        System.out.println("Enter a string (one, two, three):");
        String text = scanner.next();
        switch (text) {
            case "one":
                System.out.println("String: You chose 'one'");
                break;
            case "two":
                System.out.println("String: You chose 'two'");
                break;
            case "three":
                System.out.println("String: You chose 'three'");
                break;
            default:
                System.out.println("String: Invalid choice");
                break;
        }

        // Scenario 4: Switch with fall-through
        System.out.println("Enter a number between 4 and 6 for fall-through example:");
        int fallThroughNumber = scanner.nextInt();
        switch (fallThroughNumber) {
            case 4:
                System.out.println("Fall-through: You chose 4");
                // Notice no break statement here
            case 5:
                System.out.println("Fall-through: Now you're at 5");
                // Notice no break statement here
            case 6:
                System.out.println("Fall-through: Finally at 6");
                break;
            default:
                System.out.println("Fall-through: Invalid choice");
                break;
        }

        // Scenario 5: Nested switch statements
        System.out.println("Enter an integer (1 or 2) for nested switch example:");
        int outerNumber = scanner.nextInt();
        switch (outerNumber) {
            case 1:
                System.out.println("Outer switch: You chose 1");
                System.out.println("Enter a character (x or y) for inner switch:");
                char innerChar = scanner.next().charAt(0);
                switch (innerChar) {
                    case 'x':
                        System.out.println("Inner switch: You chose 'x'");
                        break;
                    case 'y':
                        System.out.println("Inner switch: You chose 'y'");
                        break;
                    default:
                        System.out.println("Inner switch: Invalid choice");
                        break;
                }
                break;
            case 2:
                System.out.println("Outer switch: You chose 2");
                break;
            default:
                System.out.println("Outer switch: Invalid choice");
                break;
        }

        scanner.close();
    }
}
