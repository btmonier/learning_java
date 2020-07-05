//-------------------------------------------------------------------
// Lesson Name:   015 - Constructors for classes
// Author:        Brandon Monier
// Created:       2020-07-05
// Last Modified: 2020-07-05
//-------------------------------------------------------------------

//-------------------------------------------------------------------
// Detailed Purpose:
//   This project will go over how constructors are used for classes
//   in Java.
//-------------------------------------------------------------------

package com.btmonier;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== CHALLENGE ===");
        BankAccount myAccount = new BankAccount();
        myAccount.setAccountNumber(12345);
        myAccount.setEmail("brandon.monier@gmail.com");
        myAccount.setCustomerName("Brandon Monier");
        myAccount.setPhoneNumber("123-456-7890");
        myAccount.setBalance(100);
        System.out.println("Account ID........... " + myAccount.getAccountNumber());
        System.out.println("Customer Name........ " + myAccount.getCustomerName());
        System.out.println("Customer Phone....... " + myAccount.getPhoneNumber());
        System.out.println("Customer Email....... " + myAccount.getEmail());
        myAccount.depositFunds(100.50);
        myAccount.depositFunds(20);
        myAccount.withdrawFunds(500);
        myAccount.withdrawFunds(20.5);
    }
}
