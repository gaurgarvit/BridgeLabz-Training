import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double total= 0;
        // initialize input to a non-zero value to start loop
        double input= -1;

        // loop breaks when user enters 0
        while(input!= 0){
            System.out.print("Enter a number (0 to stop): ");
            input= s.nextDouble();
            
            // add if input is not zero
            if (input != 0) {
                total += input;
            }
        }

        System.out.println("Total Sum: " + total);
    }
}