import java.util.*;
public class NaturalSumCompare {

    // method to find sum using recursion
    public static int recursiveSum(int n) {
        // base case
        if (n <= 1){
            return n;
        }

        return n + recursiveSum(n - 1);
    }

    // method to find sum using formula
    public static int formulaSum(int n) {
        // using the formula n(n+1)/2
        return n* (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input
        System.out.print("Enter a number: ");
        int n= s.nextInt();

        // checking if it is a natural number
        if(n> 0){
            // calculating sum using both methods
            int recResult= recursiveSum(n);
            int formResult= formulaSum(n);

            // comparing and printing results
            System.out.println("Recursive Result: "+ recResult);
            System.out.println("Formula Result: "+ formResult);
            
            if(recResult== formResult) {
                System.out.println("Both computations are correct");
            }
        } 
        else {
            System.out.println("Please enter a Natural number");
        }
    }
}