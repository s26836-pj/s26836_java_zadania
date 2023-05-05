public class TestCircleAndCylinder {
        public static void main(String[] args) {
            Circle circle1 = new Circle();
            System.out.println(circle1);

            Circle circle2 = new Circle(2.0);
            System.out.println(circle2);

            Cylinder cylinder1 = new Cylinder();
            System.out.println(cylinder1);

            Cylinder cylinder2 = new Cylinder(3.0);
            System.out.println(cylinder2);

            Cylinder cylinder3 = new Cylinder(3.0, 5.0);
            System.out.println(cylinder3);

            System.out.println("Circle 2 area: " + circle2.getArea());
            System.out.println("Cylinder 1 volume: " + cylinder1.getVolume());
        }
    }

