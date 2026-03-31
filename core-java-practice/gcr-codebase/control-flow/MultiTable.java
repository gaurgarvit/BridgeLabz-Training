import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input
        System.out.print("Enter a number: ");
        int n= s.nextInt();

        // loop is used to print multiplication table from 6 to 9
        for (int i=6;i<=9;i++){
            System.out.println(n+ " * " + i + " = " + (n * i));
        }
    }
}