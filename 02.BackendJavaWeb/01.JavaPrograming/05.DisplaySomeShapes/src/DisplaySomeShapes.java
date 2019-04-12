import java.util.Scanner;

public class DisplaySomeShapes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle(top-left) ");
            System.out.println("3. Print the square triangle(top-right) ");
            System.out.println("4. Print the square triangle(bottom-left) ");
            System.out.println("5. Print the square triangle(bottom-right) ");
            System.out.println("6. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 5; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Print the square triangle(top-left)");
                    for (int i = 1; i < 5; i++) {
                        int j;
                        for (j = 1; j < i; j++) {
                            System.out.print("");
                        }
                        for (int k = 1; k < 5 - j; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Print the square triangle(top-right)");
                    for (int i = 1; i <= 5; i++) {
                        int j;
                        for (j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 5 - j; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Print the square triangle(bottom-left)");
                    for (int i=1; i<=5; i++){
                        for (int j=1; j<=i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 5:
                    System.out.println("Print the square triangle(bottom-right)");
                    for (int i=1; i<=5 ; i++){
                        int j;
                        for (j=5; j>=i; j--){
                            System.out.print(" ");
                        }
                        for (int k=1; k<=i; k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                case 6:
                    System.out.println("Print isosceles triangle");
                    for (int i=1; i<=5 ; i++){
                        int j;
                        for (j=5; j>=i; j--){
                            System.out.print(" ");
                        }
                        for (int k=1; k<=i; k++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}


