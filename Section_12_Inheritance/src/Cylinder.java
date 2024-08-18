public class Cylinder extends Circle{

    private double height;
    public Cylinder() {
        super();
        this.height=0;
    }
    public Cylinder(double radius, double height) {
        super(radius);
        setHeight(height);
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if(height<0){
            throw new IllegalArgumentException("Height must be a positive number");
        }
        this.height=height;
    }
    public void setDimensions(double radius, double height) {
        super.setRadius(radius);
        setHeight(height);
    }

    public double baseArea(){
        return super.getArea();
    }
    public double volume(){
        return baseArea()*getHeight();
    }

    public double lateralSurfaceArea(){
        return 2 * Math.PI * getRadius() * getHeight();
    }

    public double surfaceArea() {
        return (2 * baseArea()) + lateralSurfaceArea();
    }


}
