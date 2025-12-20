import java.util.*;
class DayOfWeek {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking date, month and year input from user
        System.out.print("Enter date, month and year: ");
        int d = s.nextInt();
        int m = s.nextInt();
        int y = s.nextInt();

        // calculating day of the week using Zeller's Congruence
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println("Day of Week" + d0);
    }
}