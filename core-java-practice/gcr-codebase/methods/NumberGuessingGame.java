import java.util.Random; 
import java.util.Scanner; 

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");

        // initialize the guessing range
        int low= 1;
        int high= 100;
        int guess;
        String feedback;

        // infinite loop until the correct guess or contradiction occurs
        while (true) {
            // generating a random guess within the current range
            guess= generateGuess(low, high);

            // asking user for feedback on the guess
            System.out.println("Is your number " + guess + "? (high/low/correct): ");
            feedback= s.nextLine().trim().toLowerCase();

            // checking user's response
            if (feedback.equals("correct")){
                // if guess is correct, end the game
                System.out.println("Yay! I guessed your number.");
                break;

            } 
            else if(feedback.equals("high")){
                // if guess is too high, reduce upper bound
                high= guess - 1;

            } 
            else if(feedback.equals("low")){
                // if guess is too low, increase lower bound
                low= guess + 1;

            } 
            else{
                // Handle invalid user input
                System.out.println("Invalid input. Please respond with 'high', 'low', or 'correct'.");
            }

            // Check for inconsistent feedback
            if(low> high){
                System.out.println("Hmm, there seems to be a contradiction in your answers.");
                break;
            }
        }
    }

    // method to generate a random guess within a given range
    public static int generateGuess(int low, int high) {

        // creating Random object
        Random rand= new Random();

        // generating and returning random number between low and high (inclusive)
        return rand.nextInt(high - low + 1) + low;
    }
}
