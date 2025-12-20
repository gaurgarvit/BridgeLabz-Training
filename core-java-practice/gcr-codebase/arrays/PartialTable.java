import java.util.Scanner;

public class PartialTable{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input to generate multiplication table
        System.out.print("Enter a number: ");
        int n= s.nextInt();

        // defining an array to hold multiplication results from 6 to 9
        // we need 4 slots (for 6, 7, 8, 9)
        int[] multiResult= new int[4];

        // calculating multiplication from 6 to 9 and storing in the array
        for(int i=6;i<=9;i++){
            // Store the result in the array at index (i - 6)
            multiResult[i - 6]= n * i;
        }

        System.out.println("--- Table from 6 to 9 ---");

        // printing the multiplication table from 6 to 9
        for(int i=0;i<multiResult.length;i++){
            // calculating the actual multiplier
            int multiplier = i + 6;
            System.out.println(n + " * "+ multiplier +" = "+ multiResult[i]);
        }
    }
}