import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students;
        System.out.print("Enter number of students: ");
        students = sc.nextInt();

        int[][] marks = new int[students][3]; // 3 subjects: Physics, Chemistry, Maths
        double[] percentage = new double[students];
        char[] grade = new char[students];
        String[] remarks = new String[students];

        // Input marks
        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks of Student " + (i + 1) + " in Physics, Chemistry, Maths:");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < students; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) { grade[i] = 'A'; remarks[i] = "Level 4, above agency-normalized standards"; }
            else if (percentage[i] >= 70) { grade[i] = 'B'; remarks[i] = "Level 3, at agency-normalized standards"; }
            else if (percentage[i] >= 60) { grade[i] = 'C'; remarks[i] = "Level 2, approaching standards"; }
            else if (percentage[i] >= 50) { grade[i] = 'D'; remarks[i] = "Level 1, below standards"; }
            else if (percentage[i] >= 40) { grade[i] = 'E'; remarks[i] = "Too below standards"; }
            else { grade[i] = 'R'; remarks[i] = "Remedial standards"; }
        }

        // Display Results
        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i+1) + " -> Percentage: " + percentage[i] + "%, Grade: " + grade[i] + " (" + remarks[i] + ")");
        }

        sc.close();
    }
}
