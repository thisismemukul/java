public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Circle circle = new Circle();
        circle.setRadius(2);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(3);
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println(cylinder);


    }
}