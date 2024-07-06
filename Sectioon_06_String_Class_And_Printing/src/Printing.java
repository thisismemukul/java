public class Printing {
    public static void main(String[] args) {
        int x = 9;
        int y = 8;
        int sum = x + y;

        // Using print
        System.out.print("print : ");
        System.out.print(sum);
        System.out.print("\n");

        // Using println
        System.out.println("println : ");
        System.out.println(sum);

        // Using printf
        System.out.printf("printf : %d%n", sum);

        // Using format
        System.out.format("format : %d%n", sum);
    }
}
