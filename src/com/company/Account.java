package com.company;

import java.util.HashMap;

public class Account {


   private int password;
   private String accountNumber;
    private double balance;
    private double updatedBalance;

/* public Account(int password, String accountNumber, double balance) {
        this.password = password;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }*/

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double makeDeposit(double amount){


        balance =balance+amount;
        return balance;


    }
    public double makeWithdraw(double amount){
      balance = balance - amount;
      return balance;


    }
    public double getUpdatedBalance(double deposit, double withdraw) {
        double updatedBalance = (balance  + makeDeposit(deposit)-makeWithdraw(withdraw));
            return updatedBalance;
        }
}
