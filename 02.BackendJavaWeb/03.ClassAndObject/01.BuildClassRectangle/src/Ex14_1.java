import java.util.Scanner;

public class Ex14_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the width: ");
        double width = sc.nextDouble();

        System.out.print("\nEnter the height: ");
        double height = sc.nextDouble();

        Rectangle rec1 = new Rectangle(width, height);

        System.out.println("Your Rectangle \n" + rec1.display());
        System.out.println("Perimeter  of the Rectangle: " + rec1.getPerimeter());
        System.out.println("Area of the Rectangle: " + rec1.getArea());

    }
}
