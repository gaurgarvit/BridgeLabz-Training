import java.util.Scanner;

public class FizzBuzzFor {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input
        System.out.print("Enter a positive number: ");
        int n= s.nextInt();

        if(n>0){
            // using for loop to iterate from 1 to n
            for(int i= 1;i<=n;i++){
                // checking that number is multiple of both 3 and 5
                if(i % 3== 0 && i % 5== 0){
                    System.out.println("FizzBuzz");
                }
                // checking that number is multiple of 3
                else if(i % 3== 0){
                    System.out.println("Fizz");
                }
                // checking that number is multiple of 5
                else if(i % 5== 0){
                    System.out.println("Buzz");
                }
                // print the number if it is not multiple of 3 or 5
                else{
                    System.out.println(i);
                }
            }
        }
        else{
            System.out.println("Please enter a positive integer");
        }
    }
}