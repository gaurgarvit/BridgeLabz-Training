import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String[] args) {
        // using try-with-resources to automatically close the file
        try (BufferedReader br= new BufferedReader(new FileReader("info.txt"))) {
            String firstLine= br.readLine();

            if(firstLine!= null){
                System.out.println("First line: "+ firstLine);
            } 
            else{
                System.out.println("File is empty.");
            }
        } 
        catch(IOException e) {
            // handling any io errors during the read process
            System.out.println("Error reading file: "+ e.getMessage());
        }
    }
}