import java.util.Scanner;

public class SumWithBreak {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        double total= 0;

        // infinite loop that will be exited using break
        while(true){
            System.out.print("Enter a number (0 or negative to stop): ");
            double input= s.nextDouble();

            // loop will break if input is 0 or negative
            if (input<= 0) {
                break; 
            }
            
            total+= input;
        }

        System.out.println("Total Sum: "+total);
    }
}