import java.util.*;

public class LexicalTwist {
    public static boolean isValidWord(String str){
        if(str==null || str.isEmpty()) return false;

        return str.trim().split(" ").length ==1;
    }

    public static void reverseString(String str){
        String ans= "";
        for(char x: str.toCharArray()){
            if(x=='a' || x=='e' || x=='i' || x=='o'|| x=='u'){
                ans+='@';
            }
            else{
                ans+=x;
            }
        }

        System.out.println(ans);
    }

    public static void notReverseString(String str1, String str2){
        String combine= (str1+str2).toUpperCase();

        int v=0; int c=0;
        List<Character> vowel= new ArrayList<>();
        List<Character> conso= new ArrayList<>();

        for(Character x: combine.toCharArray()){
            if(x=='A' || x=='E' || x=='I' || x=='O'|| x=='U'){
                v++;
                if(!vowel.contains(x)){
                    vowel.add(x);
                }
            }
            else{
                c++;
                if(!conso.contains(x)){
                    conso.add(x);
                }
            }
        }

        if(v>c){
            System.out.print(vowel.get(0));
            System.out.print(vowel.get(1));
        }
        else if(v<c){
            System.out.print(conso.get(0));
            System.out.print(conso.get(1));
        }
        else{
            System.out.println("Vowels and Consonants are equal");
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter first word: ");
        String str1= s.next();
        if(!isValidWord(str1)){
            System.out.println(str1+" is an invalid word");
            return;
        }

        System.out.println("Enter second word: ");
        String str2= s.next();
        if(!isValidWord(str2)){
            System.out.println(str2+" is an invalid word");
            return;
        }

        StringBuffer sb= new StringBuffer(str1);
        sb.reverse();

        if(str2.equalsIgnoreCase(String.valueOf(sb))){
            reverseString(String.valueOf(sb).toLowerCase());
        }
        else{
            notReverseString(str1.toLowerCase(),str2.toLowerCase());
        }
    }
}
