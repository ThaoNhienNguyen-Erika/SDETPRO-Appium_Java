package Lab_06;

import java.util.Scanner;

public class Lab6_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input url: ");
        String url = scanner.nextLine();
        String SSLcheckStr = "";
        String rawRootDomain = "";
        String domainName = "";

        //Check SSL
        String[] SSLcheckStrArr = url.split(":");
        for (int count = 0; count < SSLcheckStrArr.length; count++) {
            if(count == 0) {
                SSLcheckStr = SSLcheckStrArr[count];
            }
            if(count == 1){
                rawRootDomain = SSLcheckStrArr[count];
            }
        }
        System.out.println(SSLcheckStr);

        //Check domain name
        String[] domainNameStrArr = rawRootDomain.split("//");

        for (int count = 0; count < domainNameStrArr.length; count++) {
            if(count == 1) {
                domainName = domainName + domainNameStrArr[count];
                System.out.println("Domain name: " + domainName);
            }
        }

        if(domainName.contains(".com")){
            System.out.println("Top-level Domain: .com");
        }
        if(domainName.contains(".net")){
            System.out.println("Top-level Domain: .net");
        }
    }
}
