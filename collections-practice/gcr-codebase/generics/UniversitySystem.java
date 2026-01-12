import java.util.ArrayList;
import java.util.List;

// abstract class representing the type of evaluation
abstract class CourseType {
    abstract String getEvaluationMethod();
}

// concrete class for exam-based courses
class ExamCourse extends CourseType {
    @Override
    String getEvaluationMethod() { 
        return "Written Examination"; 
    }
}

// concrete class for assignment-based courses
class AssignmentCourse extends CourseType {
    @Override
    String getEvaluationMethod() { 
        return "Project Submission"; 
    }
}

// concrete class for research-based courses
class ResearchCourse extends CourseType {
    @Override
    String getEvaluationMethod() { 
        return "Thesis Defense"; 
    }
}

// generic class Course restricted to T which extends CourseType
class Course<T extends CourseType> {
    private String courseName;
    private T type;

    public Course(String courseName, T type) {
        this.courseName= courseName;
        this.type= type;
    }

    public String getCourseName() {
        return courseName;
    }

    public T getType() {
        return type;
    }
    
    @Override
    public String toString() {
        return "Course: "+ courseName+ " ["+ type.getEvaluationMethod()+ "]";
    }
}

public class UniversitySystem {

    // method using wildcard to accept a list of any Course type
    // List<? extends Course<?>> allows mixing Exam, Assignment, and Research courses
    public static void processCourseSchedule(List<? extends Course<?>> courses) {
        System.out.println("--- Processing Course Schedule ---");
        for (Course<?> c: courses) {
            System.out.println(c.toString());
        }
    }

    public static void main(String[] args) {
        // creating course types
        ExamCourse examType = new ExamCourse();
        AssignmentCourse assignType= new AssignmentCourse();
        ResearchCourse researchType= new ResearchCourse();

        // creating generic course objects
        Course<ExamCourse> math= new Course<>("Calculus 101", examType);
        Course<AssignmentCourse> art= new Course<>("Digital Art", assignType);
        Course<ResearchCourse> phd= new Course<>("AI Research", researchType);

        // creating a list that can hold any course using wildcard
        List<Course<?>> universityCourses= new ArrayList<>();
        universityCourses.add(math);
        universityCourses.add(art);
        universityCourses.add(phd);

        // processing the list dynamically
        processCourseSchedule(universityCourses);
    }
}