//-------------------------------------------------------------------
// Lesson Name:   005 - Methods and if then else
// Author:        Brandon Monier
// Created:       2019-07-27
// Last Modified: 2019-07-27
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//    Learn about logic with "if then else" statements. This will use
//    boolean data types to pass logic steps.
//
//    Learn about applying methods to your programming and how to
//    return various data types from methods.
//
//    Methods will make your code easier to maintain and prevent you
//    from duplicating your code.
//-------------------------------------------------------------------

package com.btmonier;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // use method from below with respective parameters from prior variables
        int highScore = calculateScoreReturn(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);

        // We want to calculate that again, this time with new variables on the fly
        highScore = calculateScoreReturn(true, 10000, 8, 200);
        System.out.println("Your final score was: " + highScore);


        // === CHALLENGE ============================================

        // 1. Create a method called displayHighScorePosition
        // 2. It should be a players name as a parameter, and a 2nd parameter as a position in
        //    the high score table
        // 3. You should display the players name along with a message like
        //    " managed to get into position " and the position they got and a further message
        //    " on the high score table ".

        // === CHALLENGE ============================================

        // 1. Create a second method called calculateHighScorePosition
        // 2. It should be sent one argument only, the player score
        // 3. It should return an int
        // 4. The return data should be:
        //    * if the score is > 1000
        //    * if the score is > 500 and < 1000
        //    * if the score is > 100 and < 500
        //    * in all other cases
        // 5. call methods from both challenges and display the results of the following
        //    a score of 1500, 900, 400, and 50

        // Challenge 1 & 2
        System.out.println("\n");
        System.out.println(displayHighScorePosition("Merritt", calculateHighScorePosition(1500)));
        System.out.println(displayHighScorePosition("Ryan", calculateHighScorePosition(900)));
        System.out.println(displayHighScorePosition("Zach", calculateHighScorePosition(400)));
        System.out.println(displayHighScorePosition("Brandon", calculateHighScorePosition(50)));
        System.out.println(displayHighScorePosition("Bobby", calculateHighScorePosition(1000)));


        System.out.println("\n");
        System.out.println("Converter test... " + toMilesPerHour(1.5));

        progressPercentage(10, 25);

        for(int i = 0; i <= 25; i++) {
            progressPercentage(i, 25);
            Thread.sleep(200);
        }
    }

    // What if we want to modify the scoring parameters on the fly?
    //    we could just modify the parameters again within our code...
    //    and then we could run another if then else statement...
    //    This, however, is rather inefficient since it duplicates code
    //    and makes maintenance easier.

    // We can make new methods within our public class component

    // You can not make methods within methods!

    // Methods, like functions in R, require parameters. You need to specify the data type
    //    for each parameter and separate them by comma
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        // if then else
        if(gameOver) { // gameOver is a boolean, therefore, this will run
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000; // add an additional 1000 b/c we are nice
            System.out.println("Your final score was " + finalScore);
        }

    }

    // What if we want to return something from our method?
    // Let's return our final score - replace void with data type
    public static int calculateScoreReturn(boolean gameOver, int score, int levelCompleted, int bonus) {

        // if then else
        if(gameOver) { // gameOver is a boolean, therefore, this will run
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000; // add an additional 1000 b/c we are nice
            return finalScore;
        } else {
            return -1; // in programming terms, -1 is meant for returning an error
            // -1 can also be returned as missing data
        }

    }

    // Challenge (part 1)
    public static String displayHighScorePosition(String player, int position) {
        String message = player + " managed to get into position " + position + " on the high score table. ";
        return message;
    }

    // Challenge (part 2)
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    // We can simplify the method from challenge 2 even further!
    // The second operand will always be TRUE in our range statements
    public static int calculateHighScorePositionBetter(int playerScore) {
        //if (playerScore >= 1000) {
        //    return 1;
        //} else if (playerScore >= 500) {
        //    return 2;
        //} else if (playerScore >= 100) {
        //    return 3;
        //} else {
        //    return 4;
        //}

        // optimize even further by limiting return statements
        // developers like this strategy
        int position = 4; // assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;

    }


    public static long toMilesPerHour(double kilometersPerHour) {
        long mph;
        if (kilometersPerHour < 0) {
            mph = -1;
        } else {
            mph = Math.round(kilometersPerHour / 1.609);
        }

        return mph;
    }

    public static void progressPercentage(int done, int total) {
        int size = 15;
        String iconLeftBoundary = "[";
        String iconDone = "=";
        String iconRemain = ".";
        String iconRightBoundary = "]";

        if (done > total) {
            throw new IllegalArgumentException();
        }
        int donePercents = (100 * done) / total;
        int doneLength = size * donePercents / 100;

        StringBuilder bar = new StringBuilder(iconLeftBoundary);
        for (int i = 0; i < size; i++) {
            if (i < doneLength) {
                bar.append(iconDone);
            } else {
                bar.append(iconRemain);
            }
        }
        bar.append(iconRightBoundary);

        System.out.print("\r" + bar + " " + donePercents + "%");

        if (done == total) {
            System.out.print("\n");
        }
    }
}
