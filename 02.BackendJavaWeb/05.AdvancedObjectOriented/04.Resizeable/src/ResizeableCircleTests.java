import resizeable.Resizeable;

public class ResizeableCircleTests {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(1);
        circles[1] = new Circle(2);
        circles[2] = new Circle(3, "indigo", false);

        int i=0;
        System.out.println("Pre - Area: ");
        for (Circle circle : circles) {
            i++;
            System.out.println("Area"+i+": "+circle.getArea());
        }

        System.out.println("After - Area: ");
        for (Circle circle : circles) {
            circle.resize(200);
        }
    }
}