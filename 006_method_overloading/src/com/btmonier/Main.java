//-------------------------------------------------------------------
// Lesson Name:   006 - Method Overloading
// Author:        Brandon Monier
// Created:       2019-07-30
// Last Modified: 2019-07-30
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//    Learn about method overloading which is using the same method
//    name but with different parameters.
//-------------------------------------------------------------------

package com.btmonier;

public class Main {

    public static void main(String[] args) {

        // === OVERVIEW =============================================
        // We can use the same method for different results
        // In this example, we can pass a variable to `newScore` AND
        //    perform a system out print function.
        int newScore = calculateScore("Brandon", 500);

        // Note that when we pass this variable it is returning an int data type which is multiplied by 1000
        System.out.println("New score is " + newScore);

        // Call second method
        calculateScore(75);

        // Call third method
        calculateScore();


        // === CHALLENGE ============================================

        // Create a method called calcFeetAndInchesToCentimeters
        // It needs to have two parameters.
        // feet is the first parameter, inches is the 2nd parameter
        //
        // You should validate that the first parameter feet is >= 0
        // You should validate that the 2nd parameter inches is >= 0 and <= 12
        // return -1 from the method if either of the above is not true //
        // If the parameters are valid, then calculate how many centimeters
        // comprise the feet and inches passed to this method and return
        // that value.
        //
        // Create a 2nd method of the same name but with only one parameter
        // inches is the parameter
        // validate that its >= 0
        // return -1 if it is not true
        // But if its valid, then calculate how many feet are in the inches
        // and then here is the tricky part
        // call the other overloaded method passing the correct feet and inches
        // calculated so that it can calculate correctly.
        // hints: Use double for your number data-types is probably a good idea
        // 1 inch = 2.54 cm and on foot = 12 inches
        // use the link I give you to confirm your code is calculating correctly.
        // Calling another overloaded method just requires you to use the
        // right number of parameters.


        // Challenge (part 1)
        System.out.println("\n=== CHALLENGE 1 ===");
        calcFeetAndInchesToCentimeters(2,11); // correct return
        calcFeetAndInchesToCentimeters(2,14); // incorrect return

        // Challenge (part 2)
        System.out.println("\n=== CHALLENGE 2 ===");
        calcFeetAndInchesToCentimeters(56);
        calcFeetAndInchesToCentimeters(-34);

    }

    // Example method
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    // Let's overload the example method by assigning new parameters...
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    // New overload method with NO parameters...
    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }

    // What happens when we change the return type? Can't do this - not specific enough, you do need to change the
    //    parameters...
    //public static void calculateScore() {
    //    System.out.println("No player name, no player score.");
    //}

    // Challenge (part 1)
    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid parameters.");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;

        System.out.println(feet + " feet and " + inches + " inches = " + centimeters + " cm.");
        return centimeters;
    }

    // Challenge (part 2)
    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            System.out.println("Invalid parameters.");
            return -1;
        }

        int totFeet = (int) inches / 12;
        double remInches = inches % 12;

        return calcFeetAndInchesToCentimeters(totFeet, (int) remInches);

    }
}
