package Lab_03;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of elements in array: ");
        int elementsAmount = scanner.nextInt();
        int[] intArray = new int[elementsAmount];
        System.out.println("Enter each elements of the array:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.print("a[" + i + "]" + "=");
            intArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < intArray.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < intArray.length; j++){
                if (intArray[j] < intArray[min]) {
                    min = j;
                }
            }
            int temp = intArray[min];
            intArray[min] = intArray[i];
            intArray[i] = temp;
        }
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
