//-------------------------------------------------------------------
// Lesson Name:   001 - Hello, world...
// Author:        Brandon Monier
// Created:       2019-07-13
// Last Modified: 2019-07-13
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//    Learn basic class structure and variables.
//-------------------------------------------------------------------

public class Hello {

    public static void main(String[] args ) {

        // Obligatory
        System.out.println("Hello, World! Let's learn some Java.\n");

        // Lets learn about variables
        int myFirstNumber = 5;
        System.out.println("This is my first integer............ " + myFirstNumber);

        // We can modify variables with operators and other ints and int variables
        int mySecondNumber = myFirstNumber * 5;
        System.out.println("This is my modified first integer... " + mySecondNumber);

        int myThirdNumber = myFirstNumber + mySecondNumber;
        System.out.println("This is my third integer............ " + myThirdNumber);

    }

}
