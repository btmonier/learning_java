//-------------------------------------------------------------------
// Lesson Name:   019 - Polymorphism
// Author:        Brandon Monier
// Created:       2020-11-21
// Last Modified: 2020-11-21
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//   In this lesson, we will go over the concepts of polymorphism.
//-------------------------------------------------------------------

package com.btmonier;

//class Movie {
//    private String name;
//
//
//    public Movie(String name) {
//        this.name = name;
//    }
//
//    public String plot() {
//        return "No plot here";
//    }
//
//
//    public String getName() {
//        return name;
//    }
//}
//
//class Jaws extends Movie {
//    public Jaws() {
//        super("Jaws");
//    }
//
//    public String plot() {
//        return "A shark eats a lot of people. The mayor is incompetent.";
//    }
//}
//
//class IndependenceDay extends Movie {
//    public IndependenceDay() {
//        super("Independence Day");
//    }
//
//    @Override
//    public String plot() {
//        return "Aliens attempt to take over planet Earth";
//    }
//}
//
//class MazeRunner extends Movie {
//    public MazeRunner() {
//        super("Maze Runner");
//    }
//
//    @Override
//    public String plot() {
//        return "Kids try and escape a maze.";
//    }
//}
//
//class StarWars extends Movie {
//    public StarWars() {
//        super("Star Wars");
//    }
//
//    @Override
//    public String plot() {
//        return "Imperial forces try to take over the galaxy.";
//    }
//}
//
//class ForgettableMove extends Movie {
//    public ForgettableMove() {
//        super("Forgettable Movie");
//    }
//
//    // No plot method
//}

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;


    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public Car(String name, boolean engine, int cylinders, int wheels) {
        this.name = name;
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
    }

    public String startEngine() {
        return "Engine engaged...";
    }

    public String accelerate() {
        return this.name + " is accelerating under default conditions...";
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class Truck extends Car {

    public Truck() {
        super("Truck", 8);
    }


    @Override
    public String startEngine() {
        return "Engine started very loud...";
    }

    @Override
    public String accelerate() {
        return "Is accelerating slowly";
    }
}

class BoringCar extends Car {
    public BoringCar() {
        super("Boring Car", 4);
    }
}



public class Main {
    public static void main(String[] args) {
//        for (int i = 1; i < 11; i++) {
//            System.out.println("Movie Iteration: " + i);
//            Movie movie = randomMovie();
//            System.out.println("Movie Title: " + movie.getName());
//            System.out.println("Plot: " + movie.plot());
//            System.out.println("");
//        }

        // CHALLENGE
        // We are going to go back to the car analogy
        // [x] Create a base class called Car.
        // [x] It should have a few fields that would be appropriate for a generic car class
        //     (e.g. engine, cylinders, wheels, etc.)
        // [x] Constructor should initialize cylinders (number of) and name, and set wheels to 4
        //     and engine to true. Cylinders and names would be passed parameters
        // [x] Create appropriate getters
        // [x] Create some methods like startEngine, accelerate, and brake
        // [x] Show a message for each in the base class
        // [x] Now create 3 sub classes for your favorite vehicles.
        // [x] Override the appropriate methods to demonstrate polymorphism in use.
        // [x] Put all classes in the one java file (this one)
        Truck truck = new Truck();
        System.out.println(truck.accelerate());
        System.out.println(truck.startEngine());
        BoringCar boringCar = new BoringCar();
        System.out.println(boringCar.accelerate());
        System.out.println(boringCar.getWheels());
    }

//    public static Movie randomMovie() {
//        int randomNumber = (int) (Math.random() * 5) + 1;
//        System.out.println("Random number generated was: " + randomNumber);
//        switch (randomNumber) {
//            case 1:
//                return new Jaws();
//            case 2:
//                return new IndependenceDay();
//            case 3:
//                return new MazeRunner();
//            case 4:
//                return new StarWars();
//            case 5:
//                return new ForgettableMove();
//            default:
//                return null;
//        }
//
//    }
}






















