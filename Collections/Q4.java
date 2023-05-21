package Assignment.Assignment.Collections;
import java.util.Date;
import java.util.LinkedList;

public class Q4 {
    public static void main(String[] args) {
        LinkedList<Date> datesOfBirth = new LinkedList<>();

        // Add dates of birth to the LinkedList
        datesOfBirth.add(new Date(100, 0, 1)); // 01-01-2000
        datesOfBirth.add(new Date(99, 1, 29)); // 29-02-1999 (not a leap year)
        datesOfBirth.add(new Date(101, 5, 25)); // 25-05-2001
        datesOfBirth.add(new Date(96, 6, 4)); // 04-07-1996 (leap year)

        // Print the dates of birth with leap year information
        for (Date date : datesOfBirth) {
            boolean isLeapYear = isLeapYear(date);
            System.out.println("Your date of birth is " + formatDate(date) + " and it " +
                    (isLeapYear ? "was" : "was not") + " a leap year.");
        }
    }

    private static boolean isLeapYear(Date date) {
        int year = date.getYear() + 1900;
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private static String formatDate(Date date) {
        int day = date.getDate();
        int month = date.getMonth() + 1;
        int year = date.getYear() + 1900;
        return String.format("%02d-%02d-%04d", day, month, year);
    }
}
