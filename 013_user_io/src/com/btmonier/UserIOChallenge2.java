/*
 * === CHALLENGE 2 ==================================================
 * 1. Read the numbers from the console entered by the user and print
 *    the minimum and maximum number the user has entered.
 * 2. Before the user enters the number, print the message "Enter number:"
 * 3. If the user enters an invalid number, break out of the loop and
 *    print the minimum and maximum number.
 */

package com.btmonier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UserIOChallenge2 {
    public static void main(String[] args) {
        // Initiate scanner
        Scanner scanner = new Scanner(System.in);

        // Initiate variables
        ArrayList<Integer> a = new ArrayList<>();

        // Get user input
        while (true) {
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                a.add(number);
            } else {
                System.out.println("Invalid integer; breaking out of loop...");
                break;
            }
            scanner.nextLine();
        }

        // Get min and max values
        int minVal = Collections.min(a);
        int maxVal = Collections.max(a);

        // Console output
        System.out.println("=== SUMMARY STATS ===");
        System.out.println("Min val... " + minVal);
        System.out.println("Max val... " + maxVal);
        System.out.println("Array..... " + a);
        scanner.close();
    }
}
