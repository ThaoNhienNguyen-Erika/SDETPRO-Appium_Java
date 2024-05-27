package Lab_06;

public class Lab6_1 {
    public static void main(String[] args){
        String originalString = "2hrs and 5 minutes";
        Integer hour = Integer.parseInt(originalString.substring(0, 1));
        Integer min = Integer.parseInt(originalString.substring(9, 10));

        System.out.println("Total minutes: " + (hour * 60 + min));
    }
}
