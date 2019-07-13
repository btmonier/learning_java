//-------------------------------------------------------------------
// Lesson Name:   002 - Floats and doubles...
// Author:        Brandon Monier
// Created:       2019-07-13
// Last Modified: 2019-07-13
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//    Learn about primitive data types:
//      * float
//      * double
//-------------------------------------------------------------------

package com.btmonier;

public class Main {

    public static void main(String[] args) {

        // === BACKGROUND ===========================================

        // How do we deal with decimal points?
        // We use floats and doubles
        // Int is a whole number
        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;

        // Float can be a decimal (note the f)
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;

        // So can doubles (note the d)
        // width of double = 64 (8 bytes)
        // (note) numbers with decimal points are automatically chosen as doubles
        // doubles are preferred (they are more precise)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue...... " + myIntValue);
        System.out.println("myFloatValue.... " + myFloatValue);
        System.out.println("myDoubleValue... " + myDoubleValue);


        // === CHALLENGE ============================================

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable
        // 3. Print out the result

        // NOTE: 1 pound is equal to 0.45359237 kilograms

        System.out.println("\n=== CHALLENGE ========================");

        // Challenge (part 1)
        double myPoundWeight = 8545;

        // Challenge (part 2)
        double kiloConvert = 0.45359237;
        double myKiloConvert = myPoundWeight * kiloConvert;

        System.out.println("My starting weight....... " + myPoundWeight + " lbs.");
        System.out.println("My weight in kilograms... " + myKiloConvert + " kgs.");
    }
}
