import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


class Movie {
    String name;
    double rating;
    int year;
    Movie(String name, double rating, int year) { this.name = name; this.rating = rating; this.year = year; }
    public String toString() { return name + " (" + year + ") - " + rating; }
}

public class TopMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 9.1, 2023), new Movie("Movie B", 8.5, 2022),
            new Movie("Movie C", 9.5, 2024), new Movie("Movie D", 7.0, 2021),
            new Movie("Movie E", 8.8, 2023), new Movie("Movie F", 9.2, 2024)
        );

        movies.stream()
            .filter(m -> m.rating > 8.0) // filtering high ratings
            .sorted(Comparator.comparing((Movie m) -> m.rating).thenComparing(m -> m.year).reversed()) // sorting by rating and year
            .limit(5) // limiting to top 5
            .forEach(System.out::println); // displaying results
    }
}