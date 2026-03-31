import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        // taking number as input
        System.out.print("Enter a number: ");
        int number= s.nextInt();
        
        // checking if remainder is 0 when divided by 5
        boolean isDivisible= (number % 5 == 0);
        System.out.println("Is the number " +number +" divisible by 5? "+isDivisible);
    }
}