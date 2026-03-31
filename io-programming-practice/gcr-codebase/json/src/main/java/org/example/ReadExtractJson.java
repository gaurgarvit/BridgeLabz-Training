package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadExtractJson {
    public static void main(String[] args) {
        try {
            // initializing the mapper
            ObjectMapper mapper = new ObjectMapper();

            // reading the json file into a node tree
            JsonNode rootNode = mapper.readTree(new File("data.json"));

            // extracting specific fields by name
            String name = rootNode.get("name").asText();
            String email = rootNode.get("email").asText();

            // printing the extracted values
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);

        } catch (Exception e) {
            // handling potential io or parsing errors
            System.out.println("Error: Ensure data.json exists.");
            e.printStackTrace();
        }
    }
}
