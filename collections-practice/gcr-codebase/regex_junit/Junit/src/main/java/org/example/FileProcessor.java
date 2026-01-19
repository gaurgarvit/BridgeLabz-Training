package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessor {
    public void writeToFile(Path path, String content) throws IOException {
        Files.writeString(path, content);
    }

    public String readFromFile(Path path) throws IOException {
        return Files.readString(path);
    }
}