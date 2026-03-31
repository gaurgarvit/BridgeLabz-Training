import java.util.Scanner;

public class SignCheck {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        // taking number as input
        System.out.print("Enter a number: ");
        int n= s.nextInt();

        // if number is greater than 0, it's positive otherwise if it's less than 0, it's negative else it's zero
        if(n>0){
            System.out.println("positive");
        } 
        else if(n<0){
            System.out.println("negative");
        } 
        else{
            System.out.println("zero");
        }
    }
}