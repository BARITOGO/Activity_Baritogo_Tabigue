package activity_baritogo_tabigue_lustre;

import java.util.Scanner;
import java.util.ArrayList;

public class Activity_Baritogo_Tabigue_Lustre {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("World");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num2 != 0 ? num1 / num2 : Double.NaN;

        System.out.println("Results:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);

        ArrayList<Double> numbers = new ArrayList<>();

        scanner.nextLine();

        System.out.println("Enter more numbers to calculate the mean (type 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                double number = Double.parseDouble(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        if (numbers.size() > 0) {
            double mean = Mean.Mean(numbers);
            System.out.println("The mean of the additional numbers is: " + mean);
        } else {
            System.out.println("No additional numbers were entered.");
        }

        scanner.close();
    }
}
