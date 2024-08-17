// A subclass of Rectangle that uses protected fields
public class ColoredRectangle extends Rectangle {

    // Additional field for color
    private String color;

    // Constructor
    public ColoredRectangle(int length, int breadth, String color) {
        super(length, breadth);  // Accessing the protected fields from the superclass
        this.color = color;
    }

    // Method to display details of the ColoredRectangle
    public void displayDetails() {
        System.out.println("Length: " + length);  // Accessing protected field
        System.out.println("Breadth: " + breadth);  // Accessing protected field
        System.out.println("Color: " + color);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}
