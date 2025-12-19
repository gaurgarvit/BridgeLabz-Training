import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        // taking salary and years of service as input
        System.out.print("Enter Salary: ");
        double salary= s.nextDouble();
        System.out.print("Enter Years of Service: ");
        int years= s.nextInt();

        // bonus applies if service > 5 years
        if(years> 5){
            double bonus= salary* 0.05; // 5% calculation
            System.out.println("Bonus amount: " + bonus);
        } 
        else{
            System.out.println("No bonus. Years of service must be > 5.");
        }
    }
}