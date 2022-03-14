package Lab_02;

import java.util.Scanner;

public class AdvancedBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height (m): ");
        double height = scanner.nextDouble();
        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();
        double BMI = weight / (height * height);
        double WeightGained = 18.5 * (height * height) - weight;
        if (BMI < 18.5) {
            System.out.printf("You are underweight because your BMI is %.1f and you should increase %.0f kg", BMI, WeightGained);
        } else if (BMI >= 18.5 && BMI <= 24.9){
            System.out.printf("You are normal because your BMI is %.1f", BMI);
        }
        else if (BMI >= 25.0 && BMI <= 29.9){
            System.out.printf("You are overweight because your BMI is %.1f and you should decrease %.0f kg", BMI, WeightGained);
        }
        else if (BMI >= 30.0){
            System.out.printf("You are obese because your BMI is %.1f and you should decrease %.0f kg", BMI, weight - 18.5 * (height * height));
        }
    }
}
