// File: LargestSecondLargestDigit.java

import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Define array to store digits
        int maxDigit = 10; 
        int[] digits = new int[maxDigit];

        // Step 3: Index for array
        int index = 0;

        // Step 4: Extract digits from number
        while (number != 0) {
            int digit = number % 10;   // last digit
            digits[index] = digit;
            index++;
            number = number / 10;      // remove last digit

            // Stop if array is full
            if (index == maxDigit) {
                break;
            }
        }

        // Step 5: Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // Step 6: Loop through digits to find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Step 7: Display result
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
