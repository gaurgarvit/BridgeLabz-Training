import java.util.*;

public class RockPaperScissors {
    // method to find computer choice
    public static String getCompChoice() {
        double rand = Math.random();
        if(rand < 0.33){
            return "rock";
        }
        else if(rand < 0.66){
            return "paper";
        }
        else{
            return "scissors";
        }
    }

    // method to find the winner
    public static String findWinner(String user, String computer) {
        if(user.equals(computer)){
            return "Draw";
        }
        
        if(user.equals("rock")){
            return (computer.equals("scissors")) ? "User" : "Computer";
        }
        else if(user.equals("paper")){
            return (computer.equals("rock")) ? "User" : "Computer";
        } 
        else if(user.equals("scissors")){
            return (computer.equals("paper")) ? "User" : "Computer";
        }
        return "Invalid";
    }

    // method to calculate stats and return 2D array
    public static String[][] getStats(int total, int userWins, int compWins) {
        String[][] stats = new String[2][3];
        
        // calculating percentages
        double userPerc = ((double)userWins / total) * 100;
        double compPerc = ((double)compWins / total) * 100;
        
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f%%", userPerc);
        
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f%%", compPerc);
        
        return stats;
    }

    // method to display game stats (UPDATED FOR ALIGNMENT)
    public static void displayStats(String[][] stats) {
        System.out.println("\n--- Game Statistics ---");
        
        // %-15s means reserve 15 chars and align left
        // %-10s means reserve 10 chars and align left
        System.out.printf("%-15s %-10s %-10s%n", "Player", "Wins", "Win %");
        System.out.println("-----------------------------------");

        for(int i = 0; i < stats.length; i++){
            System.out.printf("%-15s %-10s %-10s%n", stats[i][0], stats[i][1], stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // taking input for number of games
        System.out.print("Enter number of games to play: ");
        int rounds = s.nextInt();
        
        int userWins = 0;
        int compWins = 0;

        // game loop
        for(int i = 0; i < rounds; i++){
            System.out.print("Enter rock, paper, or scissors: ");
            String userChoice = s.next();
            String compChoice = getCompChoice();
            
            String winner = findWinner(userChoice, compChoice);
            System.out.println("Computer chose: " + compChoice + "\nWinner: " + winner);
            System.out.println("---------------------");

            // updating win counts
            if(winner.equals("User")){
                userWins++;
            }
            else if(winner.equals("Computer")){
                compWins++;
            }
        }

        // getting stats array
        String[][] finalStats = getStats(rounds, userWins, compWins);

        displayStats(finalStats);
    }
}