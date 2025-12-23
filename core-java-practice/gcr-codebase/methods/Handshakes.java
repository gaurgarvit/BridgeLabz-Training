import java.util.*;
public class Handshakes {
    
    // method to calculate handshakes
    public static int calculateHandshakes(int n) {
        // using formula nC2 = n*(n-1)/2
        return (n*(n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number of students input
        System.out.print("Enter number of students: ");
        int n= s.nextInt();

        // calculating handshakes using calculateHandshakes method
        int totalHandshakes= calculateHandshakes(n);
        System.out.println("Maximum number of handshakes: "+totalHandshakes);
    }
}