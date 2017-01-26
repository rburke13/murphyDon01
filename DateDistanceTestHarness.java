public class DateDistanceTestHarness {

    private static int attempts = 0;
    private static int successes = 0;

    private static String MON = "Monday";
    private static String TUES = "Tuesday";
    private static String WED = "Wednesday";
    private static String THURS = "Thursday";
    private static String FRI = "Friday";
    private static String SAT = "Saturday";
    private static String SUN = "Sunday";

    public static void main(String[] args) {
        attempts = 0;
        successes = 0;

        test_isLeapYear();
        test_daysInMonth();
        test_isValidDate();
        test_daysBetween();
        test_dayOfTheWeek();
        test_longformDate();

        System.out.println("-----OVERALL PERFORMANCE-----");
        System.out.println(successes + "/" + attempts + " tests passed.");
    }

    private static void displaySuccessIfTrue(boolean value) {
        attempts++;
        successes += value ? 1 : 0;

        System.out.println(value ? "success" : "failure");
    }

    public static void test_isLeapYear(){

        System.out.println("Testing isLeapYear...");
        int initialSuccesses = successes;
        int initialAttempts = attempts;

        try {
            displaySuccessIfTrue(!DateDistance.isLeapYear(1887));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.isLeapYear(1200));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(!DateDistance.isLeapYear(1634));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.isLeapYear(2000));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.isLeapYear(1996));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.isLeapYear(2020));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(!DateDistance.isLeapYear(1700));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        System.out.println("isLeapYear: " + (successes - initialSuccesses) + "/" + (attempts - initialAttempts) + " passed");
    }

    public static void test_daysInMonth(){
        System.out.println("Testing daysInMonth...");
        int initialSuccesses = successes;
        int initialAttempts = attempts;

        try {
            displaySuccessIfTrue(DateDistance.daysInMonth(1, 2000) == 31);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.daysInMonth(3, 2000) == 31);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.daysInMonth(4, 2000) == 30);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.daysInMonth(5, 2000) == 31);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.daysInMonth(6, 2000) == 30);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.daysInMonth(7, 2000) == 31);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.daysInMonth(8, 2000) == 31);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.daysInMonth(9, 2000) == 30);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.daysInMonth(10, 2000) == 31);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.daysInMonth(11, 2000) == 30);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.daysInMonth(12, 2000) == 31);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.daysInMonth(2, 2000) == 29);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.daysInMonth(2, 1999) == 28);
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.daysInMonth(0, 1999) <= 0);
        } catch(Exception e) {
            displaySuccessIfTrue(true);
        }

        try {
            displaySuccessIfTrue(DateDistance.daysInMonth(13, 1999) <= 0);
        } catch(Exception e) {
            displaySuccessIfTrue(true);
        }

        try {
            displaySuccessIfTrue(DateDistance.daysInMonth(-3, 1999) <= 0);
        } catch(Exception e) {
            displaySuccessIfTrue(true);
        }

        System.out.println("daysInMonth: " + (successes - initialSuccesses) + "/" + (attempts - initialAttempts) + " passed");
    }

    public static void test_isValidDate(){
        System.out.println("Testing isValidDate...");
        int initialSuccesses = successes;
        int initialAttempts = attempts;

        try {
            displaySuccessIfTrue(DateDistance.isValidDate(3, 1, 2000));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.isValidDate(22, 6, 2809));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.isValidDate(16, 7, 1432));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.isValidDate(14, 2, 2071));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.isValidDate(24, 9, 1710));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(!DateDistance.isValidDate(18, 13, 1778));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(!DateDistance.isValidDate(31, 0, 2539));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(!DateDistance.isValidDate(10, -2, 1625));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(!DateDistance.isValidDate(6, 6, -3));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(!DateDistance.isValidDate(0, 4, 2019));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(!DateDistance.isValidDate(32, 12, 1700));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(!DateDistance.isValidDate(30, 2, 1996));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(DateDistance.isValidDate(29, 2, 1996));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue(!DateDistance.isValidDate(29, 2, 1997));
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        System.out.println("isValidDate: " + (successes - initialSuccesses) + "/" + (attempts - initialAttempts) + " passed");
    }

    public static void test_daysBetween(){
        System.out.println("Testing daysBetween...");
        int initialSuccesses = successes;
        int initialAttempts = attempts;

        try {
            displaySuccessIfTrue( DateDistance.daysBetween(1, 3, 2000, 5, 3, 1999) == 362 );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.daysBetween(5, 3, 1999, 1, 3, 2000) == 362 );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.daysBetween(2, 3, 1999, 11, 5, 2001) == 801 );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.daysBetween(11, 5, 2001, 2, 3, 1999) == 801 );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.daysBetween(19, 5, 2458, 13, 10, 1982) == 173709 );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.daysBetween(13, 10, 1982, 19, 5, 2458) == 173709 );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.daysBetween(30, 4, 1998, 26, 8, 1887) == 40424 );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.daysBetween(26, 8, 1887, 30, 4, 1998) == 40424 );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.daysBetween(26, 4, 1985, 23, 4, 1986) == 362 );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.daysBetween(23, 4, 1986, 26, 4, 1985) == 362 );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        System.out.println("daysBetween: " + (successes - initialSuccesses) + "/" + (attempts - initialAttempts) + " passed");
    }

    public static void test_dayOfTheWeek() {
        System.out.println("Testing dayOfTheWeek...");
        int initialSuccesses = successes;
        int initialAttempts = attempts;

        try {
            displaySuccessIfTrue( DateDistance.dayOfTheWeek(23, 4, 1986).equals(WED) );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.dayOfTheWeek(15, 8, 2060).equals(SUN) );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.dayOfTheWeek(10, 2, 1827).equals(SAT) );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.dayOfTheWeek(19, 7, 1785).equals(TUES) );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.dayOfTheWeek(28, 6, 2170).equals(THURS) );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.dayOfTheWeek(3, 9, 2010).equals(FRI) );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.dayOfTheWeek(15, 12, 2000).equals(FRI) );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.dayOfTheWeek(6, 11, 1912).equals(WED) );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.dayOfTheWeek(31, 10, 1865).equals(TUES) );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.dayOfTheWeek(20, 1, 2241).equals(WED) );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.dayOfTheWeek(9, 3, 2009).equals(MON) );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.dayOfTheWeek(1, 5, 1758).equals(MON) );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        System.out.println("dayOfTheWeek: " + (successes - initialSuccesses) + "/" + (attempts - initialAttempts) + " passed");
    }

    public static void test_longformDate() {
        System.out.println("Testing longformDate...");
        int initialSuccesses = successes;
        int initialAttempts = attempts;

        try {
            displaySuccessIfTrue( DateDistance.longformDate(23, 4, 1986).equals("Wednesday, 23 April 1986") );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.longformDate(15, 8, 2060).equals("Sunday, 15 August 2060") );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.longformDate(10, 2, 1827).equals("Saturday, 10 February 1827") );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.longformDate(19, 7, 1785).equals("Tuesday, 19 July 1785") );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.longformDate(28, 6, 2170).equals("Thursday, 28 June 2170") );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.longformDate(3, 9, 2010).equals("Friday, 3 September 2010") );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.longformDate(15, 12, 2000).equals("Friday, 15 December 2000") );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.longformDate(6, 11, 1912).equals("Wednesday, 6 November 1912") );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.longformDate(31, 10, 1865).equals("Tuesday, 31 October 1865") );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.longformDate(20, 1, 2241).equals("Wednesday, 20 January 2241") );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.longformDate(9, 3, 2009).equals("Monday, 9 March 2009") );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        try {
            displaySuccessIfTrue( DateDistance.longformDate(1, 5, 1758).equals("Monday, 1 May 1758") );
        } catch(Exception e) {
            displaySuccessIfTrue(false);
        }

        System.out.println("longformDate: " + (successes - initialSuccesses) + "/" + (attempts - initialAttempts) + " passed");
    }

}
