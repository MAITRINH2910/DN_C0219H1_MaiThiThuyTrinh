import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = sc.nextDouble();

        System.out.println("Enter b: ");
        double b = sc.nextDouble();

        System.out.println("Enter c: ");
        double c = sc.nextDouble();

        Account Equation = new Account(a, b, c);
        double delta = Equation.getDiscriminant();
        if (delta < 0) {
            System.out.println("The equation has no roots");
        } else if (delta == 0) {
            System.out.println("There 1 root: " + Equation.getRoot1());
        } else {
            System.out.println("There are 2 roots: x1= " + Equation.getRoot1() + " x2 = " + Equation.getRoot2());

        }

    }
}
