import java.util.Scanner;

public class CharFrequencyUnique {

    // Method to find unique characters
    public static char[] uniqueCharacters(String text) {
        String unique = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < unique.length(); j++) {
                if (unique.charAt(j) == c) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unique += c;
            }
        }
        return unique.toCharArray();
    }

    // Method to find frequency using ASCII array
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // ASCII values
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] freqArray = findFrequency(text);

        System.out.println("\nCharacter Frequencies:");
        for (String[] row : freqArray) {
            System.out.println(row[0] + " - " + row[1]);
        }

        sc.close();
    }
}
