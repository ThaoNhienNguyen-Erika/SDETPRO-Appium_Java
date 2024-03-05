package Lab_02_pratice;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input height: ");
        double height = scanner.nextDouble();

        System.out.print("Please input weight: ");
        double weight = scanner.nextDouble();

        double BMI = weight / (height * 2);
        System.out.printf("Your BMI: %.1f \n", BMI);

        double weightStandard = 18.6 * (height * 2);
        System.out.printf("Standard weight: %d kg \n", Math.round(weightStandard));

        if (BMI < 18.5) {
            System.out.println("You are Underweight");
            System.out.printf("You should increase %d kg", Math.round(weightStandard - weight));
        } else if (BMI < 24.9){
            System.out.println("You are Normal");
        } else if (BMI < 29.9){
            System.out.println("You are Overweight");
            System.out.printf("You should decrease %d kg", Math.round(weight - weightStandard));
        } else {
            System.out.println("You are Obese");
            System.out.printf("You should decrease %d kg", Math.round(weight - weightStandard));
        }

    }
}
