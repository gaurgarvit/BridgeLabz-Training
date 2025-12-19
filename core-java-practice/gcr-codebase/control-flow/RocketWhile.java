import java.util.Scanner;

public class RocketWhile {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        // taking countdown start as input
        System.out.print("Enter countdown start: ");
        int counter= s.nextInt();

        // counter will decrement until it reaches 1
        while (counter>= 1) {
            System.out.println(counter);
            counter--; // Decrease counter by 1
        }
    }
}