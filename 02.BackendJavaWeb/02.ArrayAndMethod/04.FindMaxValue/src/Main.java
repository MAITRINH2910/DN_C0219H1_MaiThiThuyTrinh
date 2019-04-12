import java.util.Scanner;

public class Main {
    public static void NhapMang(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }
    }

    public static void XuatMang(int arr[],int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public static void findMaxValue(int arr[]) {
        int Max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Max) {
                Max = arr[i];
            }
        }
        System.out.println("The largest property value in the list is: " + Max);
    }

    public static int findMinValue(int arr[]) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    public static void swapValue(int arr[], int size) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[size - 1 - i];
            arr[size - 1 - i] = temp;
        }
    }

    public static void displaySwapValue(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] arr;

        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        arr = new int[size];


        NhapMang(arr);
        System.out.println("Array: ");
        XuatMang(arr,size);
        findMaxValue(arr);
        swapValue(arr, size);
        System.out.println("Reverse array: ");
        displaySwapValue(arr);
        System.out.println();
        findMaxValue(arr);

        int value = findMinValue(arr);
        System.out.println("The smallest element in the array is: " + value);

    }
}
