package Lab_05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SwitchCase_FindinArrayList {
    public static void main(String[] args) {

        boolean isContinuing = true;
        Map<Integer, String> studentInfo = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (isContinuing) {
            System.out.println("=====MENU======");
            System.out.println("1. Input student info");
            System.out.println("2. Find Student by ID");
            System.out.println("0. Exit!");

            System.out.println("Enter the option number: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // !
                    scanner.nextLine();

                    System.out.print("Student Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Student ID: ");
                    int id = scanner.nextInt();

                    studentInfo.put(id, name);
                    break;
                case 2:
                    if (studentInfo.isEmpty()) {
                        System.out.print("Your student info is empty.");
                    } else {
                        System.out.print("Enter student ID: ");
                        int idInput = scanner.nextInt();
                        System.out.println("Student Name: " + studentInfo.get(idInput));
                    }
                    break;
                case 0:
                    isContinuing = false;
                    break;
                default:
                    System.out.println("=====MENU======");
                    System.out.println("1. Input student info");
                    System.out.println("2. Find Student by ID");
                    System.out.println("0. Exit!");
            }
        }
    }
}
