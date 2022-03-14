package Lab_03;

import java.util.Scanner;

public class CountEvenOddinArray {
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
        int Evennumber = 0, Oddnumber = 0;
        for (int i = 0; i < intArray.length; i++) {
            int remainder = intArray[i] % 2;
            if (remainder == 0){
                Evennumber = Evennumber + 1;
            } else {
                Oddnumber = Oddnumber + 1;
            }
        }
        System.out.println("Even numbers: " + Evennumber);
        System.out.println("Odd numbers: " + Oddnumber);
    }
}
