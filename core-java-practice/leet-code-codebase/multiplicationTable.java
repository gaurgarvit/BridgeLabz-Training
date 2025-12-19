import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= s.nextInt();   // Number whose table is calculated

        // this loop is to caculate the table
        for(int i=1;i<=10;i++){
            System.out.println(n+ " x "+i+" = "+(n * i));
        }
    }
}
