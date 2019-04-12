public class Display {
    public static boolean IsPrimeNumber(int number){

        int j=0;
        for (int i=1; i<=Math.sqrt(number); i++){
            if (number %i==0){
                j++;
            }
        }
        if (j!=1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime Numbers <100 is: ");

        int count=2;
        while (count <100){
            if (IsPrimeNumber(count)){
                System.out.print(count+" ");
            }
            count++;
        }

    }
}
