import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input
        System.out.print("Enter a positive integer: ");
        int n= s.nextInt();

        if(n>0){
            long factorial= 1;

            // multiplying numbers from 1 to n
            for(int i=1;i<=n;i++){
                factorial= factorial*i;
            }

            System.out.println("Factorial of " + n + " is " + factorial);
        } 
        else{
            System.out.println("Please enter a positive integer.");
        }
    }
}
