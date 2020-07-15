//-------------------------------------------------------------------
// Lesson Name:   017 - Class composition
// Author:        Brandon Monier
// Created:       2020-07-14
// Last Modified: 2020-07-14
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//   In this lesson, we will go over the concepts of composition and
//   how this applies to classes in Java.
//
//   Composition is similar to a computer with components.
//   A computer is essentially different components coming together
//   to...compute... A computer can consist of a motherboard, RAM,
//   a CPU, etc. this is similar to how composition is in Java.
//
//   As a general rule in Java, you should look at composition
//   first before inheritance.
//-------------------------------------------------------------------


package com.btmonier;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();


        /*
        === CHALLENGE ===
        Create a single room of a house using composition
        Think about the things that should be included in the room.
        Maybe physical parts of the house but furniture as well.
        Add at least one method to access an object via a getter and
        then that objects public method as you saw in the previous video
        then add at least one method to hide the object e.g. not using a getter
        but to access the object used in composition within the main class
        like you saw in this video
        */
        Dimensions dimensions2 = new Dimensions(5, 7, 1);
        Book book = new Book("Grapes of Wrath", 350, "Fiction", dimensions2);
        Cup cup = new Cup(350, "white", true);
        Paper paper = new Paper("printer", "white", dimensions2, 5, "bigly");
        Room room = new Room(book, cup, paper);
        room.relaxInRoom("Java", 42, "crane");
        room.getCup().isHasHandle();
    }
}
