import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input
        System.out.print("Enter a number to check if it is prime: ");
        int num= s.nextInt();

        // checking if the number is prime or not
        if(isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } 
        else{
            System.out.println(num + " is not a prime number.");
        }
    }

    // method to check whether a number is prime
    public static boolean isPrime(int n) {

        // numbers less than or equal to 1 are not prime
        if (n <= 1){
            return false;
        }

        // 2 and 3 are prime numbers
        if (n <= 3){
            return true;
        }

        // eliminate multiples of 2 and 3
        if (n % 2 == 0 || n % 3 == 0){
            return false;
        }

        // Checking divisibility using 6k ± 1 optimization
        for (int i = 5; i * i <= n; i += 6) {

            // if divisible by i or i + 2, it's not prime
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        // if no divisors found, the number is prime
        return true;
    }
}
