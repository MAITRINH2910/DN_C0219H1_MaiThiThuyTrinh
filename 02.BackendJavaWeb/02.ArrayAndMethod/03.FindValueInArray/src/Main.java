import java.util.Scanner;

public class Main {
    /*
    Ứng dụng có sẵn một danh sách tên của sinh viên,
    cho phép người dùng nhập vào một tên sinh viên,
    sau đó hiển thị vị trí của sinh viên đó trong danh sách (nếu tìm thấy)
    hoặc là thông báo không tìm thấy.
     */
    public static void main(String[] args) {
        String students[] = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily" };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found" + input_name + " in the list.");
    }
}
