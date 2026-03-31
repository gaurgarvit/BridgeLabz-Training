import java.util.*;
public class NumberChecker {

    // method to find count of digits
    public static int countDigits(int n) {
        int count= 0;

        // counting digits
        while(n!= 0){
            n= n / 10;
            count++;
        }

        return count;
    }

    // method to store digits in array
    public static int[] getDigits(int n) {
        int count= countDigits(n);
        int[] digits= new int[count];
        int temp= n;

        // extracting digits from number
        for(int i=count-1;i>=0;i--){
            digits[i]= temp % 10;
            temp= temp / 10;
        }

        return digits;
    }

    // method to check for duck number (contains a zero)
    public static boolean isDuckNumber(int[] digits) {
        for(int i=0;i<digits.length;i++){
            if(digits[i]== 0){
                return true;
            }
        }

        return false;
    }

    // method to check armstrong number
    public static boolean isArmstrong(int number) {
        int[] digits= getDigits(number);
        int length= digits.length;
        int sum= 0;

        // calculating sum of digits raised to the power length
        for(int i=0;i<length;i++){
            sum+= (int)Math.pow(digits[i], length);
        }

        return sum == number;
    }

    // method to find largest and second largest in array
    public static void findLargestAndSecondLargest(int[] digits) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i=0;i<digits.length;i++){
            if(digits[i]> max){
                secondMax= max;
                max= digits[i];
            }

            else if(digits[i]> secondMax && digits[i]!= max){
                secondMax= digits[i];
            }
        }

        System.out.println("Largest: " + max + ", Second Largest: " + secondMax);
    }

    // method to find smallest and second smallest in array
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int min= Integer.MAX_VALUE;
        int secondMin= Integer.MAX_VALUE;

        for(int i=0;i<digits.length;i++){

            if(digits[i]< min){
                secondMin= min;
                min= digits[i];
            }
            else if(digits[i]< secondMin && digits[i]!= min){
                secondMin= digits[i];
            }
        }

        System.out.println("Smallest: " + min + ", Second Smallest: " + secondMin);
    }

    // method to find sum of digits
    public static int sumDigits(int[] digits) {
        int sum = 0;
        
        for(int i=0;i<digits.length;i++){
            sum+= digits[i];
        }

        return sum;
    }

    // method to find sum of squares of digits
    public static int sumSquareDigits(int[] digits) {
        int sum= 0;
        for(int i=0;i<digits.length;i++){
            sum+= (int)Math.pow(digits[i], 2);
        }

        return sum;
    }

    // method to check harshad number
    public static boolean isHarshad(int n) {
        int[] digits= getDigits(n);
        int sum= sumDigits(digits);
        
        return n % sum == 0;
    }

    // method to find frequency of digits
    public static void findFrequency(int number) {
        int[] digits= getDigits(number);
        int[][] freq= new int[10][2];
        
        // initializing digits 0-9
        for(int i=0;i<10;i++){
            freq[i][0] = i;
        }

        // counting frequency
        for(int i=0;i<digits.length;i++){
            freq[digits[i]][1]++;
        }

        // displaying frequency
        System.out.println("Digit Frequency:");
        for(int i=0;i<10; i++){
            if(freq[i][1]> 0){
                System.out.println("Digit " + freq[i][0] + ": " + freq[i][1]);
            }
        }
    }

    // method to reverse array
    public static int[] reverseArray(int[] digits) {
        int[] reversed= new int[digits.length];
        for(int i=0;i<digits.length;i++){
            reversed[i]= digits[digits.length - 1 - i];
        }

        return reversed;
    }

    // method to compare arrays
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if(arr1.length!= arr2.length){
            return false;
        }

        for(int i= 0;i<arr1.length;i++){
            if(arr1[i]!= arr2[i]){
                return false;
            }
        }

        return true;
    }

    // method to check palindrome
    public static boolean isPalindrome(int number) {
        int[] digits= getDigits(number);
        int[] reversed= reverseArray(digits);

        return compareArrays(digits, reversed);
    }

    // method to check prime
    public static boolean isPrime(int n) {
        if(n<= 1){
            return false;
        }

        for(int i=2;i<=n/2;i++){
            if(n% i == 0){
                return false;
            }
        }

        return true;
    }

    // method to check neon number
    public static boolean isNeon(int n) {
        int square= n * n;
        int[] digits= getDigits(square);
        int sum= sumDigits(digits);

        return sum== n;
    }

    // method to check spy number
    public static boolean isSpy(int number) {
        int[] digits= getDigits(number);
        int sum= sumDigits(digits);
        int product= 1;
        
        for(int i=0;i<digits.length;i++){
            product*= digits[i];
        }

        return sum == product;
    }

    // method to check automorphic number
    public static boolean isAutomorphic(int n) {
        int square= n * n;
        String sNum= String.valueOf(n);
        String sSquare= String.valueOf(square);

        return sSquare.endsWith(sNum);
    }

    // method to check buzz number
    public static boolean isBuzz(int n) {
        return (n % 7 == 0) || (n % 10 == 7);
    }

    // method to check perfect number
    public static boolean isPerfect(int number) {
        int sum= 0;
        for(int i=1;i<number;i++){
            if(number% i == 0){
                sum+= i;
            } 
        }
        return sum == number;
    }

    // method to check abundant number
    public static boolean isAbundant(int number) {
        int sum= 0;
        for(int i=1;i<number;i++){
            if(number% i == 0) sum+= i;
        }

        return sum > number;
    }

    // method to check deficient number
    public static boolean isDeficient(int number) {
        int sum= 0;
        for(int i=1;i<number;i++){
            if(number% i == 0) sum+= i;
        }

        return sum < number;
    }

    // helper method for factorial
    public static int factorial(int n) {
        int fact= 1;
        for(int i=1;i<=n;i++){
            fact*= i;
        }

        return fact;
    }

    // method to check strong number
    public static boolean isStrong(int number) {
        int[] digits= getDigits(number);
        int sum= 0;
        
        for(int i=0;i<digits.length;i++){
            sum+= factorial(digits[i]);
        }


        return sum== number;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number input for testing
        System.out.print("Enter a number to check: ");
        int n= s.nextInt();
        int[] digits= getDigits(n);

        // testing various methods
        System.out.println("Is Duck Number: "+ isDuckNumber(digits));
        System.out.println("Is Armstrong: "+ isArmstrong(n));
        System.out.println("Is Palindrome: "+ isPalindrome(n));
        System.out.println("Is Prime: "+ isPrime(n));
        System.out.println("Is Strong: "+ isStrong(n));
        
        // finding array stats
        findLargestAndSecondLargest(digits);
        findSmallestAndSecondSmallest(digits);
        findFrequency(n);
    }
}