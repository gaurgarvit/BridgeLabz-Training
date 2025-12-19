import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input
        System.out.print("Enter a number: ");
        int n= s.nextInt();
        
        // defining variable to store greatest factor
        int grtFactor= 1;

        int i= n-1;
        // using while loop to iterate from n-1 to 1
        while(i>=1){
            // checking if i is a factor of number
            if(n % i== 0){
                grtFactor= i;
                // breaking the loop as we found the greatest factor
                break;
            }

            i--;
        }

        System.out.println("Greatest factor: "+ grtFactor);
    }
}
