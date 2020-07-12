package com.btmonier;

public class Fish extends Animal {
    // Fields
    private int gills;
    private int eyes;
    private int fins;

    // Constructor
    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    // Methods
    private void rest() {

    }
    private void moveMuscles() {

    }
    private void moveBackFin() {

    }
    private void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
