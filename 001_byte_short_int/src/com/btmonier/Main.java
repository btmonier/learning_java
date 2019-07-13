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

        // int has a width of 32 (usually choose this by default or in doubt)
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue / 2);

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (myByteValue / 2);

        // short has a width of 16
        short myShortValue = 32767;

        // long has a width of 64 (note the "L" at the end)
        // long has a huge min number store (-9_223_372_036_854_775_808L)
        // long has a huge max number store (9_223_372_036_854_775_807L)
        long myLongValue = 100L;
    }
}
