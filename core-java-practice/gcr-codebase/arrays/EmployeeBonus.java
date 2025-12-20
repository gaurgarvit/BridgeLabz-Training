import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // defining arrays to hold employee data
        double[] salaries= new double[10];
        double[] yearsOfService= new double[10];
        double[] newSalaries= new double[10];
        double[] bonusAmounts= new double[10];

        double totalBonus= 0;
        double totalOldSalary= 0;
        double totalNewSalary= 0;

        System.out.println("Enter details for 10 employees (Zara): ");

        // taking input for salaries and years of service
        for(int i=0;i<10;i++){
            System.out.println("Employee " + (i + 1) + ":");

            System.out.print("Enter current salary: ");
            double salary= s.nextDouble();
            System.out.print("Enter years of service: ");
            double years= s.nextDouble();

            // checking if inputs are valid
            if(salary< 0 || years< 0){
                System.out.println("Invalid input. Please enter positive values");
                // decrement i to repeat this iteration
                i--;
                continue;
            }

            // storing inputs in arrays
            salaries[i]= salary;
            yearsOfService[i]= years;
        }

        System.out.println("\n--- Calculating Bonuses ---");

        // calculating bonuses and new salaries
        for(int i=0;i<10;i++){
            double bonusPercentage;
            
            // determining bonus percentage based on years of service
            if (yearsOfService[i] > 5) {
                bonusPercentage= 0.05; // 5%
            } 
            else{
                bonusPercentage= 0.02; // 2%
            }

            // calculating bonus amount and new salary
            bonusAmounts[i]= salaries[i] * bonusPercentage;
            newSalaries[i]= salaries[i] + bonusAmounts[i];

            // updating totals
            totalOldSalary+= salaries[i];
            totalBonus+= bonusAmounts[i];
            totalNewSalary+= newSalaries[i];
        }

        // displaying results
        System.out.println("\n--- Employee Salary Details ---");
        
        System.out.println("Total Old Salary Payout: "+ totalOldSalary);
        System.out.println("Total Bonus Payout: "+ totalBonus);
        System.out.println("Total New Salary Payout: "+ totalNewSalary);
    }
}