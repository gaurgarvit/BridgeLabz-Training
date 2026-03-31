import java.util.Scanner;
public class ValidationUsername {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the usename to validate : ");

        while (true) { 
            // taking username input 
            String username=s.nextLine();

            // regualar Expression for username validation
            String regex="^[a-zA-Z][a-zA-Z0-9_]{4,15}$";

            if(username.matches(regex)){
                System.out.println("Valid username");
                break;
            }
            else{
                System.out.println("Invalid username, please enter again : ");
            }
            
        }}
        
}
   