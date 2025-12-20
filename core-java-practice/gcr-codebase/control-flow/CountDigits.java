
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number input from user
        System.out.print("Enter number: ");
        int n= s.nextInt();

        int count= 0;

        // counting the digits
        while(n!= 0){
            n/= 10; // remove last digit
            count++;
        }

        System.out.println("Number of digits = " + count);
    }
}
