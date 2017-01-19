// CountToArgsCatch.java

public class CountToArgsSpecificCatch {
    public static void main(String[] args) {
        try {
            if (args.length > 0) {
                //Takes the first argument and tries to convert it to an integer
                int maxCount = Integer.parseInt(args[0]);
                for (int i = 0; i <= maxCount; i++) {
                    System.out.println(i);
                }
            } else {
                System.out.println("No argument provided");
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Please only insert integers!");
            nfe.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception occurred!");
            e.printStackTrace();
        }
    }
}
