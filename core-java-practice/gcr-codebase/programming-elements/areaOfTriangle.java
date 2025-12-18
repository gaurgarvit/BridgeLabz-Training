import java.util.Scanner;

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking base
        System.out.print("Enter the base of the triangle: ");
        double base = s.nextDouble();

        // taking height
        System.out.print("Enter the height of the triangle: ");
        double height = s.nextDouble();

        // formula of area of triangle
        double area = 0.5 * base * height;

        System.out.println("The Area of the Triangle with base " +base +" and height " +height + " is " + area);
    }
}