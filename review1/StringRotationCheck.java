import java.util.Scanner;

public class StringRotationCheck {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1= s.nextLine();

        System.out.print("Enter second string: ");
        String str2= s.nextLine();

        if (areRotations(str1, str2)) {
            System.out.println("Strings are rotations of each other");
        }
        else{
            System.out.println("Strings are NOT rotations of each other");
        }
    }

    public static boolean areRotations(String str1, String str2) {

        // length check
        if (str1.length() != str2.length()) {
            return false;
        }

        String temp = str1 + str1;

        return temp.contains(str2);
    }
}