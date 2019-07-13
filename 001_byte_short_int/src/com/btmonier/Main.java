//-------------------------------------------------------------------
// Lesson Name:   001 - Shorts, ints, and bytes...
// Author:        Brandon Monier
// Created:       2019-07-13
// Last Modified: 2019-07-13
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//    Learn about primitive data types:
//      * byte
//      * short
//      * int
//      * long
//-------------------------------------------------------------------

package com.btmonier;

public class Main {

    public static void main(String[] args) {

        // === BACKGROUND ===========================================

        // int has a width of 32 (usually choose this by default or in doubt)
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue / 2);

        // byte has a width of 8
        byte myByteValue = -128;

        // we need to cast a byte value to retain a byte
        byte myNewByteValue = (byte) (myByteValue / 2);

        // short has a width of 16
        short myShortValue = 32767;

        // long has a width of 64 (note the "L" at the end)
        // long has a huge min number store (-9_223_372_036_854_775_808L)
        // long has a huge max number store (9_223_372_036_854_775_807L)
        long myLongValue = 100L;

        System.out.println("myTotal.......... " + myTotal);
        System.out.println("myNewByteValue... " + myNewByteValue);


        // === CHALLENGE ============================================

        //  1. Create a byte variable and set it to any valid byte number.
        //  2. Create a short variable and set it to any valid short number.
        //  3. Create a int variable and set it tot any valid int number.
        //  4. Create a variable of type long, and make it equal to
        //     50000 + 10 times the sum of the byte, plus the short plus the int.

        // Challenge (part 1)
        byte challengeByte = 42;

        // Challenge (part 2)
        short challengeShort = 1000;

        // Challenge (part 3)
        int challengeInt = 2_000_000;

        // Challenge (part 4)
        // (tip) we do NOT need to cast as a long (automatically determines it is a long)
        // (tip) this also applies to int data types
        long challengeLong = (50000 + 10) * (challengeByte + challengeInt + challengeShort);

        System.out.println("\n");
        System.out.println("Challenge... " + challengeLong);
    }
}
