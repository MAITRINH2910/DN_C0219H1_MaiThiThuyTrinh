import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Employee> employeeMap = new HashMap<>();
        Employee employeeOne = createEmployee(1, "Henry");
        Employee employeeTwo = createEmployee(2, "David");

        employeeMap.put(employeeOne.getName(), employeeOne);
        employeeMap.put(employeeTwo.getName(), employeeTwo);

        employeeMap.entrySet().forEach(entry->{
            System.out.println("Key: "+entry.getKey()+"--------Value: "+employeeMap.get(entry.getKey()));
        });
    }

    private static Employee createEmployee(int id, String name){
       // return new Employee(UUID.randomUUID().toString(), id, name);
    }
}
