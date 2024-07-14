import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int y = sc.nextInt();
        if ((y % 400 == 0) || (y % 100 != 0) && (y % 4 == 0)) {
            System.out.println("Year " + y + " is a leap year.");
        } else {
            System.out.println("Year " + y + " is not a leap year.");
        }
    }
}
