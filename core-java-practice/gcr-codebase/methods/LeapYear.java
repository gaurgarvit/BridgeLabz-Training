import java.util.*;
public class LeapYear {

    // method to check for leap year
    public static boolean checkLeapYear(int year) {
        // leap year logic for Gregorian calendar
        if(year>= 1582) {
            // divisible by 4 and not by 100 or divisible by 400
            if((year% 4== 0 && year% 100 != 0) || (year % 400 == 0)) {
                return true;
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking year as input
        System.out.print("Enter a year: ");
        int year= s.nextInt();

        // checking and printing result
        if(checkLeapYear(year)) {
            System.out.println("The Year is a Leap Year");
        } 
        else{
            System.out.println("The Year is not a Leap Year");
        }
    }
}