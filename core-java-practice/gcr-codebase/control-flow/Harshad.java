
import java.util.Scanner;

public class Harshad {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // taking number input from user
        System.out.print("Enter number: ");
        int n= s.nextInt();

        int temp= n;
        int sum= 0;

        // calculating sum of digits
        while(temp!=0){
            sum+= temp % 10; // extract last digit and add to sum
            temp/= 10;  // remove last digit
        }

        if(n% sum== 0){
            System.out.println(n + " is a Harshad Number");
        }
        else{
            System.out.println(n + " is not a Harshad Number");
        }
    }
}
