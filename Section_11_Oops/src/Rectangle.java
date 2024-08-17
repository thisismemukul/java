public class Rectangle {

    // Protected fields for length and breadth
    protected int length;
    protected int breadth;

    // Default constructor
    public Rectangle() {
        // Default values can be set here if needed
        length=0;
        breadth=0;
    }

    // Constructor with parameters (if needed)
    public Rectangle(int length, int breadth) {
        setLength(length);
        this.breadth = breadth;
    }

    // Constructor with same parameters (if needed)
    public Rectangle(int side) {
        this.length = this.breadth = side;
    }

    // Setter method for length
    public void setLength(int length) {
        this.length = Math.max(length, 0);
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
        return getLength() * getBreadth();
    }

    // Method to calculate the perimeter of the rectangle
    public int perimeter() {
        return 2 * (getLength() + getBreadth());
    }
}
