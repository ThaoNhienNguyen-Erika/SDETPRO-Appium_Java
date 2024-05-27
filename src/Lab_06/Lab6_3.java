package Lab_06;

import java.util.Scanner;

public class Lab6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a String including digits and characters: ");
        String myStr = scanner.nextLine();
        String newStr = "";
        char[] myCharacters = myStr.toCharArray();
        for (char character : myCharacters) {
            if(Character.isDigit(character)){
                newStr = newStr + character;
            }
        }
        System.out.println("New String without characters: " + newStr);
    }
}
