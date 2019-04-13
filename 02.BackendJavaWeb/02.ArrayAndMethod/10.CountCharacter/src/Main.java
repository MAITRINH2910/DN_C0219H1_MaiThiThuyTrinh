import java.util.Scanner;
import java.lang.String;
public class Main {
    /*
    *  Đếm số lần xuất hiện của một ký tự được nhập vào từ bàn phím cho một chuỗi cho trước.
    * */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any string: ");
        String str = sc.nextLine();
        System.out.print("Enter any character: ");
        char c = sc.next().charAt(0);

        int count=0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)==c){
                count++;
            }
        }
        System.out.println(count+ " times");
    }



}
