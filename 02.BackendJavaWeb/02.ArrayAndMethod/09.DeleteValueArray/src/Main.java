import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter size of Array: ");
        size = sc.nextInt();
        int[] a = new int[size];
        System.out.print("Origin Array: ");
        for (int i = 0; i < size; i++) {
            a[i] = (int) (Math.random()* 100);
            System.out.print(a[i] + " ");
        }
        int index;
        do {
            System.out.print("\nEnter any index: ");
            index = sc.nextInt();
            if (index < 0) {
                System.out.println("Please check it again");
            }
        } while (index < 0);

        for (int i = index + 1; i < size; i++) {
            a[i - 1] = a[i];

        }
        size -= 1;
        System.out.print("Array after deleting: ");

        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
