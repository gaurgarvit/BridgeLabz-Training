import java.util.*;
public class VotingAgeCheck {
    // method to generate random 2-digit ages
    public static int[] generateAges(int n) {
        int[] ages= new int[n];

        for(int i=0;i<n;i++){
            // generating random age between 10 and 99
            ages[i]= 10+ (int)(Math.random()*90);
        }

        return ages;
    }

    // method to check voting eligibility
    public static String[][] check(int[] ages) {
        String[][] status= new String[ages.length][2];
        
        for(int i=0;i<ages.length;i++){
            status[i][0]= String.valueOf(ages[i]);
            
            // validating age and checking eligibility
            if(ages[i]< 0){
                status[i][1]= "Invalid";
            } 
            else if(ages[i]>= 18){
                status[i][1]= "true";
            } 
            else{
                status[i][1]= "false";
            }
        }
        return status;
    }

    // method to display the tabular data
    public static void display(String[][] data) {
        System.out.println("Age     Can Vote");
        System.out.println("----------------");

        for(int i=0; i<data.length; i++){
            System.out.println(data[i][0] + "     " + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking input for number of students
        System.out.print("Enter number of students: ");
        int n= s.nextInt();

        // calling method to generate ages
        int[] ages= generateAges(n);

        // calling method to check eligibility
        String[][] results= check(ages);

        display(results);
    }
}