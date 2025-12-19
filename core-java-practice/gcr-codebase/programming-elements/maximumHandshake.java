import java.util.Scanner;

public class MaximumHandshake {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number of students as input
        System.out.print("Enter number of students: ");
        int numberOfStudents = s.nextInt();

        // formula for maximum handshakes
        int handshakes= (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("Maximum possible handshakes: " + handshakes);
    }
}
