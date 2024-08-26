/**
 * Represents a circle with a specific radius.
 */
public class Circle {
    private double radius;

    /**
     * Default constructor that initializes the radius to 0.
     */
    public Circle() {
        this.radius = 0;
    }

    /**
     * Parameterized constructor that initializes the radius to the specified value.
     *
     * @param radius the radius of the circle
     * @throws IllegalArgumentException if the radius is negative
     */
    public Circle(double radius) {
        setRadius(radius); // Utilize the setter for validation
    }

    /**
     * Returns the radius of the circle.
     *
     * @return the radius of the circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the circle.
     *
     * @param radius the new radius of the circle
     * @throws IllegalArgumentException if the radius is negative
     */
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius must be a non-negative number");
        }
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     *
     * @return the area of the circle
     */
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    /**
     * Calculates the perimeter (circumference) of the circle.
     *
     * @return the perimeter of the circle
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Returns a string representation of the circle.
     *
     * @return a string representation of the circle
     */
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}
