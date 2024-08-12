public class Rectangle {

    // Protected fields for length and breadth
    protected int length;
    protected int breadth;

    // Default constructor
    public Rectangle() {
        // Default values can be set here if needed
    }

    // Constructor with parameters (if needed)
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Setter method for length
    public void setLength(int length) {
        this.length = length;
    }

    // Setter method for breadth
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // Getter method for length (optional)
    public int getLength() {
        return length;
    }

    // Getter method for breadth (optional)
    public int getBreadth() {
        return breadth;
    }

    // Method to calculate the area of the rectangle
    public int area() {
        return length * breadth;
    }

    // Method to calculate the perimeter of the rectangle
    public int perimeter() {
        return 2 * (length + breadth);
    }
}
