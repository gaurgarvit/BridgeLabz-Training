import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking base as input
        System.out.print("Enter base (cm): ");
        double base= s.nextDouble();

        // taking height as input
        System.out.print("Enter height (cm): ");
        double height= s.nextDouble();

        // formula to calculate Area in sq cm
        double areaSqCm= 0.5 * base * height;

        // conversion from sq cm to sq in
        // 1 inch = 2.54 cm, 1 sq inch = 2.54 * 2.54 sq cm
        double areaSqIn = areaSqCm / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is "+ areaSqIn + " and sq cm is " + areaSqCm);
    }
}