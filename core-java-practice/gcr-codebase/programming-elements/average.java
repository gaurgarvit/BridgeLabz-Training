import java.util.Scanner;

public class average{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a= s.nextInt();

        System.out.print("Enter second number: ");
        int b= s.nextInt();

        System.out.print("Enter third number: ");
        int c= s.nextInt();

        // average of three numbers
        double average= (a+b+c)/ 3;
        System.out.println("Average: " + average);
    }
}
