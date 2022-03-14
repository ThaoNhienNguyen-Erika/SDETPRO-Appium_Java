package Lab_03;

import java.util.Scanner;

public class MergeandSort2Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of elements in array 1: ");
        int elementsAmount1 = scanner.nextInt();
        int[] intArray1 = new int[elementsAmount1];
        System.out.println("Enter each elements of the array:");
        for (int i = 0; i < intArray1.length; i++) {
            System.out.print("a[" + i + "]" + "=");
            intArray1[i] = scanner.nextInt();
        }
        System.out.print("Enter amount of elements in array 1: ");
        int elementsAmount2 = scanner.nextInt();
        int[] intArray2 = new int[elementsAmount2];
        System.out.println("Enter each elements of the array:");
        for (int i = 0; i < intArray2.length; i++) {
            System.out.print("a[" + i + "]" + "=");
            intArray2[i] = scanner.nextInt();
        }
        int[] MergeArray = new int[elementsAmount1 + elementsAmount2];
        for (int i = 0; i < elementsAmount1; i++) {
            MergeArray[i] = intArray1[i];
        }
        for (int i = 0; i < elementsAmount2; i++) {
            MergeArray[elementsAmount1++] = intArray2[i];
        }
//        for(int i = 0; i < MergeArray.length; i++){
//            System.out.println(MergeArray[i]);
//        }
        for (int i = 0; i < MergeArray.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < MergeArray.length; j++){
                if (MergeArray[j] < MergeArray[min]) {
                    min = j;
                }
            }
            int temp = MergeArray[min];
            MergeArray[min] = MergeArray[i];
            MergeArray[i] = temp;
        }
        System.out.println("New merge sorted array: ");
        for(int i = 0; i < MergeArray.length; i++){
            System.out.println(MergeArray[i]);
        }
    }
}
