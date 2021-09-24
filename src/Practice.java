import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice{

    public static void main(String[] args) {
        
        Employee emp1 = new Employee(1, "IT", 100);
        Employee emp2 = new Employee(2, "IT", 200);
        Employee emp3 = new Employee(3, "Accounts", 300);
        Employee emp4 = new Employee(4, "Sales", 400);
        Employee emp5 = new Employee(5, "Sales", 500);

        List<Employee> emp = new ArrayList<Employee>();

        emp = Stream.of(emp1, emp2, emp3, emp4, emp5).collect(Collectors.toList());

        Map<String, Integer> sum = emp.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, 
                Collectors.summingInt(Employee::getSalary)));

        System.out.println(sum);

        

    }
}