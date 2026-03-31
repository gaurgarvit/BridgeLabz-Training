package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.*;

class FileProcessorTest {

    // creating a temporary directory for safe testing
    @TempDir
    Path tempDir;

    private final FileProcessor processor = new FileProcessor();

    @Test
    void testWriteAndRead() throws IOException {
        Path file = tempDir.resolve("test.txt");
        String content = "Hello JUnit";

        // writing content to the temporary file
        processor.writeToFile(file, content);

        // verifying file exists
        assertTrue(Files.exists(file));

        // reading content back to verify correctness
        assertEquals("Hello JUnit", processor.readFromFile(file));
    }

    @Test
    void testReadNonExistentFile() {
        Path missingFile = tempDir.resolve("ghost.txt");

        // checking that ioexception is thrown for missing file
        assertThrows(IOException.class, () -> processor.readFromFile(missingFile));
    }
}