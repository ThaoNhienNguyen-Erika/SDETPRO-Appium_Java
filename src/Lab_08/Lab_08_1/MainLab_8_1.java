package Lab_08.Lab_08_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainLab_8_1 {
    public static void main(String[] args) {
        createListOfEmployee();
    }

    public static void createListOfEmployee() {
        ArrayList<Employee> result = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of FTE: ");
        int numberOfFTE = sc.nextInt();

        System.out.println("Enter number of contractor: ");
        int numberOfContractor = sc.nextInt();

        for (int i = 0;  i < numberOfFTE; i++) {
            FTE newFTE = new FTE();
            result.add(newFTE);
        }

        for (int i = 0;  i < numberOfContractor; i++) {
            Contractor newContractor = new Contractor();
            result.add(newContractor);
        }

        int total = 0;
        for (Employee e: result) {
            total += e.salary();
        }
        System.out.println("Total salary: " + total);
    }
}
