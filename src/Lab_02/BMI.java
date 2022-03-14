package Lab_02;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height (m): ");
        float height = scanner.nextFloat();
        System.out.print("Enter your weight: ");
        float weight = scanner.nextFloat();
        float BMI = weight / (height * height);
        if (BMI < 18.5) {
            System.out.printf("You are underweight because your BMI is %.1f", BMI);
        } else if (BMI >= 18.5 && BMI <= 24.9){
            System.out.printf("You are normal because your BMI is %.1f", BMI);
        }
        else if (BMI >= 25.0 && BMI <= 29.9){
            System.out.printf("You are overweight because your BMI is %.1f", BMI);
        }
        else if (BMI >= 30.0){
            System.out.printf("You are very overweight because your BMI is %.1f", BMI);
        }
    }
}
