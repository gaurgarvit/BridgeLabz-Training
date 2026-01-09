import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeExceptionDemo {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // attempting to divide two numbers provided by the user
        try{
            System.out.print("Enter numerator: ");
            int num1= s.nextInt();

            System.out.print("Enter denominator: ");
            int num2= s.nextInt();

            int result= num1 / num2;
            System.out.println("Result: "+ result);

        } 
        catch(ArithmeticException e){
            // catching division by zero error
            System.out.println("Error: Cannot divide by zero.");
        } 
        catch(InputMismatchException e){
            // catching invalid input (e.g., letters instead of numbers)
            System.out.println("Error: Please enter a valid integer.");
        } 
        finally{
            s.close();
        }
    }
}