
import java.util.Scanner;

public class VolumeOfCylinder{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter the radius: ");
        double r= s.nextDouble(); // Enter the radius
        System.out.println("Enter the height: ");
        double h= s.nextDouble(); // Emter the height

        // Volume of the cylinder
        double volume= 3.14 * r * r * h;
        System.out.println("Volume of Cylinder: "+ volume);
    }
}