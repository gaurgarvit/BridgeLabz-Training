import java.util.*;

public class GroupEmployees {
    // defining simple employee class
    static class Employee {
        String name, dept;
        Employee(String n, String d) { name = n; dept = d; }
        public String toString() { return name; }
    }

    public static void main(String[] args) {
        List<Employee> employees= Arrays.asList(
            new Employee("Alice", "HR"),
            new Employee("Bob", "IT"),
            new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> grouped= new HashMap<>();

        // grouping list entries by department key
        for (Employee e: employees) {
            grouped.computeIfAbsent(e.dept, k -> new ArrayList<>()).add(e);
        }

        System.out.println("Grouped: "+ grouped);
    }
}