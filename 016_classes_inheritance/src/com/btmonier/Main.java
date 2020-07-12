//-------------------------------------------------------------------
// Lesson Name:   016 - Class inheritance
// Author:        Brandon Monier
// Created:       2020-07-12
// Last Modified: 2020-07-12
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//   In this lesson, we will go over the concepts of inheritance and
//   how this applies to classes in Java.
//-------------------------------------------------------------------

package com.btmonier;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Labrador", 8, 20, 2, 4, 1, 20, "short");
//        dog.eat();
        dog.walk();
//        dog.run();
    }
}
