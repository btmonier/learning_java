package com.btmonier;

// Let's inherit (i.e. extend) the animal class
// need default constructor
public class Dog extends Animal {
    // Fields unique to a dog
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // Constructor - initialize the Animal components
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // super - call the constructor from the class we are inheriting from
        // e.g. super is the "big" class - top of the hierarchy
        // Add default parameters for dogs - all dogs have a body and a brain...
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    // Methods
    private void chew() {
        System.out.println("Dog.chew() called");
    }
    //// Let's override the Animal eat method
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }
    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }
    public void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    // Getters
    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getCoat() {
        return coat;
    }
}
