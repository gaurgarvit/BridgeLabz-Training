import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("Enter base: ");
        double base= s.nextDouble();// base number

        System.out.print("Enter exponent: ");
        double exponent= s.nextDouble(); // exponent

        // Calculating power
        double result= Math.pow(base,exponent);
        System.out.println("Result= "+ result);
    }
}
