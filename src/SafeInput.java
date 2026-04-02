import java.util.Scanner;

public class SafeInput {
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
    String retString = ""; // Set this to zero length. Loop runs until it isn't
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a valid int
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            if(pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else {
                trash = pipe.nextLine();
                System.out.println("Please enter a valid integer, not: " + trash);
            }
        } while (!done);

        return retInt;
    }

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a valid int
     */
    public static double getDouble(Scanner pipe, String prompt)  {
        double retDouble = 0.0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            if(pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else {
                trash = pipe.nextLine();
                System.out.println("Please enter a valid integer, not: " + trash);
            }
        } while (!done);

        return retDouble;
    }
}


