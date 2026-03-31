import java.util.Scanner;

public class FactorsFor {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input
        System.out.print("Enter a positive number: ");
        int n= s.nextInt();

        // checking if number is positive
        if(n>0){
            System.out.print("Factors of "+ n +" are: ");
            // running for loop from i = 1 to i < number (strictly less than as per hint)
            for(int i=1;i<n;i++){
                // checking if i is a factor of number
                if(n % i== 0){
                    System.out.print(i + " ");
                }
            }
           
        } 
        else{
            System.out.println("Please enter a positive integer");
        }
    }
}