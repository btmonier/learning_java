/*
 * === CHALLENGE 1 ==================================================
 * 1. Read 10 numbers from the console entered by the user and print
 *    the sum of those numbers.
 * 2. Create a Scanner like we did in the previous video.
 * 3. Use the `hasNextInt()` method from the scanner to check if the
 *    user has entered an `int` value.
 * 4. If `hasNextInt()` returns `false`, print the message "Invalid
 *    Number". Continue reading until you have read 10 numbers.
 * 5. Use the `nextInt()` method to get the number and add it to the
 *    sum.
 * 6. Before the user enters each number, print the message "Enter
 *    number #x:" where x represents the count (i.e. 1, 2, 3, 4, etc.)
 * 7. For example, the first message printed to the user would be
 *    "Enter number #1:", the next "Enter number #2:", and so on.
 */

package com.btmonier;

import java.util.Scanner;

public class UserIOChallenge1 {
    public static void main(String[] args) {
        // Initiate scanner
        Scanner scanner = new Scanner(System.in);

        // Add entries with logic
        int counter = 1;
        int sumNumbers = 0;
        while (counter <= 10) {
            System.out.println("Enter number #" + counter + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                counter++;
                sumNumbers += number;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("Your grand total is: " + sumNumbers);
        scanner.close();
    }
}
