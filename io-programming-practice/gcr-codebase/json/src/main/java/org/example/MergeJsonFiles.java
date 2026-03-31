package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;

public class MergeJsonFiles {
    public static void main(String[] args) {
        try {
            // preparing the object mapper
            ObjectMapper mapper = new ObjectMapper();

            // reading both files
            JsonNode root1 = mapper.readTree(new File("file1.json"));
            JsonNode root2 = mapper.readTree(new File("file2.json"));

            // casting to ObjectNode to allow modification
            ObjectNode mergedNode = (ObjectNode) root1;
            ObjectNode node2 = (ObjectNode) root2;

            // merging fields from second file into the first
            node2.fields().forEachRemaining(entry ->
                    mergedNode.set(entry.getKey(), entry.getValue())
            );

            // writing the result to console or new file
            System.out.println(mergedNode.toPrettyString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}