import java.util.function.Function;

public class CheckingStringLength {
    public static void main(String[] args) {
        // Function takes a String and returns an Integer
        Function<String, Integer> getLength = (str) -> str.length();

        String message = "Hello Java Interface";
        int len = getLength.apply(message);

        System.out.println("Message: " + message);
        System.out.println("Character count: " + len);
    }
}