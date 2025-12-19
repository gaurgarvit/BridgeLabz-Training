import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking age and height as input for Amar, Akbar and Anthony
        System.out.println("Enter Age and Height for Amar:");
        int amarAge= s.nextInt();
        double amarHeight= s.nextDouble();

        System.out.println("Enter Age and Height for Akbar:");
        int akbarAge= s.nextInt();
        double akbarHeight= s.nextDouble();

        System.out.println("Enter Age and Height for Anthony:");
        int anthonyAge= s.nextInt();
        double anthonyHeight= s.nextDouble();

        // finding the smallest of the 3 ages
        int youngestAge= Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        
        // printing the youngest age with names
        System.out.print("The youngest age is " + youngestAge + " of ");
        if(youngestAge== amarAge){
            System.out.print("Amar ");
        }
        if(youngestAge== akbarAge){
            System.out.print("Akbar ");
        }
        if(youngestAge== anthonyAge){
            System.out.print("Anthony ");
        }
        System.out.println();

        // finding the largest of the 3 heights
        double tallestHeight= Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        
        // printing the tallest height with names
        System.out.print("The tallest height is " + tallestHeight + " of ");
        if(tallestHeight== amarHeight){
            System.out.print("Amar ");
        }
        if(tallestHeight== akbarHeight){
            System.out.print("Akbar ");
        }
        if(tallestHeight== anthonyHeight){
            System.out.print("Anthony ");
        }
        System.out.println();
    }
}