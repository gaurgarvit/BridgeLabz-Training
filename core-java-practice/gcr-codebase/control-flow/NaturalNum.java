import java.util.Scanner;

public class NaturalNum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        // taking a number as input
        System.out.print("Enter a number: ");
        int n= s.nextInt();

        // all the positive numbers are natural numbers that starts from 1
        if(n>0){

            // formula to calculate sum of n natural numbers: n(n+1)/2
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } 
        else{
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}