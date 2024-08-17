/**
 * Represents a cylinder with a specific height and radius.
 */
public class Cylinder {
    private double height;
    private double radius;

    /**
     * Default constructor that initializes height and radius to 0.0.
     */
    public Cylinder() {
        this.height = 0.0;
        this.radius = 0.0;
    }

    /**
     * Constructor to initialize a cylinder with the same height and radius.
     *
     * @param side the value for both height and radius
     */
    public Cylinder(double side) {
        this(side, side);
    }

    /**
     * Constructor to initialize a cylinder with specific height and radius.
     *
     * @param height the height of the cylinder
     * @param radius the radius of the cylinder
     */
    public Cylinder(double height, double radius) {
        setHeight(height);
        setRadius(radius);
    }

    /**
     * Gets the height of the cylinder.
     *
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Gets the radius of the cylinder.
     *
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the height of the cylinder.
     *
     * @param height the height to set
     * @throws IllegalArgumentException if height is non-positive
     */
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height must be positive.");
        }
    }

    /**
     * Sets the radius of the cylinder.
     *
     * @param radius the radius to set
     * @throws IllegalArgumentException if radius is non-positive
     */
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius must be positive.");
        }
    }

    /**
     * Sets both the height and radius of the cylinder.
     *
     * @param height the height to set
     * @param radius the radius to set
     */
    public void setDimensions(double height, double radius) {
        setHeight(height);
        setRadius(radius);
    }

    /**
     * Calculates the volume of the cylinder.
     *
     * @return the volume
     */
    public double volume() {
        return baseArea() * getHeight();
    }

    /**
     * Calculates the total surface area of the cylinder.
     *
     * @return the surface area
     */
    public double surfaceArea() {
        return (2 * baseArea()) + lateralSurfaceArea();
    }

    /**
     * Calculates the area of the base of the cylinder.
     *
     * @return the base area
     */
    public double baseArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    /**
     * Calculates the lateral surface area of the cylinder.
     *
     * @return the lateral surface area
     */
    public double lateralSurfaceArea() {
        return 2 * Math.PI * getRadius() * getHeight();
    }
}