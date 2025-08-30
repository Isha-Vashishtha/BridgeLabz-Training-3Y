import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        int[] years = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOld = 0, totalNew = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years of service for Employee " + (i+1));
            double s = sc.nextDouble();
            int y = sc.nextInt();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input, try again!");
                i--;
                continue;
            }

            salary[i] = s;
            years[i] = y;

            if (y > 5) bonus[i] = 0.05 * s;
            else bonus[i] = 0.02 * s;

            newSalary[i] = s + bonus[i];

            totalBonus += bonus[i];
            totalOld += s;
            totalNew += newSalary[i];
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);

        sc.close();
    }
}
