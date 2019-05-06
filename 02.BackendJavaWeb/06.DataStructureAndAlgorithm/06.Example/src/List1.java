import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class List1<E> {

    public static void main(String[] args) {
        List<EmployeeList> employees= new ArrayList<>();
        employees.add(new EmployeeList(1, "Trinh"));
        employees.add(new EmployeeList(2, "Mai"));

        String name ="Peter";
        System.out.println();
        boolean isExist = employees.stream().anyMatch(e->name.equals(e.getName()));
        System.out.println("Exist employee with nem"+name+": "+ isExist);
        List<EmployeeList> newEmployer= employees.stream().filter(e->name.equals(e.getName())).collect(Collectors.toList());
        System.out.println("Size: "+employees.size()+" "+employees.get(0));




    }
}
