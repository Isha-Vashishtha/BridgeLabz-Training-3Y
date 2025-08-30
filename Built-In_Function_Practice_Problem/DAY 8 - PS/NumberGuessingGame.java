import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int low = 1, high = 100;
        String feedback;

        System.out.println("Think of a number between 1 and 100.");
        do {
            int guess = rand.nextInt(high - low + 1) + low;
            System.out.println("Is your number " + guess + "? (Enter high/low/correct): ");
            feedback = sc.nextLine().toLowerCase();

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
        } while (!feedback.equals("correct"));

        System.out.println("Yay! I guessed your number!");
        sc.close();
    }
}
