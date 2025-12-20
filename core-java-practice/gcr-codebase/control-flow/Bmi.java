import java.util.*;
public class Bmi {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking weight and height input from user
        System.out.print("Enter weight in kg: ");
        double weight = s.nextDouble();
        System.out.print("Enter height in meters: ");
        double height = s.nextDouble();

        // calculating BMI using the formula
        double bmi= weight / (height * height);
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // determining the BMI category
        if(bmi< 18.5){
            System.out.println("You are underweight");
        } 
        else if(bmi>= 18.5 && bmi< 24.9){
            System.out.println("You have a normal weight");
        } 
        else if(bmi >= 25 && bmi < 29.9){
            System.out.println("You are overweight");
        } 
        else{
            System.out.println("You are obese");
        }
    }
}