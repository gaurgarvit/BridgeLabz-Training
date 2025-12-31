import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
    // declaring that this method might throw an IO error
    public static void main(String[] args) throws IOException {
        String filePath= "sample.txt"; 

        // creating file reader objects without try-catch
        FileReader fr= new FileReader(filePath);
        BufferedReader br= new BufferedReader(fr);
        
        String line;
        // reading each line until null (end of file)
        while((line= br.readLine())!= null){
            System.out.println(line);
        }
    }
}