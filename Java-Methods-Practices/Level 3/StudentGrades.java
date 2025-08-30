import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] phy = new int[n];
        int[] chem = new int[n];
        int[] math = new int[n];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for student " + (i + 1) + ":");

            // Physics
            System.out.print("Physics: ");
            phy[i] = sc.nextInt();
            if (phy[i] < 0) {
                System.out.println("Invalid! Enter positive value.");
                i--; // repeat for same student
                continue;
            }

            // Chemistry
            System.out.print("Chemistry: ");
            chem[i] = sc.nextInt();
            if (chem[i] < 0) {
                System.out.println("Invalid! Enter positive value.");
                i--;
                continue;
            }

            // Maths
            System.out.print("Maths: ");
            math[i] = sc.nextInt();
            if (math[i] < 0) {
                System.out.println("Invalid! Enter positive value.");
                i--;
                continue;
            }

            // Percentage
            percent[i] = (phy[i] + chem[i] + math[i]) / 3.0;

            // Grade determination
            if (percent[i] >= 80) grade[i] = 'A';
            else if (percent[i] >= 70) grade[i] = 'B';
            else if (percent[i] >= 60) grade[i] = 'C';
            else if (percent[i] >= 50) grade[i] = 'D';
            else if (percent[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        // Display result
        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-8s\n", "Physics", "Chemistry", "Maths", "Percent", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-8c\n",
                    phy[i], chem[i], math[i], percent[i], grade[i]);
        }

        sc.close();
    }
}
