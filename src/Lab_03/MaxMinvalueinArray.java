package Lab_03;

import java.util.Scanner;

public class MaxMinvalueinArray {
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
        int max = intArray[0];
        int min = intArray[0];
        for (int i = 0; i < intArray.length; i++){
            if(intArray[i]>max){
                max=intArray[i];
            }
            if(intArray[i]<min){
                min=intArray[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
