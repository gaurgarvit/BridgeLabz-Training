
import java.util.Scanner;

public class LeapYearSingle {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking year input from user
        System.out.print("Enter year: ");
        int year= s.nextInt();

        // checking leap year condition in a single if statement
        if(year>= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year");
        }
        else{
            System.out.println(year + " is not a Leap Year");
        }
    }
}
