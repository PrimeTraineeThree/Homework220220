package corejava.statments.conditional;

public class DaysOfWeekWithSwitch {

    public static void main(String[] args) {
        int day = 4;

        switch (day) {
            case  1 :
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Input is not valid");
        }
    }
}