import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= s.nextLine().toLowerCase();

        int vow= 0;
        int cons= 0;

        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);

            if(ch>='a' && ch<= 'z'){ // check letters only
                if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                    vow++;
                }
                else{
                    cons++;
                }
            }
        }

        System.out.println("Vowels: " + vow);
        System.out.println("Consonants: " + cons);
    }
}
