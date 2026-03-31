
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number input from user
        System.out.print("Enter number: ");
        int n= s.nextInt();

        int original= n;
        int sum= 0;

        // calculating the sum of cubes of each digit
        while(original!= 0){
            int digit= original % 10;  // extract last digit
            sum+= digit * digit * digit;   // cube and add to sum
            original/= 10;   // remove last digit
        }

        if(sum==n){
            System.out.println(n + " is an Armstrong Number");
        }
        else{
            System.out.println(n + " is not an Armstrong Number");
        }
            
    }
}
