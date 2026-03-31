import java.util.*;
public class TriangularPark {

    // method to calculate rounds
    public static double calculateRounds(double s1, double s2, double s3) {
        // calculating perimeter
        double perimeter= s1 + s2 + s3;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking sides as input
        System.out.print("Enter side 1: ");
        double side1= s.nextDouble();
        System.out.print("Enter side 2: ");
        double side2= s.nextDouble();
        System.out.print("Enter side 3: ");
        double side3= s.nextDouble();

        // calculating rounds using calculateRounds method
        double rounds= calculateRounds(side1, side2, side3);
        System.out.println("The athlete must complete " + rounds + " rounds");
    }
}