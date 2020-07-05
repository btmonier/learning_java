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
        System.out.println("Car model: " + cadillac.getModel());
        cadillac.setModel("Fleetwood");
        System.out.println("Car model: " + cadillac.getModel());
        Car ford = new Car();
        ford.setModel("Mustang");
        System.out.println("Car model: " + ford.getModel());
        porsche.setModel("911");
        System.out.println("Car model: " + porsche.getModel());

        System.out.println();
        System.out.println("=== CHALLENGE ===");
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
        person.setAge(-5);
        System.out.println("age... " + person.getAge());
    }
}
