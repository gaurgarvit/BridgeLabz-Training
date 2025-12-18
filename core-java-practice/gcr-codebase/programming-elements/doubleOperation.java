import java.util.Scanner;

public class doubleOperation {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking three doubles as input
        System.out.print("Enter double a: ");
        double a= s.nextDouble();
        System.out.print("Enter double b: ");
        double b= s.nextDouble();
        System.out.print("Enter double c: ");
        double c= s.nextDouble();

        // Operations
        double r1= a + b * c; 
        double r2= a * b + c; 
        double r3= c + a / b; 
        double r4= a % b + c; 

        System.out.println("The results of Double Operations are " 
                + r1 + ", " + r2 + ", " + r3 + ", and " + r4);
    }
}