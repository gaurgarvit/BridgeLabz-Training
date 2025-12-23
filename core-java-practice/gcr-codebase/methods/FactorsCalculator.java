import java.util.*;
public class FactorsCalculator {

    // method to find factors and return as array
    public static int[] findFactors(int n) {
        int count= 0;
        
        // first loop to find the count of factors
        for(int i=1;i<=n;i++){
            if(n % i== 0) {
                count++;
            }
        }
        
        // initializing the array with the count
        int[] factors= new int[count];
        int index= 0;
        
        // second loop to save factors into the array
        for(int i=1;i<=n;i++){
            if(n % i== 0) {
                factors[index] = i;
                index++;
            }
        }
        
        return factors;
    }

    // method to find sum of factors
    public static int sumFactors(int[] factors) {
        int sum= 0;
        for(int i=0;i<factors.length;i++){
            sum+= factors[i];
        }
        return sum;
    }

    // method to find product of factors
    public static long productFactors(int[] factors) {
        long product= 1;

        for(int i=0;i<factors.length;i++){
            product= product * factors[i];
        }

        return product;
    }

    // method to find sum of square of factors
    public static double sumSquareFactors(int[] factors){
        double sum= 0;

        for(int i = 0; i < factors.length; i++) {
            sum+= Math.pow(factors[i], 2);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input
        System.out.print("Enter a number: ");
        int n= s.nextInt();

        // getting factors array
        int[] factors= findFactors(n);
        
        // displaying factors
        System.out.print("Factors are: ");
        for(int i=0;i<factors.length;i++){
            System.out.print(factors[i]+" ");
        }
        System.out.println();

        // displaying sum of factors
        System.out.println("Sum of factors: "+ sumFactors(factors));

        // displaying sum of squares
        System.out.println("Sum of squares: "+ sumSquareFactors(factors));

        // displaying product of factors
        System.out.println("Product of factors: "+ productFactors(factors));
    }
}