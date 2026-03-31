
import java.util.Scanner;

public class LeapYearMultiple {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // taking year input from user
        System.out.print("Enter year: ");
        int year = s.nextInt();

        // checking leap year conditions
        if(year< 1582){
            System.out.println("Invalid! Works only for year >= 1582");
        } 
        else if(year % 400== 0){
            System.out.println(year + " is a Leap Year");
        } 
        else if(year % 100== 0){
            System.out.println(year + " is not a Leap Year");
        } 
        else if(year % 4== 0){
            System.out.println(year + " is a Leap Year");
        } 
        else{
            System.out.println(year + " is not a Leap Year");
        }
    }
}
