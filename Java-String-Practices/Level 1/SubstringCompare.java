import java.util.Scanner;

public class SubstringCompare {

    // Method to create substring using charAt()
    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < str.length(); i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String userSubstring = substringUsingCharAt(text, start, end);
        String builtInSubstring = text.substring(start, end);

        System.out.println("User defined substring: " + userSubstring);
        System.out.println("Built-in substring: " + builtInSubstring);

        System.out.println("Comparison result: " + compareUsingCharAt(userSubstring, builtInSubstring));

        sc.close();
    }
}
