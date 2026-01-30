import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    String name;
    String grade;
    Student(String name, String grade) { this.name = name; this.grade = grade; }
}

public class StudentGrouping {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Rahul", "A"), new Student("Sneha", "B"),
            new Student("Amit", "A"), new Student("Priya", "C")
        );

        // grouping students by grade level [cite: 33, 34]
        Map<String, List<String>> groupedNames = students.stream()
            .collect(Collectors.groupingBy(
                s -> s.grade, // grouping by grade
                Collectors.mapping(s -> s.name, Collectors.toList()) // collecting names into lists
            ));

        System.out.println(groupedNames);
    }
}