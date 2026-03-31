import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= s.nextInt(); // number whose digits will be added

        int sum= 0;

        // taking the digits from last and adding it to sum
        while(n>0){
            sum+= n % 10;
            n= n/10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
