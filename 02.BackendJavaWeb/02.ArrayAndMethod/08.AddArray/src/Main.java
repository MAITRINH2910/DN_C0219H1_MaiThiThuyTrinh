import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int size1=5;
        int arr1[] = new int [size1];
        for (int i=0; i<size1; i++){
            System.out.println("arr["+i+"]= ");
            arr1[i]= (int)Math.random()*100;
        }

        System.out.println("First Array: ");
        for (int i=0; i<size1; i++){
            System.out.print(arr1[i]+" ");
        }

        int size2=6;
        int arr2[] = new int [size2];
        for (int i=0; i<size2; i++){
            System.out.println("arr["+i+"]= ");
            arr2[i]= (int)Math.random()*100;
        }

        System.out.println("Second Array: ");
        for (int i=0; i<size2; i++){
            System.out.print(arr2[i]+" ");
        }

        int size3= size1+size2;
        int arr3[] = new int [size3];
        for (int i=0; i<size3; i++){
            for (int j=0; j<size1; j++){
                arr3[i]=arr1[j];
            }

        }


    }
}
