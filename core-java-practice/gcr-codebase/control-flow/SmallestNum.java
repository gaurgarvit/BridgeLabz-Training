import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        // taking three numbers as input
        System.out.print("Enter number 1: ");
        int n1= s.nextInt();
        System.out.print("Enter number 2: ");
        int n2= s.nextInt();
        System.out.print("Enter number 3: ");
        int n3= s.nextInt();

        // checking if n1 is smallest among three
        boolean isFirstSmallest = (n1 < n2 && n1 < n3);
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
    }
}