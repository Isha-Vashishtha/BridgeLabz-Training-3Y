import java.util.Scanner;

public class BMIMultiPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // weight, height, BMI
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            double weight, height;
            do {
                System.out.print("Enter weight (kg) of person " + (i+1) + ": ");
                weight = sc.nextDouble();
            } while (weight <= 0);

            do {
                System.out.print("Enter height (cm) of person " + (i+1) + ": ");
                height = sc.nextDouble();
            } while (height <= 0);

            height /= 100; // convert cm to m
            double bmi = weight / (height * height);

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;

            if (bmi <= 18.4) weightStatus[i] = "Underweight";
            else if (bmi <= 24.9) weightStatus[i] = "Normal";
            else if (bmi <= 39.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("\nPerson Data:");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i+1) + " -> Weight: " + personData[i][0] + "kg, Height: " + personData[i][1] + "m, BMI: " + personData[i][2] + ", Status: " + weightStatus[i]);
        }

        sc.close();
    }
}
