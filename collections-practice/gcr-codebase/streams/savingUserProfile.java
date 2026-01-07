import java.io.*;

public class savingUserProfile {
    public static void main(String[] args) {
        // using buffered reader for console input
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

        try {
            // prompting user for details
            System.out.print("Enter your name: ");
            String name= reader.readLine();

            System.out.print("Enter your age: ");
            String age= reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language= reader.readLine();

            // writing data to a file
            File file= new File("user_info.txt");
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("User Profile:\n");
                writer.write("Name: "+ name+ "\n");
                writer.write("Age: "+ age+ "\n");
                writer.write("Favorite Language: "+ language+ "\n");
                
                System.out.println("Data successfully saved to user_info.txt");
            }

        } catch (IOException e) {
            // handling input/output errors
            System.out.println("An error occurred: "+ e.getMessage());
        }
    }
}