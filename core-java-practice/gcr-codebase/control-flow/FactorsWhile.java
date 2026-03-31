import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input
        System.out.print("Enter a positive number: ");
        int n= s.nextInt();

        // checking if number is positive
        if(n>0){
            System.out.print("Factors of "+ n +" are: ");
            int i= 1;
            // using while loop to iterate from 1 to n-1
            while(i< n){
                // checking if i is a factor of number
                if(n % i== 0){
                    System.out.print(i + " ");
                }
                
                i++;
            }
           
        } 
        else{
            System.out.println("Please enter a positive integer");
        }
    }
}
