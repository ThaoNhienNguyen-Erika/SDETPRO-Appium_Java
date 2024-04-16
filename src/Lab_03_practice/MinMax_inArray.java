package Lab_03_practice;

import java.util.Scanner;

public class MinMax_inArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input total elements of an intArray: ");
        int totalElement = scanner.nextInt();
        int[] intArray = new int[totalElement];

        for (int elementIndex = 0; elementIndex < intArray.length; elementIndex++) {
            System.out.print("Please input value of intArray[" + elementIndex + "]: ");
            intArray[elementIndex] = scanner.nextInt();
        }

        int min = intArray[0];
        int max = intArray[0];

        for (int elementIndex = 1; elementIndex < intArray.length; elementIndex++) {
            if (intArray[elementIndex] < min) {
                min = intArray[elementIndex];
            }
            if (intArray[elementIndex] > max) {
                max = intArray[elementIndex];
            }
        }

        System.out.println("Minimum value in intArray: " + min);
        System.out.println("Maxmium value in intArray: " + max);
    }

}
