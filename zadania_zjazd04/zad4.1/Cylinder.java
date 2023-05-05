public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 4.0;
    }

    public Cylinder(double radius) {
        super(radius);
        this.height = 4.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    public String toString() {
        return "Cylinder [radius=" + getRadius() + ", height=" + height + ", color=" + super.toString() + "]";
    }
}