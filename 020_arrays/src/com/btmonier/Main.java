//-------------------------------------------------------------------
// Lesson Name:   019 - Polymorphism
// Author:        Brandon Monier
// Created:       2020-11-22
// Last Modified: 2020-11-22
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//   In this lesson, we will go over the concepts of arrays of
//   various elements.
//-------------------------------------------------------------------

package com.btmonier;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        // Option 1
//        // int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        // Option 2
//        int[] myIntArray = new int[150];
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = i * 10;
//        }
//
//        // See method below:
//        printArray(myIntArray);

//        int[] myIntegers = getIntegers(5);
//        for (int i = 0; i < myIntegers.length; i++) {
//            System.out.println("Element " + i + " typed value was " + myIntegers[i]);
//        }
//        System.out.println("Average: " + getAverage(myIntegers));

        // CHALLENGE
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        // I took some liberties with this challenge - user input is silly IMHO...
        int[] myArray = {5, 10, 3, 2, 11};

        printArray(myArray);
        System.out.println("---");
        printArray(bubbleSort(myArray, true));

    }

    public static int[] bubbleSort(int[] array, boolean descend) {
        int n = array.length;
        if (descend) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] < array[j + 1]) {
                        // swap arr[j+1] and arr[j]
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        // swap arr[j+1] and arr[j]
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " is: " + array[i]);
        }
    }
//    public static int[] getIntegers(int number) {
//        System.out.println("Enter " + number + " integer values.\r");
//        int[] values = new int[number];
//
//        for (int i = 0; i < values.length; i++) {
//            values[i] = scanner.nextInt();
//        }
//
//        return values;
//    }
//
//    public static double getAverage(int[] array) {
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//        return (double) sum / array.length;
//    }
}
