package Lab_06;

import java.util.Scanner;

public class Lab6_2 {
    public static void main(String[] args) {
        String myPassword = "password123";
        Scanner scanner = new Scanner(System.in);
        String userInput;
        for (int count = 0; count < 3; count++) {
            System.out.print("Input password: ");
            userInput = scanner.nextLine();
            if (myPassword.equals(userInput)){
                System.out.println("Correct password!");
                break;
            } else {
                System.out.println("Incorrect password!");
            }
        }
    }
}
