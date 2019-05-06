public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint mv = new MovablePoint();
        System.out.println(mv);

        mv = new MovablePoint(10,20);
        System.out.println("\n"+mv);

        mv = new MovablePoint(5, 10, 10, 20);
        System.out.println("\n"+mv);
        System.out.println("\nSpeed of Point is: ");
        mv.move();


    }
}
