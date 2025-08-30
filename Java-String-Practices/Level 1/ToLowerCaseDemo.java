import java.util.Scanner;

public class ToLowerCaseDemo {

    public static String toLowerCaseManual(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String manual = toLowerCaseManual(text);
        String builtIn = text.toLowerCase();

        System.out.println("Manual lowercase: " + manual);
        System.out.println("Built-in lowercase: " + builtIn);
        System.out.println("Comparison result: " + compareUsingCharAt(manual, builtIn));

        sc.close();
    }
}
