import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book {
    String title;
    String genre;
    int pages;
    Book(String title, String genre, int pages) { this.title = title; this.genre = genre; this.pages = pages; }
}

public class BookStatistics {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Book A", "Fiction", 300), new Book("Book B", "Fiction", 450),
            new Book("Book C", "Tech", 200), new Book("Book D", "Tech", 600)
        );

        // finding pages statistics per genre
        Map<String, IntSummaryStatistics> genreStats = books.stream()
            .collect(Collectors.groupingBy(
                b -> b.genre,
                Collectors.summarizingInt(b -> b.pages) // summarizing total, average, and max pages
            ));

        genreStats.forEach((genre, stats) -> {
            System.out.println(genre + " -> Total: " + stats.getSum() + 
                               ", Avg: " + stats.getAverage() + 
                               ", Max: " + stats.getMax());
        });
    }
}