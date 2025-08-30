import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take date input
        System.out.print("Enter date in format (yyyy-mm-dd): ");
        String inputDate = sc.next();
        LocalDate date = LocalDate.parse(inputDate);

        // Add 7 days, 1 month, and 2 years
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks
        LocalDate finalDate = modifiedDate.minusWeeks(3);

        System.out.println("Original Date: " + date);
        System.out.println("After modifications: " + finalDate);

        sc.close();
    }
}
