import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LogFilter {
    public static void main(String[] args) {
        String filePath= "large_log.txt"; // ensure this file exists

        // initializing buffered reader for efficient reading
        try (BufferedReader br= new BufferedReader(new FileReader(filePath))) {
            String line;
            
            // reading line-by-line to avoid memory overflow
            while((line = br.readLine())!= null){
                
                // checking if the line contains "error" (case insensitive)
                if(line.toLowerCase().contains("error")){
                    System.out.println(line);
                }
            }
        } 
        catch(IOException e){
            // handling file reading errors
            System.out.println("Error reading file: "+ e.getMessage());
        }
    }
}