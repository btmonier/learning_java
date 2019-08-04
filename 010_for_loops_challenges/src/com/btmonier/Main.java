//-------------------------------------------------------------------
// Lesson Name:   010 - For loops challenges
// Author:        Brandon Monier
// Created:       2019-08-03
// Last Modified: 2019-08-03
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//   Various types of for-loop challenges.
//-------------------------------------------------------------------

package com.btmonier;

public class Main {

    public static void main(String[] args) {
        // === CHALLENGE 1 ==========================================
        // (1) Create a for statement using a range of numbers from 1 to 10000 inclusive
        // (2) Sum all the numbers that can be divided with both 3 and also with 5.
        // (3) For those numbers that met the above conditions, print out the number.
        // (4) Break out of the loop once you find 5 numbers that met the above conditions.
        // (5) After breaking out of the loop print the sum of the numbers that met the above
        //     conditions.
        // NOTE: Type all code in the main method

        System.out.println("=== CHALLENGE 1 ===");
        int count = 0;
        int sumNum = 0;
        for (int i = 1; i <= 10000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Divisible by 3 and 5: " + i);
                sumNum += i;
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("The sum of these numbers is: " + sumNum);


        // === CHALLENGE 2 ==========================================
        // (1) Write a method called isOdd with an int parameter and call it number.
        //     The method needs to return a boolean.
        // (2) Check that number is > 0, if it is not, return false.
        // (3) If number is odd return true, otherwise return false.
        // (4) Write a second method called sumOdd that has 2 int parameters start and end,
        //     which represent a range of numbers.
        // (5) The method should use a for loop to sum all odd numbers in that range including
        //     the end and return the sum.
        // (6) It should call the method isOdd to check if each number is odd.
        // (7) The parameter end needs to be greater than or equal to start and both start and
        //     end parameters have to be greater than 0.
        // (8) If those conditions are not satisfied return -1 from the method to indicate
        //     invalid input.
        // TIP: use the remainder operator to check if the number is odd

        System.out.println("\n=== CHALLENGE 2 ===");
        sumOdd(1, 100);
        sumOdd(-1, 100);
        sumOdd(13, 13);
        sumOdd(100, -100);
        sumOdd(100, 100);


        // === CHALLENGE 3 ==========================================
        // (1) Write a method called printNumberInWord. The method has one parameter
        //     which is the whole number.
        // (2) The method needs to print "ZERO", "ONE", "TWO", ... "FIVE", "OTHER" if
        //     the int parameter number is 0, 1, 2, ... 5 or other number including
        //     negative numbers.
        // TIP: you can use if-else statement or switch statement whatever is easier for you

        System.out.println("\n=== CHALLENGE 3 ===");
        printNumberInWord(-3);


    }

    // Challenge 2.1
    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }

        if (number % 2 == 0) {
            return false;
        }

        return true;
    }

    // Challenge 2.2
    public static int sumOdd(int start, int end) {
        // validation
        if (end < start || start <= 0 || end <= 0) {
            System.out.println("Invalid parameter.");
            return -1;
        }

        // sum odds within range
        int sumNum = 0;
        for (int i = start; i <= end; i++) {

            if (isOdd(i)) {
                sumNum += i;
            }
        }

        // return output
        System.out.println("The sum of odd numbers between " + start + " and " + end + " is: " + sumNum);
        return sumNum;
    }

    // Challenge 3
    public static String printNumberInWord(int number) {
        String output;

        if (number < 0) {
            number = number * -1;
        }
        switch (number) {
            case 0:
                output = "ZERO";
                break;
            case 1:
                output = "ONE";
                break;
            case 2:
                output = "TWO";
                break;
            case 3:
                output = "THREE";
                break;
            case 4:
                output = "FOUR";
                break;
            case 5:
                output = "FIVE";
                break;
            default:
                output = "OTHER";
                break;

        }
        System.out.println("The number " + number + " converted is: " + output);
        return output;
    }
}
