import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Methods methods = new Methods();
        methods.playWithMethods(scanner);
        methods.overloaded();
        methods.practicingVariables();
        methods.recursion();
        scanner.close();
    }
}