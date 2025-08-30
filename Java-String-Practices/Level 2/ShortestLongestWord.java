import java.util.Scanner;

public class ShortestLongestWord {

    public static String[] splitManual(String text) {
        return text.split(" ");
    }

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static String[] findShortestLongest(String[] words) {
        String shortest = words[0], longest = words[0];
        for (String word : words) {
            if (findLength(word) < findLength(shortest)) shortest = word;
            if (findLength(word) > findLength(longest)) longest = word;
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitManual(text);
        String[] result = findShortestLongest(words);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
