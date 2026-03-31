import java.io.*;

public class UpperToLower {

    public static void main(String[] args) {

        // defining input and output file names
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try (
            // creating filereader for reading characters from input file
            FileReader fr= new FileReader(inputFile);
            // wrapping filereader with bufferedreader for efficient reading
            BufferedReader br= new BufferedReader(fr);

            // creating filewriter for writing characters to output file
            FileWriter fw= new FileWriter(outputFile);
            // wrapping filewriter with bufferedwriter for efficient writing
            BufferedWriter bw= new BufferedWriter(fw)
        ) {
            // declaring variable for storing each line
            String line;

            // reading file line by line until end of file
            while((line = br.readLine()) != null){

                // converting uppercase characters to lowercase
                String lowerCaseLine = line.toLowerCase();

                // writing converted line to output file
                bw.write(lowerCaseLine);
                // moving cursor to next line
                bw.newLine();
            }

            // displaying success message after completion
            System.out.println("file converted successfully.");

        } 
        catch(IOException e){
            // handling input or output related exceptions
            System.out.println("error while reading or writing file.");
            e.printStackTrace();
        }
    }
}
