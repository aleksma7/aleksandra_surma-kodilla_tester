public class LeapYear {
    public static void main(String [] args) {
        int year=2023;
        System.out.println(year);
        System.out.println("Is it a leap year?");

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            boolean isALeapYear = true;
            System.out.println(isALeapYear);
        } else {
            boolean isALeapYear = false;
            System.out.println(isALeapYear);
        }
        }
    }
