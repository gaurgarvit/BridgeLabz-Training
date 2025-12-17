import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int n= sc.nextInt();

        int org= n;   // original number
        int reverse= 0;     //reversed number

        // Reverse the number
        while (n > 0) {
            int digit= n%10;          // Get last digit
            reverse= reverse*10 + digit;   // Add digit to reverse number
            n= n/ 10;                // Remove last digit from num
        }

        // Check if original and reversed are same
        if (org== reverse) {
            System.out.println(org + " is a Palindrome Number");
        } else {
            System.out.println(org + " is not a Palindrome Number");
        }
    }
}
