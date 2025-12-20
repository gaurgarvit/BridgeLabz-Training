import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        // target array to hold 5 numbers
        int[] numbers= new int[5];

        // taking input for 5 numbers
        System.out.println("Enter 5 numbers: ");
        for(int i=0;i<numbers.length;i++){
            System.out.print("Number "+(i + 1)+": ");
            numbers[i]= s.nextInt();
        }

        System.out.println("\n--- Analysis ---");
        
        // Analyzing each number in the array
        for(int i=0;i<numbers.length;i++){
            int num= numbers[i];
            
            // if the number is positive, check if even or odd
            if(num> 0){
                if(num % 2== 0){
                    System.out.println(num+" is Positive and Even.");
                } 
                else{
                    System.out.println(num +" is Positive and Odd.");
                }
            }

            // if the number is negative, print negative
            else if(num< 0){
                System.out.println(num+" is Negative.");
            } 

            // else the number is zero
            else{
                System.out.println("The number is Zero.");
            }
        }

        // comparning first and last elements
        System.out.println("\n--- Comparison (First vs Last) ---");
        int first= numbers[0];
        int last= numbers[numbers.length - 1];

        if(first== last){
            System.out.println("First element ("+ first + ") equals Last element (" + last + ")");
        } 
        else if(first > last){
            System.out.println("First element (" + first +") is greater than Last element (" + last + ")");
        } 
        else{
            System.out.println("First element (" + first +") is less than Last element (" + last + ")");
        }
    }
}