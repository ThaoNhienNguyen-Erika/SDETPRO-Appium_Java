package Lab_03_practice;

import java.util.Scanner;

public class CountOddEveninArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input total elements of an array: ");
        int totalElements = scanner.nextInt();
        int[] intArray = new int[totalElements];
        int totalEven = 0;
        int totalOdd = 0;

        for (int elementIndex = 0; elementIndex < intArray.length; elementIndex++) {
            System.out.print("Please input value of intArray[" + elementIndex + "]: ");
            intArray[elementIndex] = scanner.nextInt();
            int remainder = intArray[elementIndex] % 2;
            if (remainder == 0){
                totalEven++;
            }
            else {
                totalOdd++;
            }
        }

        System.out.println("Total even numbers: " + totalEven);
        System.out.println("Total odd numbers: " + totalOdd);

    }
}
