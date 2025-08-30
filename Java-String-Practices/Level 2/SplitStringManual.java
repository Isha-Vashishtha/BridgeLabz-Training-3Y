import java.util.Scanner;

public class SplitStringManual {

    public static String[] splitManual(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] manualSplit = splitManual(text);
        String[] builtInSplit = text.split(" ");

        System.out.println("Manual split:");
        for (String w : manualSplit) System.out.println(w);

        System.out.println("Built-in split:");
        for (String w : builtInSplit) System.out.println(w);

        System.out.println("Both equal? " + compareArrays(manualSplit, builtInSplit));
    }
}
