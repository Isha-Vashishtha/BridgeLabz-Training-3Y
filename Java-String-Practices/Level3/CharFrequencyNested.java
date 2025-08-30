import java.util.Scanner;

public class CharFrequencyNested {

    // Method to find frequency of characters
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        // Initialize frequencies
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
        }

        // Nested loop to check duplicates
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;  // Already counted
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate as counted
                }
            }
        }

        // Store results in 1D String array
        String[] result = new String[chars.length];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " - " + freq[i];
            }
        }

        // Trim unused null values
        String[] finalResult = new String[index];
        System.arraycopy(result, 0, finalResult, 0, index);
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] freqArray = findFrequency(text);

        System.out.println("\nCharacter Frequencies:");
        for (String s : freqArray) {
            System.out.println(s);
        }

        sc.close();
    }
}
