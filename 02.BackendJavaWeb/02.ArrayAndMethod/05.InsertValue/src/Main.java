import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int arr[] = {5, 7, 91, 14};
        int size = 4;
        Scanner sc = new Scanner(System.in);
        int index;
        do {
            System.out.print("Enter index you want to insert: ");
            index = sc.nextInt();
            if (index < 0 || index > arr.length) {
                System.out.println("Cannot insert!");
            }
        }
        while (index < 0 || index > arr.length);

        System.out.print("Enter value you want to insert: ");
        int number = sc.nextInt();

        System.out.print("\nOriginal Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int size1 = size + 1;
        int arr1[] = new int[size1];

        if (index == 0) {
            arr1[0] = number;

            for (int i = 1; i < size1; i++) {
                for (int j = 0; j < size; j++) {
                    if (j + 1 == i) {
                        arr1[i] = arr[j];
                    }
                }
            }
        } else {
            for (int i = 0; i < size1; i++) {
                for (int j = 0; j < size; j++) {
                    if (j == i) {
                        arr1[i] = arr[j];
                    } else if (index == i) {
                        arr1[i] = number;
                    }
                }
            }
            for (int i = index; i < size1; i++) {
                for (int j = index; j < size; j++) {
                    if (j + 1 == i) {
                        arr1[i] = arr[j];
                    }
                }
            }
        }
        System.out.print("\nArray after inserting: ");
        for (int i = 0; i < size1; i++) {
            System.out.print(arr1[i] + " ");
        }


    }
}
