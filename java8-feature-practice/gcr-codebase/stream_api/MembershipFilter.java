import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

class Member {
    String name;
    LocalDate expiryDate;
    Member(String name, LocalDate expiryDate) { this.name = name; this.expiryDate = expiryDate; }
    public String toString() { return name + " expires: " + expiryDate; }
}

public class MembershipFilter {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new Member("Alice", LocalDate.now().plusDays(10)),
            new Member("Bob", LocalDate.now().plusDays(45))
        );

        members.stream()
            .filter(m -> m.expiryDate.isBefore(LocalDate.now().plusDays(30))) // filtering upcoming expirations
            .forEach(System.out::println); // displaying results
    }
}