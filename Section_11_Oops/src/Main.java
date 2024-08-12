public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Classes classes = new Classes();
        System.out.println("Concept: " + classes.getConceptName());
        classes.oopsConcepts();

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setBreadth(10);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());

        // Demonstrating ColoredRectangle class
        ColoredRectangle coloredRectangle = new ColoredRectangle(7, 14, "Red");
        coloredRectangle.displayDetails();
    }
}