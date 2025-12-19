import java.util.Scanner;

public class RocketFor {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        // takking user input for countdown start
        System.out.print("Enter countdown start: ");
        int start= s.nextInt();

        // countdown from start to 1
        for (int i = start; i >= 1; i--) {
            System.out.println(i);
        }
    }
}