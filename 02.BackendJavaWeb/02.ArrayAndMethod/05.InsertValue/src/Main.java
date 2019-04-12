import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int size=4;
        Scanner sc = new Scanner(System.in);
        int index;
        do {
            System.out.println("Enter index you want to insert: ");
            index = sc.nextInt();
            if (index < 0 || index > arr.length) {
                System.out.println("Cannot insert!");
            }
        }
        while (index < 0 || index > arr.length);

        System.out.println("Enter value you want to insert: ");
        int number = sc.nextInt();

        for (int i = size-1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = number;
        size++;

        for (int i = 0; i < size; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

}
