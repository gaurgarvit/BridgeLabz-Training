import java.util.Scanner;

public class CorporateEmail {
    public static boolean emailValidation(String email){
        if(!email.matches("^[a-z]{3,}\\.[a-z]{3,}\\d{4,}@(sales|marketing|IT|product)\\.company\\.com$")){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t= s.nextInt();
        s.nextLine();

        while (t-->0){
            String input= s.nextLine();

            if(emailValidation(input)){
                System.out.println("Access Granted");
            }
            else{
                System.out.println("Access Denied");
            }
        }
    }
}
