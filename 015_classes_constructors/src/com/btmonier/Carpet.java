package com.btmonier;

public class Carpet {
    // Fields (instance variables)
    private double cost;

    // Constructor
    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else{
            this.cost = cost;
        }
    }

    // Method


    // Getter
    public double getCost() {
        return cost;
    }

}
