package activity_baritogo_tabigue_lustre;

import java.util.Scanner;
import java.util.ArrayList;

public class Activity_Baritogo_Tabigue_Lustre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. MDAS Operations");
            System.out.println("2. Calculate Mean");
            System.out.println("3. Enter User Details (Full Name, Age, Grade Level)");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    performMdasOperations(scanner);
                    break;
                case 2:
                    calculateMean(scanner);
                    break;
                case 3:
                    Class_2 user = new Class_2();
                    user.getUserDetails();
                    break;
                case 4:
                    running = false; 
                    break;
                default:
                    System.out.println("Invalid choice. Please choose between 1 and 4.");
            }
        }

        scanner.close();
    }

    private static void performMdasOperations(Scanner scanner) {
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
    }

    private static void calculateMean(Scanner scanner) {
        ArrayList<Double> numbers = new ArrayList<>();
        System.out.println("Enter numbers to calculate the mean (type 'done' to finish):");

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
            System.out.println("The mean of the entered numbers is: " + mean);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}

