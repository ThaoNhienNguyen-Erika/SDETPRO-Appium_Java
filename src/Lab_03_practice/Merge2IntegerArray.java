package Lab_03_practice;

import java.util.Scanner;

public class Merge2IntegerArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input total elements of first integer array: ");
        int firstTotalElements = scanner.nextInt();
        int[] firstArray = new int[firstTotalElements];
        for (int elementIndex = 0; elementIndex < firstArray.length; elementIndex++) {
            System.out.print("Please input value of firstArray[" + elementIndex + "] of first array: ");
            firstArray[elementIndex] = scanner.nextInt();
        }

        System.out.print("Please input total elements of second integer array: ");
        int secondTotalElements = scanner.nextInt();
        int[] secondArray = new int[secondTotalElements];
        for (int elementIndex = 0; elementIndex < secondArray.length; elementIndex++) {
            System.out.print("Please input value of secondArray[" + elementIndex + "] of first array: ");
            secondArray[elementIndex] = scanner.nextInt();
        }

        //Merge first array to new array
        int[] mergeArray = new int[firstTotalElements + secondTotalElements];
        for (int firstElementIndex = 0; firstElementIndex < firstArray.length; firstElementIndex++) {
            mergeArray[firstElementIndex] = firstArray[firstElementIndex];
        }

        //Merge second array to new array
        for (int secondElementIndex = 0, elementIndex = firstArray.length; secondElementIndex < secondArray.length; secondElementIndex++, elementIndex++) {
            mergeArray[elementIndex] = secondArray[secondElementIndex];
        }

        System.out.print("Merged array: ");
        for (int elementIndex : mergeArray) {
            System.out.print(elementIndex + " ");
        }

        //Sort merged array in ascending order
        for (int firstElementIndex = 1; firstElementIndex < mergeArray.length; firstElementIndex++) {
            for (int secondElementIndex = 0; secondElementIndex < mergeArray.length; secondElementIndex++) {
                if(mergeArray[secondElementIndex] > mergeArray[firstElementIndex]){
                    int temp = mergeArray[secondElementIndex];
                    mergeArray[secondElementIndex] = mergeArray[firstElementIndex];
                    mergeArray[firstElementIndex] = temp;
                }
            }
        }

        System.out.print("\nSorted merged array: ");
        for (int elementIndex : mergeArray) {
            System.out.print(elementIndex + " ");
        }
    }
}
