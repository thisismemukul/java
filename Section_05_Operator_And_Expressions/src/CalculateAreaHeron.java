import java.util.Scanner;

public class CalculateAreaHeron {

    //formula 2 = s=1/2(a+b+c)
    //A= ur(s(s-1)(s-b)(s-c))

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Your name : ");
        String user = s.nextLine();

        System.out.println("Enter side a of triangle : ");
        double sideA = s.nextInt();

        System.out.println("Enter side b of triangle : ");
        double sideB = s.nextInt();

        System.out.println("Enter side c of triangle : ");
        double sideC = s.nextInt();

        double semiPerimeter = (sideA + sideB + sideC) /2;

        double heronArea = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));

        System.out.println("Hi "+ user+" Area of the triangle is : "+ heronArea);
    }
}
