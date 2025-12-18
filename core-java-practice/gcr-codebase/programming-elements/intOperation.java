import java.util.Scanner;

public class intOperation {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking three integers as input
        System.out.print("Enter integer a: ");
        int a= s.nextInt();
        System.out.print("Enter integer b: ");
        int b= s.nextInt();
        System.out.print("Enter integer c: ");
        int c= s.nextInt();

        // Operations
        int r1= a + b * c; 
        int r2= a * b + c; 
        int r3= c + a / b; 
        int r4= a % b + c; 

        System.out.println("The results of Int Operations are " 
                + r1 + ", " + r2 + ", " + r3 + ", and " + r4);
    }
}