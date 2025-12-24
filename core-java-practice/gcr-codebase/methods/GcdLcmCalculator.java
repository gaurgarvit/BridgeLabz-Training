import java.util.Scanner;
public class GcdLcmCalculator {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking first and second number from user
        System.out.print("Enter first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter second number: ");
        int num2 = s.nextInt();

        // calculating GCD using Euclidean algorithm
        int gcd = calculateGCD(num1, num2);

        // calculating LCM using GCD
        int lcm = calculateLCM(num1, num2, gcd);
        System.out.println("GCD of "+ num1+" and "+num2+" is: "+gcd);
        System.out.println("LCM of "+ num1+" and "+num2+" is: "+ lcm);
    }

    // method to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {

        // loop until remainder becomes zero
        while(b!=0){
            int temp= b;   // store value of b
            b= a % b;      // calculate remainder
            a= temp;       // update a with previous b
        }

        return a;
    }

    // method to calculate LCM using GCD formula
    public static int calculateLCM(int a, int b, int gcd) {

        // LCM formula: (a * b) / GCD
        return (a/gcd) * b;
    }
}
