import java.util.*;
public class NaturalSum {

    // method to find sum using loop
    public static int getSum(int n) {
        int sum= 0;
        for(int i=1;i<=n;i++){
            sum+= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking integer as input
        System.out.print("Enter n: ");
        int n= s.nextInt();

        // calculating sum using getSum method
        int result= getSum(n);
        System.out.println("Sum is: " + result);
    }
}