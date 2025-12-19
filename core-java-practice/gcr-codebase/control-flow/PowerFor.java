import java.util.Scanner;

public class PowerFor {
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

            // using for loop to calculate n raised to the power
            for(int i=1;i<=power;i++){
                // multiplying result by n in each iteration
                result= result* n;
            }
            System.out.println("Result: " + result);
        } 
        else{
            System.out.println("Please enter positive integers");
        }
    }
}