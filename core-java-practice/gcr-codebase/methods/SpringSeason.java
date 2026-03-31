import java.util.*;
public class SpringSeason {

    // method to check for spring season
    public static boolean isSpring(int month, int day){
        // spring season is from March 20 to June 20
        if (month == 3 && day >= 20 && day <= 31){
            return true;
        }
        if (month == 4 && day >= 1 && day <= 30){
            return true;
        }
        if (month == 5 && day >= 1 && day <= 31){
            return true;
        }
        if (month == 6 && day >= 1 && day <= 20){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking month and day as input
        System.out.print("Enter month: ");
        int month = s.nextInt();
        System.out.print("Enter day: ");
        int day = s.nextInt();

        // checking and printing result
        if(isSpring(month, day)){
            System.out.println("Its a Spring Season");
        } 
        else{
            System.out.println("Not a Spring Season");
        }
    }
}