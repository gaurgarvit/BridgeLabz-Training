import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebLinkExtract {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the text to extract weblinks : ");

        // taking text input 
        String text=s.nextLine();

        // regular Expression for weblink extraction 
        String regex="https?://[^\\s]+";

        // compiling the regex
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(text);
        
        while(matcher.find()){
            System.out.println("Extracted WebLink : "+ matcher.group());
        }
    }
    
}