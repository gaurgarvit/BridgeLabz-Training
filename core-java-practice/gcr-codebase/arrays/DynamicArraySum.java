import java.util.Scanner;

public class DynamicArraySum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // defining an array to hold up to 10 double values
        double[] values = new double[10];

        // variable to hold the sum of entered numbers
        double total= 0;
        int index= 0;

        System.out.println("Enter positive numbers (Enter 0 or negative to stop): ");

        // using a loop to take input until user enters 0 or negative number
        while(true){
            // break the loop if maximum limit of 10 numbers is reached
            if(index== 10){
                System.out.println("Maximum limit of 10 numbers reached");
                break;
            }

            System.out.print("Enter number " + (index + 1) + ": ");
            double input= s.nextDouble();

            // check if the input is 0 or negative to stop taking inputs
            if(input<= 0){
                break;
            }

            // store the valid input in the array
            values[index]= input;
            index++;
        }

        System.out.println("\n--- Entered Numbers ---");

        // printing the entered numbers and calculating the total sum
        for(int i=0;i<index;i++){
            System.out.println(values[i]);
            total+= values[i];
        }

        System.out.println("Total Sum: " + total);
    }
}