package Lab_05;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Lab_05 {
    public static void main(String[] args) {
        Map<Integer, String> studentList = new HashMap<>();
        Integer studentID;
        String studentName;
        Integer IDinput;
        Set<Integer> studentIDkeySet = studentList.keySet();
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("==MENU==");
            System.out.println("1. Input student info");
            System.out.println("2. Find Student by ID");
            System.out.println("0. Exit!");
            System.out.print("Please input option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Input student ID: ");
                    studentID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Input student name: ");
                    studentName = scanner.nextLine();
                    studentList.put(studentID, studentName);
                    break;
                case 2:
                    System.out.print("Input student ID to find: ");
                    IDinput = scanner.nextInt();
                    if (studentList.get(IDinput) != null) {
                        System.out.println(studentList.get(IDinput));
                    } else {
                        System.out.println("No student is founded");
                    }
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
//                case 3:
//                    System.out.println(studentList);
//                    break;
            }
        } while (option != 0);
    }
}
