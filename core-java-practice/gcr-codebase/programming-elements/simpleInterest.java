
import java.util.Scanner;

public class simpleInterest{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter principal amount: ");
        int p= s.nextInt(); // principal amount
        System.out.println("Enter rate of interest: ");
        double r= s.nextDouble(); // rate
        System.out.println("Enter time period: ");
        int t= s.nextInt(); // time period

        // Simple interest
        double SI= (p * r* t)/100;
        System.out.println("Simple Interest: "+ SI);
    }
}