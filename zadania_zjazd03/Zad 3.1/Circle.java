public class Circle {
//    A

    private double radius;
    private String color;
//
//    public Circle() {
//        radius = 0.0; // domyślna wartość promienia
//        color = "black"; // domyślna wartość koloru
//    }
//
//    public Circle(double radius) {
//        this.radius = radius;
//        color = "black"; // domyślna wartość koloru
//    }
//
//    public Circle(double radius, String color) {
//        this.radius = radius;
//        this.color = color;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public double getArea() {
//        double area = Math.PI * radius * radius;
//        return area;
//    }
//

//    C


//
//    public Circle() {
//        radius = 0.0;
//        color = "black";
//    }
//    public Circle(double radius) {
//        this.radius = radius;
//        color = "black";
//    }
//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//    public Circle(double radius, String color) {
//        this.radius = radius;
//        this.color = color;
//    }
//
//    public double getRadius() {
//        return radius;
//    }
//
//    public double getArea() {
//        double area = Math.PI * radius * radius;
//        return area;
//    }

//    D


    public Circle() {
        radius = 0.0;
        color = "black";
    }
    public Circle(double radius) {
        this.radius = radius;
        color = "black";
    }
//    E
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
//    E
    public String toString() {
        return "Circle " + "radius = " + radius + ", color = '" + color + "' ";
    }

}


