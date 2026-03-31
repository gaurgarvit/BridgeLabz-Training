import java.util.ArrayList;
import java.util.List;

// defining the student class
class Student {
    private String name;
    private int id;

    // initializing student details
    public Student(String name, int id) {
        this.name= name;
        this.id= id;
    }

    // getting the student name
    public String getName() {
        return name;
    }
}

// defining the professor class
class Professor {
    private String name;

    // initializing professor details
    public Professor(String name) {
        this.name= name;
    }

    // getting the professor name
    public String getName() {
        return name;
    }
}

// defining the course class handling enrollment and assignment
class Course {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    // initializing the course
    public Course(String courseName) {
        this.courseName= courseName;
        this.students= new ArrayList<>();
    }

    // assigning a professor to the course
    public void assignProfessor(Professor p) {
        this.professor= p;
        System.out.println("Professor "+ p.getName()+ " assigned to "+ courseName);
    }

    // enrolling a student in the course
    public void enrollStudent(Student s) {
        students.add(s);
        System.out.println("Student "+ s.getName()+" enrolled in "+ courseName);
    }

    // showing course details
    public void showDetails() {
        System.out.println("\n--- Course Details: "+ courseName+" ---");
        if(professor!= null){
            System.out.println("Taught by: "+ professor.getName());
        } 
        else{
            System.out.println("Taught by: TBD");
        }
        System.out.println("Enrolled Students: "+ students.size());
    }
}

// running the main class for the university system
public class UniversitySystem {
    public static void main(String[] args) {
        // creating professor and student objects
        Professor prof= new Professor("Dr. Alan Turing");
        Student s1= new Student("Neo", 101);
        Student s2= new Student("Trinity", 102);

        // creating a course
        Course csCourse= new Course("Computer Science 101");

        // assigning professor and enrolling students
        csCourse.assignProfessor(prof);
        csCourse.enrollStudent(s1);
        csCourse.enrollStudent(s2);

        csCourse.showDetails();
    }
}