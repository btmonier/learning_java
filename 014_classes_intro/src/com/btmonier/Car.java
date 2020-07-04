package com.btmonier;

// public keyword - access modifier for others to use (i.e. unrestricted access to the class)
public class Car {
    // fields in a class:
    private int doors; // `private` = don't allow others to access these fields
    private int wheels;
    private String model; // using `public` instead of `private` negates the rules of encapsulation
    private String engine;
    private String color;
}
