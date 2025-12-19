import java.util.Scanner;

public class NaturalSumFor {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input
        System.out.print("Enter a natural number: ");
        int n= s.nextInt();

        if(n> 0){
            // formula to check the sum of first n natural numbers: n(n+1)/2
            int formulaSum= n * (n + 1) / 2;

            // using for loop to calculate the sum of first n natural numbers
            int sum= 0;
            for (int i = 1; i <= n; i++) {
                sum+= i;
            }

            // comparing both results
            System.out.println("Formula Result: " + formulaSum);
            System.out.println("Loop Result: " + sum);
            
            if(formulaSum==sum){
                System.out.println("Both computations are correct.");
            }
        } 
        else{
            System.out.println("Not a Natural Number");
        }
    }
}