import java.util.Random;

public class FootballTeamHeights {
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) sum += h;
        return sum;
    }

    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = Integer.MAX_VALUE;
        for (int h : heights) if (h < min) min = h;
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = Integer.MIN_VALUE;
        for (int h : heights) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150–250
        }

        System.out.println("Heights of players:");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nShortest: " + findShortest(heights));
        System.out.println("Tallest: " + findTallest(heights));
        System.out.println("Mean: " + findMean(heights));
    }
}
