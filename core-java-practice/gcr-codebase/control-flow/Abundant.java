
import java.util.Scanner;

public class Abundant {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number input from user
        System.out.print("Enter number: ");
        int n= s.nextInt();

        int sum= 0;

        // calculating sum of proper divisors
        for(int i=1;i<n;i++){

            // check if i is a divisor
            if(n % i== 0){
                sum+= i;
            }
        }

        if(sum>n){
            System.out.println(n + " is an Abundant Number");
        }
        else{
            System.out.println(n + " is not an Abundant Number");
        }
    }
}
