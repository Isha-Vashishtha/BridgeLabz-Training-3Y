public class NumberChecker1 {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        return digits;
    }

    public static boolean isDuck(int num) {
        int[] digits = getDigits(num);
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int num) {
        int[] digits = getDigits(num);
        int power = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == num;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        int num = 153;
        int[] digits = getDigits(num);

        System.out.println("Duck Number? " + isDuck(num));
        System.out.println("Armstrong Number? " + isArmstrong(num));

        int[] largest = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);

        int[] smallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}
