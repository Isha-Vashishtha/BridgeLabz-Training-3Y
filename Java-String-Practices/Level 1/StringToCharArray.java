import java.util.Scanner;

public class StringToCharArray {

    // Method to return characters manually
    public static char[] toCharArrayManual(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    // Method to compare char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] manualArray = toCharArrayManual(text);
        char[] builtInArray = text.toCharArray();

        boolean result = compareCharArrays(manualArray, builtInArray);

        System.out.println("Comparison of arrays: " + result);

        sc.close();
    }
}
