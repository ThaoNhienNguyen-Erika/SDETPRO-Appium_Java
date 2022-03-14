package Lab_06;

import java.util.Scanner;

public class stringEquals {
    public static void main(String[] args) {
        String myPassword = "password123";
        boolean isContinuing = true;
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the password: ");
            String inputPassword = scanner.nextLine();
            if(inputPassword.equals(myPassword)) {
                System.out.println("Correct password!");
                break;
            } else{
                System.out.println("Incorrect password!");
            }
        }
    }
}
