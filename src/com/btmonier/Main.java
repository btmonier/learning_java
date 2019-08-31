//-------------------------------------------------------------------
// Lesson Name:   011 - While-loops...
// Author:        Brandon Monier
// Created:       2019-08-31
// Last Modified: 2019-08-31
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//   This lesson is designed to teach users about the concepts of
//   while-loops and their advantages over for-loops for certain
//   types of conditional applications.
//-------------------------------------------------------------------

package com.btmonier;

public class Main {

    public static void main(String[] args) {

        // === BACKGROUND ===========================================
        System.out.println("=== BACKGROUND ===\n");
        // while loops are similar to for loops - here is the common
        // structure that we use:
        System.out.println("--- Ex. 1: Using a while-loop ---");
        int count = 0;
        while (count != 5) {
            System.out.println("Count value is... " + count);
            count++;
        }
        // if we wanted to make an equivalent for-loop statement, we
        // could do something like this:
        System.out.println("--- Ex. 2: Using a for-loop ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("Count value is... " + i);
        }
        // in the while loop, we need to create an external variable
        // and then use logic on that variable (e.g. `count`)
        // we can write while loops in a slightly different fashion:
        System.out.println("--- Ex. 3: While-loop different style ---");
        count = 0;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("Count value is... " + count);
            count++;
        }
        // we can also use `do` while statements:
        System.out.println("--- Ex. 4: do-while statement ---");
        count = 0;
        do {
            System.out.println("Count value is... " + count);
            count++;
        } while (count != 5);
        // we can do better though...


        // === CHALLENGE  1 =========================================

        // (1) Create a method called isEvenNumber that takes a
        //     parameter of type `int`.
        // (2) Its purpose is to determine if the argument passed to
        //     the method is an even number or not.
        // (3) Return `true` if an even number, otherwise, return
        //     false.
        // (4) Use a while-loop to determine if a range of numbers
        //     true or false in terms of..."evenness"...

        System.out.println("\n=== CHALLENGE 1 ===\n");
        int testNumberBegin = 1;
        int testNumberEnd = 10;
        while (testNumberBegin <= testNumberEnd) {
            if (isEvenNumber(testNumberBegin)) {
                System.out.println("Even number detected: " + testNumberBegin);
            }
            testNumberBegin++;
        }


        // CHALLENGE 2 ==============================================

        // (1) Modify the while code from challenge 1.
        // (2) Make it also record the total number of even numbers
        //     it has found and break once 10 are found.
        // (3) At the end, display the total number of even numbers
        //     found.

        System.out.println("\n=== CHALLENGE 2 ===\n");
        testNumberBegin = 1245;
        testNumberEnd = 2359;
        int evenTotal = 0;
        int evenBreak = 10; // be robust and adaptable
        while (testNumberBegin <= testNumberEnd) {
            if (isEvenNumber(testNumberBegin)) {
                System.out.println("Even number detected: " + testNumberBegin);
                evenTotal++;
            }

            if (evenTotal == evenBreak) {
                System.out.println(evenTotal + " even numbers detected - quitting analysis...");
                break;
            }
            testNumberBegin++;
        }


    }

    // Challenge 1 and 2
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
