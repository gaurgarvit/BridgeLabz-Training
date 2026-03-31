
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking two numbers and an operator input from user
        System.out.print("Enter first number: ");
        double a= s.nextDouble();

        System.out.print("Enter second number: ");
        double b= s.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op= s.next();

        // performing calculation based on the operator
        switch(op){
            case "+":
                System.out.println("Result = "+ (a+b));
                break;
            case "-":
                System.out.println("Result = "+ (a-b));
                break;
            case "*":
                System.out.println("Result = "+ (a * b));
                break;
            case "/":
                if (b != 0)
                    System.out.println("Result = "+ (a/ b));
                else
                    System.out.println("Cannot divide by zero!");
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
