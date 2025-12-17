
import java.util.Scanner;

public class areaOfCircle{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.err.println("Enter the radius: ");
        int r= s.nextInt(); // enter radius of a circle

        // Area of the circle
        double area= 3.14 * r * r;
        System.out.println("area of circle: "+ area);
    }
}