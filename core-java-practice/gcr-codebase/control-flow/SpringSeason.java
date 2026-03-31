import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking month and day as input
        System.out.print("Enter month: ");
        int month= s.nextInt();
        System.out.print("Enter day: ");
        int day= s.nextInt();

        boolean isSpring = false;

        // spring season is from March 20 to June 20
        if(month== 3){
            // if it's March, it's only Spring if day is 20 or later
            if(day>= 20){
                isSpring= true;
            }
        } 
        else if(month== 6){
            // if it's June, it's only Spring if day is 20 or earlier
            if (day<= 20) {
                isSpring = true;
            }
        } else if (month == 4 || month == 5) {
            // if it's April or May, it is always Spring
            isSpring = true;
        }

        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}