package Lab_03_practice;

import java.util.Scanner;

public class Merge2SortedIntegerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input total elements of first array: ");
        int firstTotalElements = scanner.nextInt();
        int[] firstArray = new int[firstTotalElements];

        for (int elementIndex = 0; elementIndex < firstArray.length; elementIndex++) {
            System.out.print("Please input value of firstArray[" + elementIndex + "]: ");
            firstArray[elementIndex] = scanner.nextInt();
        }

        System.out.print("Please input total elements of second array: ");
        int secondTotalElements = scanner.nextInt();
        int[] secondArray = new int[secondTotalElements];

        for (int elementIndex = 0; elementIndex < secondArray.length; elementIndex++) {
            System.out.print("Please input value of secondArray[" + elementIndex + "]: ");
            secondArray[elementIndex] = scanner.nextInt();
        }

        int[] mergeArray = new int[firstTotalElements + secondTotalElements];
            for (int elementIndex = 0; elementIndex < firstArray.length; elementIndex++) {
                mergeArray[elementIndex] = firstArray[elementIndex];
            }

        for (int elementIndex : mergeArray) {
            System.out.print(elementIndex + " ");
        }

            for (int secondElementIndex = 0, elementIndex = firstArray.length; secondElementIndex < secondArray.length; secondElementIndex++, elementIndex++) {
                mergeArray[elementIndex] = secondArray[secondElementIndex];
            }

        System.out.print("Merge array: ");

        for (int elementIndex : mergeArray) {
            System.out.print(elementIndex + " ");
        }
    }
}
