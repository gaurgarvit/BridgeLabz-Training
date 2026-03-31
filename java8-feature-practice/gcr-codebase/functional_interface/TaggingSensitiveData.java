interface SensitiveData {}

class PublicFile {
    String content = "General Info";
}

class PasswordFile implements SensitiveData {
    String content = "SuperSecret123";
}

public class TaggingSensitiveData {
    
    static void processFile(Object file) {
        if (file instanceof SensitiveData) {
            System.out.println("Encrypting data before processing...");
        } else {
            System.out.println("Processing data normally.");
        }
    }

    public static void main(String[] args) {
        processFile(new PublicFile());
        processFile(new PasswordFile());
    }
}