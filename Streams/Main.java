import java.util.*;
import java.util.stream.Collectors;
class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Bob","T&T"),
            new Employee("Charlie","Audit"),
            new Employee("Dane","Tax"),
            new Employee("John","T&T"),
            new Employee("Jacob","Tax")
        );
            
        List<Employee> listdepart = employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("T&T")).collect(Collectors.toList());
        listdepart.forEach(e -> System.out.println(e));
    }
}
