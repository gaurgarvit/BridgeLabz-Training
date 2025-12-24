import java.util.Scanner; // Import Scanner class to take user input

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("---Basic Calculator-----");

        // taking first number and second number as input
        System.out.print("Enter first number: ");
        double num1 = s.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = s.nextDouble();

        // Consume the leftover newline character
        s.nextLine();

        // taking operator input from user
        System.out.print("Choose operation (+, -, *, /): ");
        String op = s.nextLine();

        double result;

        // perform operations based on user choice
        switch (op) {
            case "+":
                result = add(num1, num2);
                break;

            case "-":
                result = subtract(num1, num2);
                break;

            case "*":
                result = multiply(num1, num2);
                break;

            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                result = divide(num1, num2);
                break;

            default:
                System.out.println("Invalid operation.");
                return;
        }

        System.out.println("Result: " + result);
    }

    // method to add two numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // method to subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }

    // method to multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }

    // method to divide two numbers
    public static double divide(double a, double b) {
        return a / b;
    }
}
