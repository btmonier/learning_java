//-------------------------------------------------------------------
// Lesson Name:   004 - Operators
// Author:        Brandon Monier
// Created:       2019-07-14
// Last Modified: 2019-07-14
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//   Learn about operators and operands using special symbols.
//-------------------------------------------------------------------

package com.btmonier;

public class Main {

    public static void main(String[] args) {

        // === BACKGROUND ========================

        // overview of operators (https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html)

        // Basic operators (+, -, *, /, %)
        // notice the equal and plus operator
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        // make another result based on prior result
        int previousResult = result;

        // subtraction
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);
        previousResult = result;

        // multiplication
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);
        previousResult = result;

        // division
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);
        previousResult = result;

        // remainders and modulo
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);


        // what if we want to increment to current result by 1 (++, --)?
        // we could do this...
        result = result + 1;
        System.out.println("Result is now " + result);

        // ...but that is tedious - let's use this:
        result++;
        System.out.println("Result is now " + result);

        // we can also go the other way
        result--;
        System.out.println("Result is now " + result);


        // we can also specify our increment (+=, -=, *=, /=)
        // take result and add 2 to it
        result += 2;
        System.out.println("Result is now " + result);

        // take result and multiply it by 10
        result *= 10;
        System.out.println("Result is now " + result);

        // take result and subtract it by 10
        result -= 10;
        System.out.println("Result is now " + result);

        // take result and divide it by 10
        result /= 10;
        System.out.println("Result is now " + result);


        // Boolean overview (==, !=, >, >=, <, <=, &&, ||)
        // this logic can be used for conditional code
        boolean isAlien = true;
        if (isAlien == false)
            System.out.println("This variable is not an alien!");

        int topScore = 80;
        if (topScore >= 100)
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than second top score and less then 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50) // we need TWO = signs (== NOT =)
            System.out.println("This is an error.");

        // booleans can trip people up
        boolean isCar = false;
        if (isCar) // boolean is object, so we do not need any type of == operator
            System.out.println("This is not supposed to happen");

        // ternary operator
        // this can save a lot of code
        // if `isCar` is true, set `wasCar` to true, if `isCar` was not true, set `wasCar` to false
        isCar = false;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");


        // === CHALLENGE =========================

        // 1. Create a double variable with the value 20
        // 2. Create a second variable of type double with the value 80
        // 3. Add both numbers up and multiply by 25
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        // 5. Write an "if" statement that displays a message "Total was over the limit" if the
        //    remaining total (#4) is equal to 20 or less.

        // Challenge (part 1)
        double newDouble = 20d;

        // Challenge (part 2)
        double newDouble2 = 80d;

        // Challenge (part 3) - take note of OPERATOR PRECEDENCE
        // (http://cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html)
        double challengeResult = newDouble + newDouble2;
        challengeResult *= 25;

        // Challenge (part 4)
        double challengeRemain = challengeResult % 40;

        // Challenge (part 5)
        System.out.println("\n=== CHALLENGE =========================");
        System.out.println("Part 1... " + newDouble);
        System.out.println("Part 2... " + newDouble2);
        System.out.println("Part 3... " + challengeResult);
        System.out.println("Part 4... " + challengeRemain);
        if (challengeRemain <= 20)
            System.out.println("Part 5... Total was over the limit");












    }
}
