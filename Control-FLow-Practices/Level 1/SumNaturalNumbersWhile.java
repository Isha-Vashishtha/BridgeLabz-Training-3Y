import java.util.Scanner;

public class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int formulaSum = n * (n + 1) / 2;

            int i = 1, loopSum = 0;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            System.out.println("Formula result = " + formulaSum);
            System.out.println("While loop result = " + loopSum);
        } else {
            System.out.println("Invalid input. Not a natural number.");
        }
    }
}
