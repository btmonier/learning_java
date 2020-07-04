//-------------------------------------------------------------------
// Lesson Name:   014 - An introduction to classes
// Author:        Brandon Monier
// Created:       2020-07-04
// Last Modified: 2020-07-04
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//   This project will go over the basics of how classes are
//   handled in Java.
//-------------------------------------------------------------------

package com.btmonier;

// "Classes are data types but on steroids..." ~ Tim B.
public class Main {
    public static void main(String[] args) {
        // Initialize the car class
        Car porsche = new Car(); // init with `new`
        Car cadillac = new Car();
        porsche.model = "Carrera";
    }
}
