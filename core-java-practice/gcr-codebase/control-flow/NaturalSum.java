import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        //taking n as input
        System.out.print("Enter a natural number: ");
        int n= s.nextInt();

        if(n>0){
            // formula to check the sum of first n natural numbers: n(n+1)/2
            int formulaSum = n * (n + 1) / 2;

            // using while loop to calculate the sum of first n natural numbers
            int sum= 0;
            int i= 1;
            while(i<=n) {
                sum = sum + i;
                i++;
            }

            // comparing both results
            System.out.println("Formula Result: " + formulaSum);
            System.out.println("Loop Result: " + sum);
            
            if(formulaSum==sum) {
                System.out.println("Both computations are correct.");
            }
        } 
        else{
            System.out.println("Not a Natural Number");
        }
    }
}