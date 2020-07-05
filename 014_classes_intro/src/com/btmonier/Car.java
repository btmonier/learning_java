package com.btmonier;

// public keyword - access modifier for others to use (i.e. unrestricted access to the class)
public class Car {
    // fields in a class:
    private int doors; // `private` = don't allow others to access these fields
    private int wheels;
    private String model; // using `public` instead of `private` negates the rules of encapsulation
    private String engine;
    private String color;

    // Make "setters" and "getters" for accessing and entering class fields
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("911") || validModel.equals("fleetwood")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
    public String getModel() {
        return this.model;
    }

}
