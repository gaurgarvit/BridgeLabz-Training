import java.util.*;

public class Main {

    // registering creator
    public void registerCreator(CreatorStats record) {
        CreatorStats.engagementBoard.add(record);
    }

    // counting top-performing weeks
    public Map<String, Integer> getTopPostCounts(List<CreatorStats> records, double likeThreshold) {
        Map<String, Integer> result = new LinkedHashMap<>();

        for (CreatorStats creator : records) {
            int count = 0;
            for (double likes : creator.getWeeklyLikes()) {
                if (likes >= likeThreshold) {
                    count++;
                }
            }
            if (count > 0) {
                result.put(creator.getCreatorName(), count);
            }
        }
        return result;
    }

    // calculating average likes
    public double calculateAverageLikes() {
        double total = 0;
        int count = 0;

        for (CreatorStats creator : CreatorStats.engagementBoard) {
            for (double likes : creator.getWeeklyLikes()) {
                total += likes;
                count++;
            }
        }
        return count == 0 ? 0 : total / count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main program = new Main();

        while (true) {
            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.println("Enter Creator Name:");
                    String name = sc.nextLine();

                    double[] likes = new double[4];
                    System.out.println("Enter weekly likes (Week 1 to 4):");
                    for (int i = 0; i < 4; i++) {
                        likes[i] = sc.nextDouble();
                    }

                    CreatorStats creator = new CreatorStats(name, likes);
                    program.registerCreator(creator);
                    System.out.println("Creator registered successfully");
                    break;

                case 2:
                    System.out.println("Enter like threshold:");
                    double threshold = sc.nextDouble();

                    Map<String, Integer> topCreators =
                            program.getTopPostCounts(CreatorStats.engagementBoard, threshold);

                    if (topCreators.isEmpty()) {
                        System.out.println("No top-performing posts this week");
                    } else {
                        for (Map.Entry<String, Integer> entry : topCreators.entrySet()) {
                            System.out.println(entry.getKey() + " - " + entry.getValue());
                        }
                    }
                    break;

                case 3:
                    double avg = program.calculateAverageLikes();
                    System.out.println("Overall average weekly likes: " + (int) avg);
                    break;

                case 4:
                    System.out.println("Logging off - Keep Creating with StreamBuzz!");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
