import java.util.Scanner;

public class feetToMiles {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking distnace in feet as input
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = s.nextDouble();

        // formula to convert feet into yards
        double distanceInYards = distanceInFeet / 3;

        // formula to convert feet into miles
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in feet is " + distanceInFeet + 
                         " which is " + distanceInYards + " yards and " + 
                           distanceInMiles + " miles");
    }
}