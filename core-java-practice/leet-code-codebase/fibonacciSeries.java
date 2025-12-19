import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.print("Enter number: ");
        int n= s.nextInt();

        // First two terms
        int a= 0;
        int b= 1;   

        System.out.print("Fibonacci Series: ");

        for(int i= 1;i<=n;i++){
            System.out.print(a+ " ");

            int next = a + b;  // Next term
            a = b;             // Shift forward
            b = next;
        }
    }
}
