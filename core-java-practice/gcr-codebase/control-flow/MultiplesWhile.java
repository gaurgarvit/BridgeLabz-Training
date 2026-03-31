import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input
        System.out.print("Enter a positive number: ");
        int n= s.nextInt();

        // checking if number is positive
        if(n>0){
            System.out.print("Multiples of "+ n +" are: ");
            int i= 1;
            // using while loop to iterate from 1 to 10
            while(i<=10){
                // printing the multiple
                System.out.print(n * i + " ");
                i++;
            }
           
        } 
        else{
            System.out.println("Please enter a positive integer");
        }
    }
}
