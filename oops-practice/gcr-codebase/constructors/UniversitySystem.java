class Student{
    public int rollNumber;
    protected String name;
    private double cgpa;

    // initializing student details
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber= rollNumber;
        this.name= name;
        this.cgpa= cgpa;
    }

    // accessing private cgpa via getter
    public double getCgpa() {
        return cgpa;
    }

    // modifying private cgpa via setter
    public void setCgpa(double cgpa) {
        // validating the input
        if(cgpa>= 0.0 && cgpa<= 10.0){
            this.cgpa= cgpa;
        } 
        else{
            System.out.println("Invalid CGPA.");
        }
    }
}

class PostgraduateStudent extends Student {
    // initializing superclass constructor
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    // demonstrating access to protected members
    public void displayStudentInfo() {
        // accessing public roll number directly
        System.out.println("Roll Number: "+ rollNumber);
        
        // accessing protected name directly (allowed in subclass)
        System.out.println("Name: "+ name);
        
        // accessing private cgpa via public method (direct access fails)
        System.out.println("CGPA: "+ getCgpa());
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        // creating a postgraduate student
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "Emma Watson", 8.5);

        // updating cgpa using public method
        pgStudent.setCgpa(9.0);

        pgStudent.displayStudentInfo();
    }
}