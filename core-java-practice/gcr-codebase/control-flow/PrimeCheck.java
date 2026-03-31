import java.util.*;
class PrimeCheck {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input from user
        System.out.print("Enter a number: ");
        int n= s.nextInt();

        // checking if the number is prime
        boolean isPrime= n> 1;

        // check for factors from 2 to n/2
        for(int i=2;i<=n/2 && isPrime;i++){
            if(n % i== 0){
                isPrime= false;
            }
        }


        if(isPrime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
            
    }
}

