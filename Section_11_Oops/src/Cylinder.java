public class Cylinder {
    private double height;
    private double radius;

    public Cylinder() {
        height = 0.0;
        radius = 0.0;
    }

    public Cylinder(double side) {
        setRadius(side);
        setHeight(side);
    }

    public Cylinder(double height, double radius) {
        setHeight(height);
        setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height cannot be negative");
        }
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
    }

    public void setDimensions(double height, double radius) {
        setHeight(height);
        setRadius(radius);
    }

    public double volume(){
        return baseArea() * getHeight();
    }

    public double surfaceArea(){
        return (2 * baseArea()) + 2 * Math.PI * getRadius() * getHeight();
    }

    public double baseArea(){
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double lateralSurfaceArea(){
        return 2* Math.PI * getRadius() * getHeight();
    }
}
