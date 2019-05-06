import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int size = 100000;
        int[] arr1 = new int[size];

        StopWatch time = new StopWatch();
        System.out.println("Start: "+time.start());

        System.out.println("\nBefore Selection Sort");
        for (int i = 0; i < arr1.length; i++) {
           arr1[i]= (int)(Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < size - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < size; j++) {
                if (arr1[j] < arr1[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr1[index];
            arr1[index] = arr1[i];
            arr1[i] = smallerNumber;
        }


        System.out.println("\nAfter Selection Sort");
        System.out.println(Arrays.toString(arr1));

        System.out.println("\nStop: "+time.stop());
        System.out.println("\nTime to complie for Selection Sort Algorithm: " + time.getElapsedTime()+" ms");
    }

}
