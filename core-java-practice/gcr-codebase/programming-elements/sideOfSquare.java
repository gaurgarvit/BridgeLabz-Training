import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking perimeter as input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter= s.nextDouble();

        // finding side of square
        double side= perimeter/4;

        System.out.println("The length of the side is " + side+" whose perimeter is " +perimeter);
    }
}