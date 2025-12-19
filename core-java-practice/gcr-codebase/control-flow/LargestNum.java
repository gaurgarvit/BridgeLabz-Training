import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        // taking three numbers as input
        System.out.print("Enter number 1: ");
        int n1= s.nextInt();
        System.out.print("Enter number 2: ");
        int n2= s.nextInt();
        System.out.print("Enter number 3: ");
        int n3= s.nextInt();

        // checking which number is the largest
        System.out.println("Is the first number the largest? "+ (n1 > n2 && n1 > n3)); // for  n1
        System.out.println("Is the second number the largest? "+ (n2 > n1 && n2 > n3)); // for n2
        System.out.println("Is the third number the largest? "+ (n3 > n1 && n3 > n2)); // for n3
    }
}