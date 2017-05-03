import java.util.Scanner;

import javax.swing.JFrame;

/**
 * LostWoodsSolver is a demonstration application that builds a mouse maze, displays
 * it, then runs an algorithm for leading the maze's mouse to the cheese. Mouse
 * and cheese coordinates are provided by the user at the command line; the maze
 * to use is taken from standard input, and is thus best built through
 * redirection from a file.
 */
public class LostWoodsSolver {
    /**
     * Launches LostWoodsSolver. The maze to use depend on what is provided via
     * standard input; the next two arguments are expected to be the mouse
     * coordinates while the following two arguments should be the cheese
     * coordinates. Any other set of arguments results in a usage help message.
     */
    public static void main(String[] args) {
        // Process the arguments.
        if (args.length < 4 || args.length > 6) {
            displayUsageMessage();
            return;
        }
        int speed = 500;
        boolean useSW = false;
        boolean useRW = false;
        if (args.length == 4) {
            speed = 500;
        }
        if (args.length == 5) {
            try {
                if (Integer.parseInt(args[4]) <= 0) {
                    displayUsageMessage();
                    return;
                } else {
                    speed = Integer.parseInt(args[4]);
                }
            } catch(NumberFormatException nfe) {
                if (args[4].equals("SW")) {
                    useSW = true;
                } else if (args[4].equals("RW")) {
                    useRW = true;
                } else {
                    displayUsageMessage();
                    return;
                }
            }
        }
        if (args.length == 6) {
            if (Integer.parseInt(args[4]) <= 0) {
                displayUsageMessage();
                return;
            } else {
                speed = Integer.parseInt(args[4]);
            }
            if (args[5].equals("SW")) {
                useSW = true;
            } else if (args[5].equals("RW")) {
                useRW = true;
            } else {
                displayUsageMessage();
                return;
            }
        }
        try {
            // Parse the arguments.
            int mouseX = Integer.parseInt(args[0]);
            int mouseY = Integer.parseInt(args[1]);
            int cheeseX = Integer.parseInt(args[2]);
            int cheeseY = Integer.parseInt(args[3]);

            // Grab the maze description.
            Scanner scanner = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNext()) {
                sb.append(scanner.next());
                sb.append(" ");
            }

            // Create the maze.
            //input booleans for SW NW
            MouseAndCheeseMaze mouseAndCheeseMaze = new MouseAndCheeseMaze(
                new Maze(sb.toString()),
                mouseX, mouseY,
                cheeseX, cheeseY, useSW, useRW);

            // Create the window for the maze solver, then open it.
            JFrame f = new JFrame("LostWoodsSolver");
            f.setContentPane(new MouseAndCheeseMazeView(mouseAndCheeseMaze, speed));
            f.pack();
            f.setLocationByPlatform(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        } catch(NumberFormatException nfe) {
            System.err.println("All coordinates must be integers.");
            System.err.println();
            displayUsageMessage();
            return;
        } catch(IllegalArgumentException iae) {
            System.err.println(iae.getMessage());
            System.err.println();
            displayUsageMessage();
            return;
        }
    }

    /**
     * Displays a usage message.
     */
    private static void displayUsageMessage() {
        System.out.println("Usage: java LostWoodsSolver <Link x> <Link y> <sword x> <sword y> <(optional) speed>");
        System.out.println();
        System.out.println("The program then reads the maze to use through standard input.  For maximum");
        System.out.println("convenience, provide this maze using redirection from a text file:");
        System.out.println();
        System.out.println("    java LostWoodsSolver 0 0 5 5 < six-by-six.maze.txt");
        System.out.println();
        System.out.println("All x-coordinates must range from 0 to the width of the given maze - 1 while");
        System.out.println("all y-coordinates must range from 0 to the height of the given maze - 1.");
        System.out.println("Coordinates must also refer to open cells within the maze.");
        System.out.println("If inputting an argument for speed, it must be greater than 0.");
        System.out.println("to indicate using smartWalker, input 'SW'.");
    }
}
