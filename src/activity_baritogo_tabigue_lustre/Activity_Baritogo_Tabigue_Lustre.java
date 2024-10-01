
package activity_baritogo_tabigue_lustre;

import java.util.Scanner;
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
        
        
        scanner.close();
    }    
    
    
}
