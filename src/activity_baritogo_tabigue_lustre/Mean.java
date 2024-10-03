package activity_baritogo_tabigue_lustre;

import java.util.ArrayList;

public class Mean {

    // Method to calculate the mean of an ArrayList of numbers
    public static double Mean(ArrayList<Double> numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return (numbers.size() > 0) ? sum / numbers.size() : 0;
    }
}