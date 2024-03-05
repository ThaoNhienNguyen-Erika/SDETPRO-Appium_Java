package Lab_02_pratice;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int number = scanner.nextInt();

        if (number % 2 != 0){
            System.out.printf("%d is an odd number", number);
        } else {
            System.out.printf("%d is an even number", number);
        }
    }
}
