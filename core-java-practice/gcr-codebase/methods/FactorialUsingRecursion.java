import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input
        System.out.print("Enter a number to calculate its factorial: ");
        int num= s.nextInt();

        // calling factorial method to find factorial
        long result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }

    // recursive method to calculate factorial
    public static long factorial(int n) {

        // check for negative number input
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }

        // base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
