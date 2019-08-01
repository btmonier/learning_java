package com.btmonier;

public class Main {

    // Create a constant (bonus) -
    // Constants are variables that can NOT be changed
    // These are similar to global variables in R
    public static final String INVALID_INPUT_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        // Challenge 1
        //
        // (1) Make a method called getDurationString with two parameters
        //     * first parameter = minutes
        //     * second parameter = seconds
        //     * should validate first parameter is >= 0
        //     * should validate second parameter is >= 0 and <= 59
        // (2) The method should return "Invalid value" in the method if either of the above
        //     are not true
        // (3) If the parameters are valid, then calculate how many hours, minutes, and seconds equal the
        //     minutes and seconds passed to this method and return that value as a string in format
        //     "XXh YYm ZZs" where XX is hours, YY is minutes, and ZZ is seconds.
        // (4) Create a 2nd method of the SAME NAME (hint hint) but with only parameter of seconds.
        // (5) Validate the 2nd methods >= 0 and return "Invalid value" if not true.
        // (6) If 2nd method parameter is valid, calculate how many minutes are in the seconds and then call
        //     the other overloaded method passing the correct minutes and seconds calculated so that it can
        //     calculate correctly.
        //
        // TIPS (CHALLENGE 1)
        // * use int or long for your number data types
        // * 1 minute = 60 seconds; 1 hour = 60 minutes or 3600 seconds
        // * methods should be static as we have used previously in other exercises

        System.out.println("=== CHALLENGE 1 ===");
        System.out.println(getDurationString(75,43)); // valid test
        System.out.println(getDurationString(60,62)); // invalid test

        System.out.println("\n=== CHALLENGE 2 ===");
        System.out.println(getDurationString(78)); // valid test
        System.out.println(getDurationString(-20)); // invalid test
    }

    // Challenge 1
    public static String getDurationString(int minutes, int seconds) {

        // validation check
        if (minutes < 0 || seconds < 0 || seconds > 60) {
            return INVALID_INPUT_MESSAGE;
        }

        int totalSeconds = (minutes * 60) + seconds;

        int totalHours = totalSeconds / 3600;
        int totalMinutes = totalSeconds % 3600 / 60;
        int remSeconds = totalSeconds % 3600 % 60;

        // Bonus section (convert to string)
        String outH = Integer.toString(totalHours);
        String outM = Integer.toString(totalMinutes);
        String outS = Integer.toString(remSeconds);

        // Bonus section (check length of string variables)
        if (outH.length() == 1) {
            outH = "0" + outH;
        }
        if (outM.length() == 1) {
            outM = "0" + outM;
        }
        if (outS.length() == 1) {
            outS = "0" + outS;
        }

        String out = outH + "h " + outM + "m " + outS + "s ";
        return out;
    }

    // Challenge 2
    public static String getDurationString(int seconds) {

        // validation check
        if (seconds < 0) {
            return INVALID_INPUT_MESSAGE;
        }

        int totalMinutes = seconds / 60;
        int remSeconds = seconds % 60;

        return getDurationString(totalMinutes,remSeconds);
    }
}
