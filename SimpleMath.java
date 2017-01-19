public class SimpleMath {
    public static long square ( long base ) {
        return base * base;
    }

    public static long exponent ( long base, long exponent ) {
        long solution = 1;
        for ( long i = 0; i < exponent; i++) {
            solution = solution * base;
        }
        return solution;
    }

    public static long factorial ( long n ) {
        if ( n == 0 ) {
            return 1;
        } else {
            return n * factorial ( n - 1 );
        }
    }

    public static void main ( String[] args ) {
        try {
            if ( args.length < 2 || Long.parseLong(args[0]) < 0 || Long.parseLong(args[1]) < 0 ) {
                System.out.println("Provide at least 2 positive integer arguments!");
            } else {
                System.out.println( args[0] + "^2: " + square( Long.parseLong(args[0]) ) );
                System.out.println( args[0] + "^" + args[1] + ": " + exponent( Long.parseLong(args[0]), Long.parseLong(args[1]) ) );
                System.out.println( args[0] + "!: " + factorial( Long.parseLong(args[0]) ) );
            }
        } catch (Exception e) {
            System.out.println("Exception occurred!");
        }
    }
}
