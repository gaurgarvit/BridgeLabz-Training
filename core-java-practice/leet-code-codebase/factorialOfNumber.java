import java.util.Scanner;

public class factorialOfNumber{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= s.nextInt();

        int fact= 1;

        for(int i=1;i<=n;i++){
            fact*= i;
        }

        System.out.println("Factorial: " + fact);
    }
}
