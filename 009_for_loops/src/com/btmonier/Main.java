//-------------------------------------------------------------------
// Lesson Name:   009 - For loops
// Author:        Brandon Monier
// Created:       2019-08-02
// Last Modified: 2019-08-02
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//   In this lesson, we will learn about iterative statements
//   mainly, the for loop
//-------------------------------------------------------------------

package com.btmonier;

public class Main {

    public static void main(String[] args) {
        // === BACKGROUND ===========================================
        // We have made a method that will generate interest based off
        // of specified amount and interest rate. This is okay if we
        // have to only do this once in a while, but what if we have
        // to generate a whole bunch of interest values? One way to
        // do this would be to manually enter this for each value.
        // However, this is rather inefficient. What if we have 1000s of
        // values?
//        System.out.println("10,1000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,1000 at 3% interest = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10,1000 at 4% interest = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10,1000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        // We can use a for-loop to automate this for us:
        // for-loops have three main components:
        //   * the initializer (usually a specified int value [i])
        //   * the terminator (a logic statement that will eventually become false)
        //   * the incrementer (i++)
        // ...remember that arrays start at 0 since why most for-loops start at 0
        for (int i = 0; i <= 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        // === CHALLENGE 1 ==========================================

        // (1) Using the for statement, call the calculateInterest method with
        //     the amount of 10000 with an interestRate of 2, 3, 4, 5, 6, 7, and 8.
        // (2) Print the results to the console window.

        // Challenge (1-2)
        System.out.println("\n=== CHALLENGE 1 ===");
        for (int i = 2; i < 9; i++) {
            // Take note of the String.format() component. This will force the output of our method
            // to produce 2 decimal points (%.2f) instead of potentially long strings of precision points.
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }


        // === CHALLENGE 2 ==========================================

        // (1) How would you modify the for loop above to do the same thing as
        //     shown but to start from 8% and work back to 2%?

        // Challenge
        System.out.println("\n=== CHALLENGE 2 ===");
        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }


        // === CHALLENGE 3 ==========================================

        //
    }


    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate / 100));
    }

    // Challenge number 3
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
