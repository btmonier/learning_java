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
/*        System.out.println("=== CHALLENGE ===");
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
        myAccount.withdrawFunds(20.5);*/

        // all of the previous entries can be time consuming.
        // ...this is where constructors can come into play
/*        BankAccount myAccount = new BankAccount("123", 0.00, "Brandon", "b@b.com", "1234");
        System.out.println("Account ID... " + myAccount.getAccountNumber());
        BankAccount myAccount2 = new BankAccount();
        System.out.println("Email........ " + myAccount2.getEmail());*/

        VipCustomer bigSpender = new VipCustomer();
        System.out.println(bigSpender.getName());
        System.out.println(bigSpender.getCreditLimit());
        System.out.println(bigSpender.getEmailAddress());

        VipCustomer bigSpender2 = new VipCustomer("Brandon", 3000.00);
        System.out.println(bigSpender2.getName());
        System.out.println(bigSpender2.getCreditLimit());
        System.out.println(bigSpender2.getEmailAddress());
    }
}
