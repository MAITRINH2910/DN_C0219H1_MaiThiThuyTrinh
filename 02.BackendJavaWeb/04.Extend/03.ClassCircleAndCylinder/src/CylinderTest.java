public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(1.5);
        System.out.println(cylinder);

        cylinder = new Cylinder(2, " purple",3);
        System.out.println(cylinder);
    }
}
