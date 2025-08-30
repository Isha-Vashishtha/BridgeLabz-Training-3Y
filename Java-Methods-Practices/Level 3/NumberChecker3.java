import java.util.Arrays;

public class NumberChecker3 {
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int num) {
        int[] digits = getDigits(num);
        return arraysEqual(digits, reverseArray(digits));
    }

    public static void main(String[] args) {
        int num = 121;
        int[] digits = getDigits(num);
        System.out.println("Palindrome? " + isPalindrome(num));
        System.out.println("Original: " + Arrays.toString(digits));
        System.out.println("Reversed: " + Arrays.toString(reverseArray(digits)));
    }
}
