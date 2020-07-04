/*
 * === CHALLENGE 3 - INPUT CALCULATOR ===============================
 * 1. Write a method called `inputThenPrintSumAndAverage` that does
 *    not have any parameters.
 * 2. The method should not return anything (void) and it needs to
 *    keep reading int numbers from the keyboard.
 * 3. When the user enters something that is not an `int` then it
 *    needs to print a message in the format "SUM = XX AVG = YY".
 * 4. XX represents the sum of all entered numbers of type `int`.
 * 5. YY represents the calculated average of all numbers of type
 *    `long`.
 */

package com.btmonier;

import java.util.Scanner;

public class UserIOChallenge3 {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        // Initiate scanner
        Scanner scanner = new Scanner(System.in);

        // Initiate variables
        int n = 0;
        int sumVal = 0;

        while (scanner.hasNextInt()) {
            n++;
            sumVal += scanner.nextInt();
            scanner.nextLine();
        }

/*        // Get mean value
        double avgVal = 0;
        if (n != 0) {
            avgVal = sumVal / (double) n;
        }*/

        // Console output
        System.out.println("SUM = " + sumVal + " AVG = " + Math.round((double) sumVal / n));
        scanner.close();
    }
}
