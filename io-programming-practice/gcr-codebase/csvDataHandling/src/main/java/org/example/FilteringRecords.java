package org.example;
import java.io.*;

public class FilteringRecords {
    public static void main(String[] args) {
        String file= "Data/students.csv";
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            // reading the header line
            String header= br.readLine();
            if (header != null) System.out.println(header);

            // reading the rest of the file
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                // assuming column index 2 is marks
                int marks = Integer.parseInt(data[2].trim());

                // checking if marks are greater than 80
                if (marks > 80) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
