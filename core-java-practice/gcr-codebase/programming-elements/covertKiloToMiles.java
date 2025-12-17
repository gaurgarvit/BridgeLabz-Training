import java.util.Scanner;

public class convertKiloToMiles {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("Enter kilometers: ");
        double kilometers = sc.nextDouble(); // Distance in kilometers

        // Convert km to miles
        double miles = kilometers * 0.621371;
        System.out.println("Miles: "+ miles);
    }
}
