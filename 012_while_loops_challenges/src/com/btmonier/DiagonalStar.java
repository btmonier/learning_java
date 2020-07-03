package com.btmonier;

/*
* === CODE CHALLENGE - DIAGONAL STAR ================================
* 1. Write a method named `printSquareStar` with one parameter of
*    type `int` named number.
* 2. If number is < 5, the method should print "Invalid Value" .
* 3. The method should print diagonals to generate a rectangular
*    pattern composed of stars (`*`). This should be accomplished by
*    loops
*
* Ex: printSquareStar(number: 5)
*
*  ```
*  *****
*  ** **
*  * * *
*  ** **
*  *****
*  ```
*
*/


public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(20);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        char star = '*';
        char space = ' ';

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {

                if (i == 1 || j == 1) {
                    System.out.print(star);
                } else if (i == number || j == number) {
                    System.out.print(star);
                } else if (i == j || j == (number - i) + 1) {
                    System.out.print(star);
                } else {
                    System.out.print(space);
                }

                if (j == number) System.out.println();
            }
        }
    }
}
