import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        // trying to read a file that may not exist
        try {
            FileReader fileReader = new FileReader("data.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } 
        catch (IOException e) {
            // handling the exception if file is not found or cannot be read
            System.out.println("File not found or cannot be read.");
        }
    }
}