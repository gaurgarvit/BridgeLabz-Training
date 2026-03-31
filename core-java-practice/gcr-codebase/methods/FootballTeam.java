import java.util.*;
public class FootballTeam {
    // method to find sum of elements
    public static int findSum(int[] heights) {
        int sum= 0;
        for(int i=0;i<heights.length;i++){
            sum+= heights[i];
        }

        return sum;
    }

    // method to find mean height
    public static double findMean(int sum, int count) {
        return sum/ count;
    }

    // method to find shortest height
    public static int findShortest(int[] heights) {
        int min= heights[0];

        // traversing the array to find minimum height
        for(int i=1;i<heights.length;i++){
            if(heights[i]< min){
                min= heights[i];
            }
        }

        return min;
    }

    // method to find tallest height
    public static int findTallest(int[] heights) {
        int max= heights[0];

        // traversing the array to find maximum height
        for(int i=1;i<heights.length;i++){
            if(heights[i]> max){
                max= heights[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int[] heights= new int[11];

        // generating random heights between 150 and 250
        System.out.println("Generating heights for 11 players...");
        for(int i=0;i<11;i++){
            heights[i]= (int)(Math.random() * 101) + 150;
            System.out.print(heights[i] + " ");
        }

        System.out.println();

        // calculating results
        int sum= findSum(heights);
        double mean= findMean(sum, 11);
        int shortest= findShortest(heights);
        int tallest= findTallest(heights);

        // displaying results
        System.out.println("Shortest Height: "+ shortest);
        System.out.println("Tallest Height: "+ tallest);
        System.out.println("Mean Height: "+ mean);
    }
}