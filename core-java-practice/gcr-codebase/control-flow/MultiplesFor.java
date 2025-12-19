import java.util.Scanner;

public class MultiplesFor {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input
        System.out.print("Enter a positive number: ");
        int n= s.nextInt();

        // checking if number is positive
        if(n>0){
            System.out.print("Multiples of "+ n +" are: ");
            // running for loop from i = 1 to i <= 10
            for(int i=1;i<=10;i++){
                // printing the multiple
                System.out.print(n * i + " ");
            }
           
        } 
        else{
            System.out.println("Please enter a positive integer");
        }
    }
}