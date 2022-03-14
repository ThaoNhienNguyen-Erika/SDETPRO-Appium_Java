package Lab_02;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int remainder = number % 2;
        if (remainder == 0){
            System.out.printf("%d is even number because remainder is 0", number);
        } else {
            System.out.printf("%d is odd number because remainder is not 0", number);
        }
    }
}
