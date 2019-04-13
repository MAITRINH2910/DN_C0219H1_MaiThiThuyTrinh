import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size1;
        do {
            System.out.print("Enter size of Array 1: ");
            size1 = sc.nextInt();
            if (size1 < 0) {
                System.out.println("Please check it again!");
            }
        } while (size1 < 0);
        int arr1[] = new int[size1];
        for (int i = 0; i < size1; i++) {
            arr1[i] = (int) (Math.random() * 100);
        }

        System.out.print("First Array: ");
        for (int i = 0; i < size1; i++) {
            System.out.print(arr1[i] + " ");
        }

        int size2;
        do {
            System.out.print("\nEnter size of Array 2: ");
            size2 = sc.nextInt();
            if (size2 < 0) {
                System.out.println("Please check it again!");
            }
        } while (size2 < 0);
        int arr2[] = new int[size2];
        for (int i = 0; i < size2; i++) {
            arr2[i] = (int) (Math.random() * 100);
        }
        System.out.print("Second Array: ");
        for (int i = 0; i < size2; i++) {
            System.out.print(arr2[i] + " ");
        }

        int size3 = size1 + size2;
        int arr3[] = new int[size3];
        for (int i = 0; i < size3; i++) {
            for (int j = 0; j < size1; j++) {
                if (j == i) {
                    arr3[i] = arr1[j];
                }
            }
        }

        for (int i = size1; i < size3; i++) {
            for (int j = 0; j < size2; j++) {
                if (i - j == size1) {
                    arr3[i] = arr2[j];
                }
            }
        }
        System.out.println();
        System.out.print("Third Array: ");
        for (int i = 0; i < size3; i++) {
            System.out.print(arr3[i] + " ");
        }


    }
}
