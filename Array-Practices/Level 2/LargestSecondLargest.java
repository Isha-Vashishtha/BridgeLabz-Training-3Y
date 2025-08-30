import java.util.Scanner;

public class LargestSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        int maxDigit = 10;  // initial size of array
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits of the number
        while (num > 0) {
            // If array is full, increase its size by 10
            if (index == maxDigit) {
                maxDigit += 10; // increase size
                int[] temp = new int[maxDigit]; // new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i]; // copy old elements
                }
                digits = temp; // reassign
            }

            digits[index] = (int)(num % 10);
            index++;
            num /= 10;
        }

        // Find largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Output results
        System.out.println("Largest digit = " + largest);
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest digit does not exist.");
        } else {
            System.out.println("Second largest digit = " + secondLargest);
        }

        sc.close();
    }
}
