import java.util.*;
public class SimpleInterest {
    
    // method to calculate simple interest
    public static double calculateInterest(double principal, double rate, double time) {
        return (principal*rate*time) / 100;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking principal as input
        System.out.print("Enter Principal: ");
        double principal= s.nextDouble();
        
        // taking rate as input
        System.out.print("Enter Rate: ");
        double rate= s.nextDouble();

        // taking time as input
        System.out.print("Enter Time: ");
        double time= s.nextDouble();

        // calling the method to calculate simple interest
        double interest= calculateInterest(principal, rate, time);
        System.out.println("The Simple Interest is " + interest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }
}