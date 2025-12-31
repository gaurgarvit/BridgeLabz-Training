import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WritingUserInput {
    // declaring that this method might throw an IO error
    public static void main(String[] args) throws IOException {
        // setting up the reader and writer
        InputStreamReader isr= new InputStreamReader(System.in);
        BufferedReader reader= new BufferedReader(isr);
        FileWriter writer= new FileWriter("output.txt");

        System.out.println("Enter text to write to file (type 'exit' to stop): ");
        
        String input;
        while(true){
            input= reader.readLine();
            
            if ("exit".equalsIgnoreCase(input)) {
                break;
            }
            
            writer.write(input+ "\n");
            writer.flush();
        }
        
        System.out.println("Data successfully written!");
    }
}