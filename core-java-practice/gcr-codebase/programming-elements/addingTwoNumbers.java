import java.util.Scanner;

public class addingTwoNumbers{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a= s.nextInt(); // Number a
        int b= s.nextInt(); // Number b

        // Result of adding two numbers
        int result= a+b;
        System.out.println(result);
    }
}