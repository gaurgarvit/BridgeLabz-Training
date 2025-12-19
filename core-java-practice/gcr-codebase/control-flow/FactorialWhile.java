import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input
        System.out.print("Enter a positive integer: ");
        int n= s.nextInt();

        if(n>0){
            long factorial = 1;
            int i= 1;
            
            // multipyling numbers from 1 to n
            while (i <= n) {
                factorial = factorial * i;
                i++;
            }
            System.out.println("Factorial of " + n + " is " + factorial);
        } 
        else {
            System.out.println("Please enter a positive integer.");
        }
    }
}