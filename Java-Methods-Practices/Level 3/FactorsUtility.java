import java.util.Arrays;

public class FactorsUtility {
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        int max = Integer.MIN_VALUE;
        for (int f : factors) if (f > max) max = f;
        return max;
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int prod = 1;
        for (int f : factors) prod *= f;
        return prod;
    }

    public static double productOfCubeOfFactors(int[] factors) {
        double prod = 1;
        for (int f : factors) prod *= Math.pow(f, 3);
        return prod;
    }

    public static void main(String[] args) {
        int num = 12;
        int[] factors = findFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest factor: " + greatestFactor(factors));
        System.out.println("Sum: " + sumOfFactors(factors));
        System.out.println("Product: " + productOfFactors(factors));
        System.out.println("Product of cubes: " + productOfCubeOfFactors(factors));
    }
}
