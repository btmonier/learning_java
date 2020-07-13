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
        Outlander outlander = new Outlander(36);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(5);
        outlander.steer(3);
        outlander.accelerate(-5);
        outlander.accelerate(-40);
    }
}
