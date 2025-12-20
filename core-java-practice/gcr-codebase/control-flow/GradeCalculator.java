import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking input for marks in three subjects
        System.out.print("Enter marks for Physics: ");
        double physics= s.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry= s.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double maths= s.nextDouble();

        // calculating total and percentage
        double total= physics + chemistry + maths;
        double percentage= total / 3.0; 

        String grade;
        String remarks;

        // determining grade and remarks based on percentage
        if(percentage>=80){
            grade = "A";
            remarks = "(Level 4, above agency-normalized standards)";
        } 
        else if(percentage>= 70){
            grade = "B";
            remarks = "(Level 3, at agency-normalized standards)";
        } 
        else if(percentage>= 60){
            grade = "C";
            remarks = "(Level 2, below, but approaching agency-normalized standards)";
        } 
        else if(percentage>= 50){
            grade = "D";
            remarks = "(Level 1, well below agency-normalized standards)";
        } 
        else if(percentage>= 40){
            grade = "E";
            remarks = "(Level 1- , too below agency-normalized standards)";
        } 
        else{
            grade = "R";
            remarks = "(Remedial standards)";
        }

        System.out.println("\n--- Result ---");
        System.out.println("Average Mark / Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}