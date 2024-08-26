/**
 * Represents a cylinder with a specific radius and height.
 */
public class Cylinder extends Circle {
    private double height;

    /**
     * Default constructor that initializes the radius and height to 0.
     */
    public Cylinder() {
        super();
        this.height = 0;
    }

    /**
     * Parameterized constructor that initializes the radius and height to the specified values.
     *
     * @param radius the radius of the cylinder's base
     * @param height the height of the cylinder
     * @throws IllegalArgumentException if the radius or height is negative
     */
    public Cylinder(double radius, double height) {
        super(radius);
        setHeight(height); // Utilize the setter for validation
    }

    /**
     * Returns the height of the cylinder.
     *
     * @return the height of the cylinder
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the cylinder.
     *
     * @param height the new height of the cylinder
     * @throws IllegalArgumentException if the height is negative
     */
    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height must be a non-negative number");
        }
        this.height = height;
    }

    /**
     * Sets the radius and height of the cylinder.
     *
     * @param radius the new radius of the cylinder's base
     * @param height the new height of the cylinder
     */
    public void setDimensions(double radius, double height) {
        super.setRadius(radius);
        setHeight(height);
    }

    /**
     * Returns the area of the cylinder's base.
     *
     * @return the base area of the cylinder
     */
    public double getBaseArea() {
        return super.getArea();
    }

    /**
     * Calculates the volume of the cylinder.
     *
     * @return the volume of the cylinder
     */
    public double getVolume() {
        return getBaseArea() * getHeight();
    }

    /**
     * Calculates the lateral surface area of the cylinder.
     *
     * @return the lateral surface area of the cylinder
     */
    public double getLateralSurfaceArea() {
        return 2 * Math.PI * getRadius() * getHeight();
    }

    /**
     * Calculates the total surface area of the cylinder.
     *
     * @return the total surface area of the cylinder
     */
    public double getSurfaceArea() {
        return 2 * getBaseArea() + getLateralSurfaceArea();
    }

    /**
     * Returns a string representation of the cylinder.
     *
     * @return a string representation of the cylinder
     */
    @Override
    public String toString() {
        return "Cylinder [radius=" + getRadius() + ", height=" + height + "]";
    }
}