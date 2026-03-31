import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number 1 as input
        System.out.print("Enter number 1: ");
        int n1= s.nextInt();

        // taking number 2 as input
        System.out.print("Enter number 2: ");
        int n2= s.nextInt();

        // calculation of quotient and remainder
        int quotient= n1/n2;
        int remainder= n1%n2;

        System.out.println("The Quotient is " + quotient 
                    + " and Reminder is " + remainder 
                    + " of two number " + n1 + " and " + n2);
    }
}