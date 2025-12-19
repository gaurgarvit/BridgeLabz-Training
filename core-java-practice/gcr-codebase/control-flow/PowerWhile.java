import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number and power as input
        System.out.print("Enter the base number: ");
        int n= s.nextInt();
        
        System.out.print("Enter the power: ");
        int power= s.nextInt();

        if(n> 0 && power>= 0){
            // initializing result to 1
            int result= 1;

            // using while loop to calculate n raised to the power
            int i= 1;
            while(i<= power){
                // multiplying result by n in each iteration
                result= result* n;
                i++;
            }
            System.out.println("Result: " + result);
        } 
        else{
            System.out.println("Please enter positive integers");
        }
    }
}
