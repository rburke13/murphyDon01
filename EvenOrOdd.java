public class EvenOrOdd {
    public static boolean isEven ( long number ) {
        return number % 2 == 0;
    }

    public static boolean isOdd ( long number ) {
        return !( isEven( number ) );
    }

    public static void main ( String[] args ) {
        try {
            if ( args.length == 0 ) {
                System.out.println("No arguments provided!");
            } else {
                long numberFromArgs = Long.parseLong( args[0] );
                if ( isEven( numberFromArgs ) ) {
                    System.out.println( numberFromArgs + " is even.");
                } else {
                    System.out.println( numberFromArgs + " is odd.");
                }
            }
        } catch ( NumberFormatException nfe ) {
            System.out.println("Please only insert integers!");
        } catch ( Exception e ) {
            System.out.println("Exception occurred!");
            e.printStackTrace();
        }
    }
}
