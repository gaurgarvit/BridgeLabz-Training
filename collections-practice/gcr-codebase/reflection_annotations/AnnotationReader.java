import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// defining a custom annotation for author details
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

// applying the annotation to a class
@Author(name = "Gemini AI")
class Library { }

public class AnnotationReader {
    public static void main(String[] args) {
        // checking if the class has the specific annotation
        if (Library.class.isAnnotationPresent(Author.class)) {
            Author auth = Library.class.getAnnotation(Author.class);
            // printing the metadata stored in the annotation
            System.out.println("Author of class: " + auth.name());
        }
    }
}