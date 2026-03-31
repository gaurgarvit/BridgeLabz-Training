import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        // taking names, ages, and heights of three friends
        String[] names= {"Amar", "Akbar", "Anthony"};
        int[] ages= new int[3];
        double[] heights= new double[3];

        // taking input
        System.out.println("Enter details for Amar, Akbar, and Anthony: ");
        for(int i=0;i<3;i++){
            System.out.println("Enter details for "+ names[i] +":");
            System.out.print("Age: ");
            ages[i]= s.nextInt();

            System.out.print("Height (in cm): ");
            heights[i]= s.nextDouble();
        }

        // initializing variables to track youngest and tallest
        int minAge= ages[0];
        double maxHeight= heights[0];
        String youngestName= names[0];
        String tallestName= names[0];

        // finding youngest and tallest
        for(int i=1;i<3;i++){
            // find youngest (minimum age)
            if(ages[i]< minAge){
                minAge= ages[i];
                youngestName= names[i];
            }

            // find tallest (maximum height)
            if(heights[i]> maxHeight){
                maxHeight= heights[i];
                tallestName= names[i];
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("The Youngest friend is: " + youngestName + " (Age: " + minAge + ")");
        System.out.println("The Tallest friend is: " + tallestName + " (Height: " + maxHeight + ")");
    }
}