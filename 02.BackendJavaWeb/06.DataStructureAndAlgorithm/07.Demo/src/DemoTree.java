import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoTree {
    public static void main(String[] args) {
        Set<Integer> number = new LinkedHashSet<>();
        number.add(10);
        number.add(3);
        number.add(2);

        System.out.println(number);

    }
}
