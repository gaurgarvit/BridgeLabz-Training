import java.util.*;
public class CelciusConversion{
public static void main (String [] args){
	//Input 
	Scanner  input= new Scanner(System.in);
	double farenheit= input.nextDouble();
	// Calculation
	double celsiusResult= (farenheit-32)*5/9;
    
	//Output
	System.out.print(" The "+ farenheit +" farenheit is "+ celsiusResult +" celsius" );
	}
}