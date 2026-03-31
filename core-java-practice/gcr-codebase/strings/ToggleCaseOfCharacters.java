import java.util.Scanner;

public class ToggleCaseOfCharacters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // taking user input
        System.out.println("Enter a string:");
        String input= s.nextLine();

        StringBuilder toggled= new StringBuilder();

        // loop through each character of the input string
        for(int i=0;i<input.length();i++){
            char ch= input.charAt(i);

            // if the character is uppercase, converting it into lowercase
            if(Character.isUpperCase(ch)){
                toggled.append(Character.toLowerCase(ch));
            }

            // if the character is lowercase, converting it into uppercase
            else if(Character.isLowerCase(ch)){
                toggled.append(Character.toUpperCase(ch));
            }

            // if the character is not an alphabet (space, digit, symbol) then keep it as it is
            else{
                toggled.append(ch);
            }
        }

        System.out.println("Toggled case string: "+ toggled.toString());
    }
}
