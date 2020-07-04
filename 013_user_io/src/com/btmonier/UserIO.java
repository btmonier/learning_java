//-------------------------------------------------------------------
// Lesson Name:   013 - Reading user input
// Author:        Brandon Monier
// Created:       2020-07-03
// Last Modified: 2020-07-03
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//   This project will go over the basics of reading in user-input
//   using the util method `Scanner`
//-------------------------------------------------------------------

package com.btmonier;

import java.util.Scanner;

public class UserIO {
    public static void main(String[] args) {
        // Note the `.in` parameter - this TAKES input instead of output `.out`
        // use the code `new` to create a new instance of scanner (or new object)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt(); // retrieve next possible int data type
            scanner.nextLine(); // need to do this again for additional input requests

            System.out.println("Enter your name: ");
            String name = scanner.nextLine(); // retrieve info from console
            int age = 2020 - yearOfBirth;

            if (age >= 0 && age <= 120) {
                System.out.println("=== USER ID =========");
                System.out.println("Name... " + name);
                System.out.println("Age.... " + age);
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close(); // close scanner after it's not needed anymore - releases internal memory (RECOMMENDED)
    }
}
