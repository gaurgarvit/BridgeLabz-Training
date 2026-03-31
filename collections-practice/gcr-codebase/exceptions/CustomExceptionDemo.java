import java.util.Scanner;

// defining the custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    // validating the age and throwing exception if under 18
    static void validateAge(int age) throws InvalidAgeException {
        if(age< 18){
            throw new InvalidAgeException("Age must be 18 or above");
        } 
        else{
            System.out.println("Access granted!");
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age= s.nextInt();

        // trying to validate age and catching the custom exception
        try{
            validateAge(age);
        } 
        catch(InvalidAgeException e){
            System.out.println("Exception caught: "+ e.getMessage());
        }
    }
}