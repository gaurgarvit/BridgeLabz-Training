import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;
    Employee(String name, String department, double salary) {
        this.name = name; this.department = department; this.salary = salary;
    }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

public class SalaryCategorization {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Karan", "IT", 75000), new Employee("Sara", "HR", 60000),
            new Employee("John", "IT", 85000), new Employee("Emma", "HR", 65000)
        );

        // grouping employees by department
        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment, // grouping by department
                Collectors.averagingDouble(Employee::getSalary) // calculating average salary 
            ));

        System.out.println(avgSalaryByDept);
    }
}