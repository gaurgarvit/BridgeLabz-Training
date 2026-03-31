import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        // taking age as input
        System.out.print("Enter age: ");
        int age= s.nextInt();

        // age for voting must be 18 or above
        if(age>= 18){
            System.out.println("The person's age is "+age+" and can vote.");
        } 
        else{
            System.out.println("The person's age is "+age +" and cannot vote.");
        }
    }
}