/*
Sử dụng interface Comparable và triển khai phương thức compareTo() để hỗ trợ so sánh “hơn, kém, bằng” các đối tượng của các lớp hình.
 Trong Java, phương thức java.util.Arrays.sort() sử dụng compareTo() để triển khai,
do đó, viết một chương trình sử dụng phương thức sort() để kiểm thử compareTo().


 */
import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
