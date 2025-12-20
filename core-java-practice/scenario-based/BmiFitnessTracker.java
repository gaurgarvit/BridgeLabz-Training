import java.util.Scanner;

public class BmiFitnessTracker {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("--- Maya's BMI Fitness Tracker ---");

        // taking weight and height as input
        System.out.println("Enter your weight in kilograms: ");
        double weight= s.nextDouble();

        System.out.println("Enter your height in meters: ");
        double height= s.nextDouble();

        // calculating BMI using the formula: weight / (height * height)
        double bmi= weight / (height * height);
        System.out.printf("Your BMI is: ", bmi);

        // categorizing BMI on the basis of standard BMI categories
        if(bmi< 18.5){
            System.out.println("You are underweight. Consider a nutritious diet to gain weight.");
        } 
        else if(bmi>= 18.5 && bmi< 24.9){
            System.out.println("You have a normal weight. Keep up the good work!");
        }
        else if(bmi>= 25 && bmi< 29.9){
            System.out.println("You are overweight. Consider a balanced diet and regular exercise.");
        }
        else{
            System.out.println("You are obese. It's advisable to consult a healthcare professional for guidance.");
        }
    }
}
