//-------------------------------------------------------------------
// Lesson Name:   012 - While-loops challenges
// Author:        Brandon Monier
// Created:       2019-09-28
// Last Modified: 2019-09-28
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//   This project will provide source code to various challenges
//   pertaining to what we learned with the concepts of "while"
//   loops.
//-------------------------------------------------------------------

package com.btmonier;

public class Main {

    public static void main(String[] args) {

        // === CHALLENGE 01 =========================================
        // 1. write a method with the name sumDigits that has
        //    one int parameter called number.
        // 2. If parameter is >= 10 then the method should process
        //    the number and return sum of all digits, otherwise
        //    return -1 to indicate an invalid value.
        // 3. The numbers from 0-9 have 1 digit so we don't want to
        //    process them, also we don't want to process negative
        //    numbers, so also return -1 for negative numbers.
        // 4. For example calling the method sumDigits(125) should
        //    return 8 since 1 + 2 + 5 = 8.
        // 5. Calling the method sumDigits(1) should return -1 as per
        //    requirements described above.
        // 6. Add some code to the main method to test out the
        //    sumDigits method to determine that it is working
        //    correctly for valid and invalid values passed as
        //    arguments
        //
        // HINT (1) use n % 10 to extract the least-sig digit
        // HINT (2) use n = n / 10 to discard the least-sig digit
        // HINT (3) the method needs to be static like other methods
        // ==========================================================

        System.out.println("=== CHALLENGE 01 ===");
        System.out.println("Positive test....... " + sumDigits(45234));
        System.out.println("Negative test (1)... " + sumDigits(-45));
        System.out.println("Negative test (2)... " + sumDigits(1));


        // === CHALLENGE 02 =========================================
        // 1. Write a method called isPalindrome with on int
        //    parameter called number.
        // 2. The method needs to return a boolean.
        // 3. It should return true if the number is a palindrome
        //    number otherwise it should return false.
        // ==========================================================

        System.out.println("\n\n=== CHALLENGE 02 ===");
        System.out.println("Number is positive... " + isPalindrome(31113));
    }

    // Challenge 1
    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            // extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            // drop least significant digit (similar to n = n / 10)
            number /= 10;

        }

        return sum;
    }

    // Challenge 2
    public static int isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse += lastDigit;

            number *= 10;
        }

        int forward = 0;
        while (number > 0) {
            int digit = number % 10;
            forward += digit;

            number /= 10;
        }

//        boolean pal = reverse == forward;

        return number;


    }
}