/*
* === CHALLENGE - BANK ACCOUNT ======================================
* Create a new class for a bank account
* Create fields for the account number, balance, customer name, email, and phone number
*
* Create getters and setters for each field
* Create two additional methods:
* 1. To allow the customer to deposit funds (this should increment the balance field)
* 2. To allow the customer to withdraw funds. This should deduct from the balance field,
*    but not allow the withdrawal to complete if there are insufficient funds.
*    You will want to create various code in the Main class to confirm your code is working.
*    Add some System.out.println in the two methods above as well...
*/

package com.btmonier;

public class BankAccount {
    // Fields
    private String accountNumber; // could use just "number" instead of "accountNumber" DRY...
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Make our own constructor OR constructors
    //// NOTE: We can override constructors just like methods
    //// Default constructor - if no info added
    public BankAccount() {
        this("12345", 3.50, "Default name", "Default address", "Default phone number");
        System.out.println("Empty constructor called.");
    }

    //// Add all information...
    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        // set the field values
        // NOTE: this is better than calling setters (i.e. use this.*)
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("Deposit of " + deposit + " made. New balance is: " + this.balance);
    }

    public void withdrawFunds(double withdraw) {
        if (this.balance - withdraw > 0) {
            this.balance -= withdraw;
            System.out.println("Withdrawal of " + withdraw + " processed. Remaining balance: " + this.balance);
        } else {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed.");
        }
    }
}
