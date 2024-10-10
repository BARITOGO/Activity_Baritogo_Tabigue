package activity_baritogo_tabigue_lustre;

import java.util.Scanner;

public class Class_2 {

    public void getUserDetails() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Type 'done' to finish");
            System.out.print("Enter your Full Name: ");
            String fullName = scanner.nextLine();
            if (fullName.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter your Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter your Grade Level: ");
            int gradeLevel = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Full Name: " + fullName);
            System.out.println("Age: " + age);
            System.out.println("Grade Level: " + gradeLevel);
            System.out.println();
        }
    }
}