import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height (cm) of " + names[i] + ": ");
            heights[i] = sc.nextInt();
        }

        int minAge = ages[0], youngestIndex = 0;
        int maxHeight = heights[0], tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }

        System.out.println("Youngest Friend: " + names[youngestIndex] + " (Age " + minAge + ")");
        System.out.println("Tallest Friend: " + names[tallestIndex] + " (Height " + maxHeight + " cm)");

        sc.close();
    }
}
