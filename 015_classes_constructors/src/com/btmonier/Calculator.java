package com.btmonier;

public class Calculator {
    // Fields (instance variables)
    private Floor floor;
    private Carpet carpet;

    // Constructor
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    // Method
    public double getTotalCost() {
        return this.floor.getArea() * this.carpet.getCost();
    }
}
