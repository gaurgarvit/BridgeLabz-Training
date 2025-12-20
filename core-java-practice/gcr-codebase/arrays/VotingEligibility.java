import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        // defining an array to hold ages of 10 students
        int[] ages= new int[10];

        // Taking input for ages of 10 students
        System.out.println("Enter the age of 10 students: ");
        for(int i=0;i<ages.length;i++){
            System.out.print("Student "+ (i + 1)+": ");
            ages[i]= s.nextInt();
        }

        System.out.println("\n--- Voting Status ---");

        // Checking voting eligibility for each student
        for(int i=0;i<ages.length;i++){
            int age= ages[i];

            // if age is negative, print Invalid age entered
            if(age< 0){
                System.out.println("Invalid age entered for student "+(i + 1));
            }
            // if age is 18 or more, print The student can vote
            else if(age>= 18){
                System.out.println("The student with the age "+age+" can vote.");
            } 
            // if age is less than 18, print The student cannot vote
            else{
                System.out.println("The student with the age "+age+" cannot vote.");
            }
        }
    }
}