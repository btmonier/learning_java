//-------------------------------------------------------------------
// Lesson Name:   003 - Char and boolean... (and strings!)
// Author:        Brandon Monier
// Created:       2019-07-13
// Last Modified: 2019-07-13
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//    Learn about primitive data types:
//      * char
//      * boolean
//
//    We will also learn about strings. These are not technically a
//    primitive data type, but of course, are commonly used.
//-------------------------------------------------------------------

package com.btmonier;

public class Main {

    public static void main(String[] args) {

        // === BACKGROUND ===========================================

        // The 8 primitive data types:
        //   byte
        //   short
        //   int
        //   long
        //   float
        //   double
        //   char
        //   boolean

        // char can only store one character (number, letter, unicode, etc.)
        // width of 16 (2 bytes)
        // must use single quotes (double quotes for strings...)
        char myChar = 'A';

        // apparently we can not (illegal unicode escape?)
        // illegal unicode escape will even show if '\ + u' is used in comments without proper location...
        // i.e. use full unicode!
        char myUniChar = '\u00A9';

        System.out.println("myUniChar... " + myUniChar);

        // boolean (true or false) - used for logic
        // must be lower case
        boolean isMale = true;
        boolean myBoolean = false;


        // === CHALLENGE ============================================

        // 1. Find the code for the registered symbol on the same line as the copyright symbol
        // 2. Create a variable of type char and assign it the unicode value for that symbol
        // 3. Display on the screen

        System.out.println("\n=== CHALLENGE ========================");

        // Challenge (part 1)
        char myRegisterSymbol = '\u00AE';
        System.out.println("The 'registered' symbol... " + myRegisterSymbol);


        // === Strings ==============================================

        // Strings are essentially the 9th data type due to their common use
        System.out.println("\n=== Strings ==========================");
        String myString = "This is a string";
        System.out.println("myString is..... " + myString);

        // what if we want to modify or append a string?
        myString = myString + ", and this is more.";
        System.out.println("myString is..... " + myString);

        // and append special characters?
        myString = myString + " \u00A9 2015";
        System.out.println("myString is..... " + myString);

        // what about numbers as strings?
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is... " + numberString);

        // more about conversion - what if we append other data types?
        // numbers will coerce the data as a string if added to pre-existing string
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("The result is... " + lastString);

        // what about doubles?
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("The result is... " + lastString);

    }
}