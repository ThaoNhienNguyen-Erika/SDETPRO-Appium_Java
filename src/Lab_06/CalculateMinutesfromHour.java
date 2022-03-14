package Lab_06;

public class CalculateMinutesfromHour {
    public static void main(String[] args) {
        String input = "2hrs and 5 minutes";
        int hours = Integer.parseInt(String.valueOf(input.charAt(0)));
        int minutes = Integer.parseInt(String.valueOf(input.charAt(9)));
        System.out.println("Total minutes: " + (hours*60+minutes));
    }
}
