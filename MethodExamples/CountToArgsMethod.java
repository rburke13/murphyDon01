// CountToArgs.java

public class CountToArgsMethod {
    public static void main ( String[] args ) {
        try {
            if ( args.length == 0 ) {
                System.out.println("No arguments provided!");
            } else if ( args.length == 1 ) {
                countTo( Integer.parseInt( args[0] ) );
            } else {
                countBetween( Integer.parseInt( args[0] ), Integer.parseInt( args[1] ) );
            }
        } catch ( NumberFormatException nfe ) {
            System.out.println("Please only insert integers!");
        } catch ( Exception e ) {
            System.out.println("Exception occurred!");
            e.printStackTrace();
        }
    }

    public static void countTo ( int end ) {
        for ( int i = 0; i <= end; i++ ) {
            System.out.println(i);
        }
    }

    public static void countBetween ( int start, int end ) {
        for ( int i = start; i <= end; i++ ) {
            System.out.println(i);
        }
    }
}
