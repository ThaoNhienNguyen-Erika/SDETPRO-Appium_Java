package Lab_06;

import java.util.Scanner;

public class checkSSLandTopleveldomain {
    public static void main(String[] args) {
        String url = "https://google.com";
        if((url.split(":")[0]).equals("https")){
            System.out.println("The url has https");
        }
        // tld = top level domain
        if((url.split("\\.")[1]).equals("com")){
            System.out.println("The url is .com");
        }
        if((url.split("\\.")[1]).equals("net")){
            System.out.println("The url is .net");
        }
    }
}
