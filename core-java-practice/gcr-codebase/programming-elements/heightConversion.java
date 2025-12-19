import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        // taking height in cm
        System.out.print("Enter your height in centimeters: ");
        double heightCm = s.nextDouble();
        
        // converting height from cm to inches
        double totalInches = heightCm / 2.54;
        
        // converting total inches to feet
        int feet = (int) (totalInches / 12);
        
        // finding the remaining inches after converting to feet
        double remInches = totalInches - (feet * 12);

        System.out.println("Your Height in cm is " + heightCm +" while in feet is " + feet + 
                           " and inches is " + String.format("%.2f", remInches));
    }
}