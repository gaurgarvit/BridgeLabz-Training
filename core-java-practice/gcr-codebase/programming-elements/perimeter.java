import java.util.*;

public class Perimeter{
	public static void main (String [] args){

	Scanner s= new Scanner(System.in);
    
    System.out.println("Enter the length: ");
	int l= s.nextInt(); // Length
    System.out.println("Enter the breath: ");
    int b= s.nextInt(); // Breadth

    // perimeter of rectangle
	int perimeter= 2*(l+b);
	System.out.println("perimeter of rectangle: "+ perimeter);
	}
}