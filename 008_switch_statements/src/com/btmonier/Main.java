//-------------------------------------------------------------------
// Lesson Name:   008 - The switch statement
// Author:        Brandon Monier
// Created:       2019-08-02
// Last Modified: 2019-08-02
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//   Learn about how we can use the switch statement to improve our
//   lives with conditional chunks...
//-------------------------------------------------------------------


package com.btmonier;

public class Main {

    public static void main(String[] args) {
	    // === BACKGROUND ===========================================
        // We have now learned about conditional statements. They
        // Look something like this:
        int value = 1;
        if (value == 1) {
            System.out.println("This variable has a value of 1.");
        } else if (value == 2) {
            System.out.println("This variable has a value of 2.");
        } else if (value == 3) {
            System.out.println("This variable has a value of 3.");
        } else {
            System.out.println("I don't know what this variable is.");
        }

        // The above chunk can start to become inefficient when we
        // start putting more conditional checks within the if then
        // else statement...
        // Therefore, we can use a switch statement. We can re-code
        // the prior code chunk using a switch like this:
        int switchValue = 5;
        switch(switchValue) {
            case 1:
                System.out.println("This variable has a value of 1.");
                break;
            case 2:
                System.out.println("This variable has a value of 2.");
                break;
            case 3:
                System.out.println("This variable has a value of 3.");
                break;

            // multiple cases can be used on one line
            case 4: case 5: case 6:
                System.out.println("This variable has a value of 4, 5, or 6.");
                System.out.println("Actually was has a value of " + switchValue);
                break;
            default:
                System.out.println("I don't know what this variable is.");
        }
        // The switch statement has the following components:
        //   * variable
        //   * case (what is variable equal to?)
        //   * some function
        //   * a break statement - what case has been made, function will run, hit the break,
        //     and continue with code outside of brackets
        //   * a default statement (similar to the else component near the end)

        // === CHALLENGE ============================================
        // (1) Create a new switch statement using char instead of int
        // (2) Create a new char variable
        // (3) Create a switch statement testing for
        //     A, B, C, D, or E
        // (4) Display a message if any of these are found and then break
        // (5) Add a default which displays a message saying not found

        // Challenge 1-5
        System.out.println("\n=== CHALLENGE ===");
        char switchChar = 'a'; // note the single quotes for chars!
        switch(switchChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Your char was an A, B, C, D, or E");
                System.out.println("You actual char: " + switchChar);
                break;
            default:
                System.out.println("Char not found.");
        }

        // Switch statements with strings
        // what if we have something that lowercase compared to the cases?
        // you need to be precise! but... what if we want to get around this?
        // we can use a built-in method with strings called toLowerCase()
        // this built-in method is specific to a String class
        // (this is a good time to briefly mention classes)
        System.out.println("\n---\n");
        String switchString = "JaNuAry";
        switch(switchString.toLowerCase()) { // take note of new method
            case "january":
                System.out.println("JAN");
                break;
            case "june":
                System.out.println("JUN");
                break;
            default:
                System.out.println("Invalid input...");
        }
    }
}
