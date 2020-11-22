//-------------------------------------------------------------------
// Lesson Name:   018 - Class encapsulation
// Author:        Brandon Monier
// Created:       2020-11-21
// Last Modified: 2020-11-21
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//   In this lesson, we will go over the concepts of encapsulation.
//-------------------------------------------------------------------

package com.btmonier;

import java.awt.geom.PathIterator;

public class Main {

    public static void main(String[] args) {
        // BAD CODE - no encapsulation
//        Player player = new Player();
//        player.name = "Brandon";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

//        EnhancedPlayer player = new EnhancedPlayer("Brandon", 200, "sword");
//        System.out.println("Initial health is: " + player.getHealth());

        // CHALLENGE 01
        // Create a class and demonstrate proper encapsulation techniques
        // [x] The Class will be called Printer
        // [x] It will simulate a real computer printer (brrr)
        // [x] It should have fields for the toner Level, number of pages printed, and
        //     also whether it's a duplex printer (capable of printing on both sides of the paper).
        // [ ] Add methods to fill up the toner (up to a maximum of 100%),
        // [ ] another method to simulate printing a page (which should increase the number of pages printed).
        // [ ] Decide on the scope, whether to use constructors, and anything else  you think is needed.
        Printer printer = new Printer(1, false);
        printer.printerGoBrrr(5, false);

        printer.printerGoBrrr(3, true);
        printer.fillUpToner(1.0);
        printer.printerGoBrrr(3, true);
    }
}
