import java.util.Scanner;

public class CalculateArea {
//formula = A= 1/2(b*h)
    //formula 2 = s=1/2(a+b+c)
    //A= ur(s(s-1)(s-b)(s-c))
    public static  void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String user = s.nextLine();

        System.out.println("Write base of triangle:");
        int b = s.nextInt();

        System.out.println("Write height of triangle:");
        int h = s.nextInt();

        double area = 0.5 * b * h;
        System.out.println("Hi "+ user+" Area of Triangle is: " + area);
    }
}
