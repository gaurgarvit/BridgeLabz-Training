import java.util.Scanner;

public class FindSubstringOccurrences {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // reading main string and substring
        System.out.println("Enter the main string:");
        String mainString= s.nextLine();
        System.out.println("Enter the substring to find:");
        String subString= s.nextLine();

        // counting occurrences of substring
        int count= 0;
        int index= 0;

        // using indexOf in a loop to find all occurrences
        while((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index+= subString.length();
        }

        System.out.println("Number of occurrences: " + count);
    }
}
