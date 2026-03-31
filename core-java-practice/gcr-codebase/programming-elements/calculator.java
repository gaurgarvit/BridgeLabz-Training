import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number 1
        System.out.print("Enter number 1: ");
        double n1= s.nextDouble();
        
        // taking number 2
        System.out.print("Enter number 2: ");
        double n2= s.nextDouble();

        // performing arithmetic operations
        double add= n1 + n2;
        double sub= n1 - n2;
        double mul= n1 * n2;
        double div= n1 / n2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " 
                           + n1 + " and " + n2 + " is " 
                          + add + ", " + sub + ", " + mul + ", and " + div);
    }
}