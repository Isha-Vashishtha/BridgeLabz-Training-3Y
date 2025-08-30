import java.util.Scanner;

public class VowelConsonantTable {

    public static String checkCharType(char ch) {
        if (!Character.isLetter(ch)) return "Not a Letter";
        ch = Character.toLowerCase(ch);
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') ? "Vowel" : "Consonant";
    }

    public static String[][] analyzeText(String text) {
        String[][] result = new String[text.length()][2];
        for (int i=0;i<text.length();i++) {
            result[i][0] = String.valueOf(text.charAt(i));
            result[i][1] = checkCharType(text.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] table = analyzeText(text);
        System.out.println("Char\tType");
        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
}
