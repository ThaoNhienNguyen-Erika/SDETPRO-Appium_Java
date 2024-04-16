package Lab_03_practice;

import java.util.Scanner;

public class SortIntegerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input total elements of an integer array: ");
        int totalElements = scanner.nextInt();
        int[] intArray = new int[totalElements];

        for (int elementIndex = 0; elementIndex < intArray.length; elementIndex++) {
            System.out.print("Please input value of intArray[" + elementIndex + "]: ");
            intArray[elementIndex] = scanner.nextInt();
        }

        //Sort all elements in ascending order
        for (int secondElementIndex = 1; secondElementIndex < intArray.length; secondElementIndex++) {
                for (int firstElementIndex = 0; firstElementIndex < intArray.length; firstElementIndex++) {
                    if (intArray[firstElementIndex] > intArray[secondElementIndex]) {
                        int temp = intArray[firstElementIndex];
                        intArray[firstElementIndex] = intArray[secondElementIndex];
                        intArray[secondElementIndex] = temp;
                    }
                }
        }

        System.out.println("Ascending sorted array: ");

        for (int elementIndex : intArray) {
            System.out.print(elementIndex  + " ");
        }
    }
}



