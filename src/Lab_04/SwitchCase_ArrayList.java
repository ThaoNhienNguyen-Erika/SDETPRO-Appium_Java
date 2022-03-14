package Lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwitchCase_ArrayList {
    public static void main(String[] args) {
        boolean isContinuing = true;
        List<Integer> myIntList = new ArrayList<>();


        while (isContinuing) {
            int listLength = myIntList.size();
            System.out.println("=====MENU======");
            System.out.println("1. Add number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("5. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the option number: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter a number: ");
                    int number = scanner.nextInt();
                    myIntList.add(number);
                    break;
                case 2:
                    if (myIntList.isEmpty()) {
                        System.out.println("Your ArrayList is empty.");
                    } else {
                        System.out.println(myIntList);
                    }
                    break;
                case 3:
                    int max = myIntList.get(0);
//
//                    for (int item : myIntList) {
//                        if (item > max) max = item;
//                    }
//
//                    System.out.println("Maxmimum number: " + max);
//
                    for (int i = 0; i < listLength; i++) {
                        if (myIntList.get(i) > max) {
                            max = myIntList.get(i);
                        }
                    }
                    System.out.println("Maxmimum number: " + max);
                    break;
                case 4:
                    int min = myIntList.get(0);
                    for (int i = 0; i < listLength; i++) {
                        if (myIntList.get(i) < min) {
                            min = myIntList.get(i);
                        }
                    }
                    System.out.println("Minimum number: " + min);
                    break;
                case 5:
                    isContinuing = false;
                    break;
                default:
                    System.out.println("=====MENU======");
                    System.out.println("1. Add number into ArrayList");
                    System.out.println("2. Print numbers");
                    System.out.println("3. Get maximum number");
                    System.out.println("4. Get minimum number");
                    System.out.println("5. Exit");
            }
        }
    }
}
