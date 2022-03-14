package Lab_06;

import java.util.Scanner;

public class extractDigitfromString_notRegEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String inputString = scanner.nextLine();
        char[] inputCharacters = inputString.toCharArray();
        for (char character : inputCharacters) {
            if(Character.isDigit(character)){
                System.out.print(character);
            }
        }
    }
}
