import java.util.Scanner;

public class ReverseAndLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Find count of digits
        int temp = number;
        int count = 0;
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        // Step 3: Store digits in array
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Step 4: Create reverse array
        int[] reverseDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

        // Step 5: Display reversed number
        System.out.print("Reversed number: ");
        for (int d : reverseDigits) {
            System.out.print(d);
        }
        System.out.println();

        // Step 6: Find largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        // Step 7: Display results
        System.out.println("Largest digit: " + largest);
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest digit: Not available (all digits are same)");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }

        sc.close();
    }
}
