import java.util.*;

public class GradeSystem {

    // method to generate random 2 digit scores for PCM
    public static int[][] genScores(int numStudents) {
        int[][] scores= new int[numStudents][3];

        for(int i=0;i<numStudents;i++){
            // generating random scores between 10 and 99 for PCM
            scores[i][0] = 10 + (int)(Math.random() * 90);
            scores[i][1] = 10 + (int)(Math.random() * 90);
            scores[i][2] = 10 + (int)(Math.random() * 90);
        }

        return scores;
    }

    // method to calculate total, average, and percentage
    public static double[][] calculateMetrics(int[][] scores) {
        double[][] metrics= new double[scores.length][3];
        
        for(int i= 0;i<scores.length;i++){
            int total= scores[i][0]+ scores[i][1]+ scores[i][2];
            double avg= total/ 3.0;
            // assuming max marks per subject is 100
            double percentage= (total/ 300.0)* 100;

            // storing values and rounding to 2 digits
            metrics[i][0]= total; 
            metrics[i][1]= (double)Math.round(avg * 100) / 100;
            metrics[i][2]= (double)Math.round(percentage * 100) / 100;
        }
        return metrics;
    }

    // method to determine grade based on percentage
    public static String[][] calculateGrades(double[][] metrics) {
        String[][] grades= new String[metrics.length][1];
        
        for(int i=0;i<metrics.length;i++){
            double p= metrics[i][2];
            
            // checking conditions based on the provided table
            if(p>= 80){
                grades[i][0]= "A";
            }
            else if(p>= 70 && p<= 79.99){
                grades[i][0]= "B";
            }
            else if(p>= 60 && p<=69.99){
                grades[i][0]= "C";
            }
            else if(p>= 50 && p<= 59.99){
                grades[i][0]= "D";
            }
            else if(p>= 40 && p<= 49.99){
                grades[i][0]= "E";
            }
            else{
                grades[i][0]= "R";
            }
        }

        return grades;
    }

    // method to display the scorecard in tabular format
    public static void display(int[][] scores,double[][] metrics,String[][] grades){
        System.out.println("\n--- Student Scorecard ---");
        System.out.println("Phys\tChem\tMath\tTotal\tAvg\tPercent\tGrade");
        System.out.println("----\t----\t----\t-----\t---\t-------\t-----");
        
        for(int i = 0; i < scores.length; i++){
            System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t");
            System.out.print((int)metrics[i][0] + "\t" + metrics[i][1] + "\t" + metrics[i][2] + "%\t");
            System.out.println(grades[i][0]);
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking input for number of students
        System.out.print("Enter number of students: ");
        int numStudents= s.nextInt();

        // calling genscores method to generate random scores
        int[][] scores= genScores(numStudents);

        // calling calculateMetrics method to compute total, average, percentage
        double[][] metrics= calculateMetrics(scores);

        // calling calculateGrades method to determine grades
        String[][] grades= calculateGrades(metrics);

        // calling display method to show the scorecard
        display(scores, metrics, grades);
    }
}