import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=3;
        int arr[][]= new int [size][size];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j]= (int)(Math.random()*90+10);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for (int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j==i){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Sum of Main Diagonal Array: "+sum);
    }
}
