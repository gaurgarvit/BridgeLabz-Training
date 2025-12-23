import java.util.*;
public class FactorsOperations {

    // method to find factors and return as array
    public static int[] getFactors(int n) {
        int count= 0;

        for(int i=1;i<=n;i++){
            if(n % i== 0){
                count++;
            }
        }
        
        int[] factors= new int[count];
        int index= 0;

        for(int i=1;i<=n;i++){
            if(n % i == 0){
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // method to find greatest factor
    public static int getGreatestFactor(int[] factors) {
        int max= factors[0];

        for(int i=1;i<factors.length;i++){
            if(factors[i]> max){
                max= factors[i];
            }
        }

        return max;
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
            product*= factors[i];
        }
        
        return product;
    }

    // method to find product of cube of factors
    public static double productCubeFactors(int[] factors) {
        double product= 1;
        for(int i=0;i<factors.length;i++){
            product*=  Math.pow(factors[i], 3);
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input
        System.out.print("Enter a number: ");
        int n= s.nextInt();

        // getting factors array
        int[] factors= getFactors(n);
        
        // performing operations
        System.out.println("Factors: "+ Arrays.toString(factors));
        System.out.println("Greatest Factor: "+ getGreatestFactor(factors));
        System.out.println("Sum of Factors: "+ sumFactors(factors));
        System.out.println("Product of Factors: "+ productFactors(factors));
        System.out.println("Product of Cube of Factors: "+ productCubeFactors(factors));
    }
}