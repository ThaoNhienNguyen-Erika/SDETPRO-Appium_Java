package Lab_06;

import java.util.Scanner;

public class Lab6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input url: ");
        String url = scanner.nextLine();

        //Check SSL
        System.out.println(url.split(":")[0]);

        //Check domain name
        System.out.println("Domain name: " + url.split("//")[1]);

        //Check Top-level domain
        System.out.println("Top-level domain: ." + url.split("\\.")[1]);
    }
}
