import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Operation: 1. Add  2. Subtract  3. Multiply  4. Divide");
        int choice = sc.nextInt();

        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result = " + add(a, b));
                break;
            case 2:
                System.out.println("Result = " + subtract(a, b));
                break;
            case 3:
                System.out.println("Result = " + multiply(a, b));
                break;
            case 4:
                if (b != 0)
                    System.out.println("Result = " + divide(a, b));
                else
                    System.out.println("Error! Division by zero.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}
