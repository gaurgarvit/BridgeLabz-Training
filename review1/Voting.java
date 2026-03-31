import java.util.Scanner;

class VotingAgeLimitException extends Exception{
    public VotingAgeLimitException(String message){
        super(message);
    }
}

public class Voting {
    public static void main(String[] args) throws VotingAgeLimitException {
        Scanner s= new Scanner(System.in);
        int age= s.nextInt();

        if(age>=18){
            System.out.println("Eligible for voting");
        }
        else{
            throw new VotingAgeLimitException("Not Eligible for Voting");
        }
    }
}
