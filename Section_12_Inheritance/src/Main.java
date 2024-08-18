public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Circle circle = new Circle();
        circle.setRadius(2);
        System.out.println("Circle:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Cylinder cylinder = new Cylinder();
        cylinder.setDimensions(3, 5); // Set both radius and height
        System.out.println("Cylinder:");
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Volume: " + cylinder.getVolume());
        System.out.println("Surface Area: " + cylinder.getSurfaceArea());
        System.out.println("Lateral Surface Area: " + cylinder.getLateralSurfaceArea());
        System.out.println(cylinder);

        try {
            circle.setRadius(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            cylinder.setHeight(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}