package Lab_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_SwitchCase_Practice {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        int min = 0;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        int menuOption;
        do {
            System.out.println("=====MENU======");
            System.out.println("1. Add number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("5. Find index of a number");
            System.out.println("6. Exit");

            System.out.print("Option number, please: ");
            menuOption = scanner.nextInt();
            switch (menuOption){
                case 1:
                    System.out.print("Input number into ArrayList: ");
                    int numberAdded = scanner.nextInt();
                    integerList.add(numberAdded);
                    break;
                case 2:
                    System.out.println(integerList);
                    break;
                case 3:
                    if(integerList.isEmpty()){
                        System.out.println("You need to add a number into the Array List first because it is empty now.");
                    }
                    else {
                        max = integerList.get(0);
                        for (int index = 1; index < integerList.size(); index++) {
                            if (integerList.get(index) > max) {
                                max = integerList.get(index);
                            }
                        }
                        System.out.println("Maximum number: " + max);
                    }
                    break;
                case 4:
                    if(integerList.isEmpty()){
                        System.out.println("You need to add a number into the Array List first because it is empty now.");
                    }
                    else {
                        min = integerList.get(0);
                        for (int index = 1; index < integerList.size(); index++) {
                            if (integerList.get(index) < min) {
                                min = integerList.get(index);
                            }
                        }
                        System.out.println("Minimum number: " + min);
                    }
                    break;
                case 5:
                    if(integerList.size() == 0){
                        System.out.println("You need to add a number into the Array List first because it is empty now.");
                    } else {
                        System.out.print("Input number needed to find: ");
                        int numberNeedFinding = scanner.nextInt();
                        int indexNeedFinding = 0;
                        for (int index = 0; index < integerList.size(); index++) {
                            if (integerList.get(index) == numberNeedFinding) {
                                indexNeedFinding = index;
                                System.out.println("Index of the number: " + indexNeedFinding);
                                break;
                            }
                            if (index == integerList.size()-1 && integerList.get(index) != numberNeedFinding){
                                System.out.println("The number does not exist in the Array List.");
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
            }
        } while (menuOption != 6);
    }
}
