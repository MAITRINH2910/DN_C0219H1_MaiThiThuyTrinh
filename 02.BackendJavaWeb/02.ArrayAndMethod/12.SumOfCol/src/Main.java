import java.util.Scanner;

public class Main {
    /*
    Viết một ứng dụng cho phép người dùng nhập vào một mảng hai chiều của các số thực,
    sau đó cho phép người dùng nhập vào thứ tự của một cột (tính từ 0) và tính ra tổng các phần tử của cột đó.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 3;
        int arr[][] = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 90 + 10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        System.out.print("Enter any column: ");
        int index = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][index];
        }
        System.out.println("Sum of " + index + "th is: " + sum);
    }
}
