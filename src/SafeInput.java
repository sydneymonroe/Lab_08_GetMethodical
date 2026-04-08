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

    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param low low end of int range
     * @param high high end of int range
     * @return a valid int within range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retRangedInt = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + "[" + low + "-" + high + "]: ");
            if (pipe.hasNextInt()) {
                retRangedInt = pipe.nextInt();
                if(retRangedInt >= low && retRangedInt <= high) {
                    done = true;
                }
                else {
                    pipe.nextLine();
                    System.out.println("Invalid input. Please enter a number between "+ "[" + low + "-" + high + "]");
                }
            }
            else {
                trash = pipe.nextLine();
                System.out.println("Please enter a valid number, not: " + trash);
            }
        } while (!done);

        return retRangedInt;
    }
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param low low end of int range
     * @param high high end of int range
     * @return a valid int within range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)  {
        double retRangedDouble = 0.0;
        String trash = "";
        boolean done = false;
        do {
            System.out.print("\n" + prompt + "[" + low + "-" + high + "]: ");
            if (pipe.hasNextDouble()) {
                retRangedDouble = pipe.nextDouble();
                pipe.nextLine();
                if(retRangedDouble >= low && retRangedDouble <= high) {
                    done = true;
                }
                else {
                    pipe.nextLine();
                    System.out.println("Invalid input. Please enter a number between "+ "[" + low + "-" + high + "]");
                }
            }
            else {
                trash = pipe.nextLine();
                System.out.println("Please enter a valid number, not: " + trash);
            }
        } while (!done);

        return retRangedDouble;
    }
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the use
     * @return yes or no answer
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String anwser = "";
        boolean done = false;
        boolean val = true;

        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            anwser = pipe.nextLine();
            if(anwser.equalsIgnoreCase("Y")) {
                done = true;
                val = true;
            }
            else if(anwser.equalsIgnoreCase("N")) {
                done = true;
                val = false;
            }
            else {
                System.out.println("You must enter [Y/N]");
            }
        } while (!done);

        return val;
    }
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the use
     * @param regEx
     * @return valid response that matches RegEx
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        boolean done = false;
        String response = "";

        do {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();
            if (response.matches(regEx)) {
                done = true;
            }
             else {
                System.out.println("Invalid response.");
            }
        } while (!done);

        return response;
    }
    /**
     *
     * @param msg message inside header
     */
    public static void prettyHeader(String msg) {
        int msgLength = msg.length();
        int total = 60 - 6 - msgLength;
        int before = total / 2;
        int after = total - before;

        for(int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("***");

        for(int i = 0; i < before; i++) {
            System.out.print(" ");
        }

        System.out.print(msg);

        for(int i = 0; i < after; i++) {
            System.out.print(" ");
        }

        System.out.println("***");

        for(int i = 0; i < 60; i++) {
            System.out.print("*");
        }
        System.out.println();
    }


}


