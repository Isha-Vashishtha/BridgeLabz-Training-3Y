import java.util.*;

public class RandomStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int) (Math.random() * 9000); // 4-digit random
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
        }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.println("Generated Numbers: " + Arrays.toString(arr));

        double[] stats = findAverageMinMax(arr);
        System.out.println("Average: " + stats[0]);
        System.out.println("Min: " + stats[1]);
        System.out.println("Max: " + stats[2]);
    }
}
