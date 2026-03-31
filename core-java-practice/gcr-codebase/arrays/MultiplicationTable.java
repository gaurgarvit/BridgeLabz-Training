import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input to generate multiplication table
        System.out.print("Enter a number to generate the table: ");
        int n= s.nextInt();

        // defining an array to hold multiplication table results
        int[] table= new int[10];

        // calculating multiplication table and storing in the array
        for(int i=1;i<=10;i++){
            table[i - 1]= n * i;
        }

        System.out.println("--- Multiplication Table ---");

        // printing the multiplication table
        for(int i=0;i<table.length;i++){
            System.out.println(n + " * " + (i + 1) + " = " + table[i]);
        }
    }
}