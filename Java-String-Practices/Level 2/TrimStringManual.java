import java.util.Scanner;

public class TrimStringManual {

    public static String trimManual(String text) {
        int start=0, end=text.length()-1;
        while (start<=end && text.charAt(start)==' ') start++;
        while (end>=start && text.charAt(end)==' ') end--;
        return text.substring(start, end+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        String manual = trimManual(text);
        String builtin = text.trim();

        System.out.println("Manual trim: [" + manual + "]");
        System.out.println("Built-in trim: [" + builtin + "]");
        System.out.println("Are equal? " + manual.equals(builtin));
    }
}
