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

import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String[] args) {
//        Outlander outlander = new Outlander(36);
//        outlander.accelerate(30);
//        outlander.accelerate(20);
//        outlander.accelerate(5);
//        outlander.steer(3);
//        outlander.accelerate(-5);
//        outlander.accelerate(-40);

//        Circle circle = new Circle(3.75);
//        System.out.println("circle.radius= " + circle.getRadius());
//        System.out.println("circle.area= " + circle.getArea());
//        Cylinder cylinder = new Cylinder(5.55, 7.25);
//        System.out.println("cylinder.radius= " + cylinder.getRadius());
//        System.out.println("cylinder.height= " + cylinder.getHeight());
//        System.out.println("cylinder.area= " + cylinder.getArea());
//        System.out.println("cylinder.volume= " + cylinder.getVolume());
//        Cylinder cylinder1 = new Cylinder(-5, 5);
//        System.out.println("New area... " + cylinder1.getVolume());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}
