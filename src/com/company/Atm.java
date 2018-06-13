package com.company;

import java.util.Scanner;
 import java.util.ArrayList;


public class Atm {


    public static void userInput() {

        boolean quit = false;

        Mbank mbank = new Mbank();
        double withdraw = 0, depo = 0;
        double balance = 0;
        double newBalance = 0;
        double newB;

        ArrayList<Account> accounts = new ArrayList<>();

        Account account = new Account();
        account.setAccountNumber("A1");
        account.setPassword(44);
        account.setBalance(100);
        accounts.add(account);

        Scanner input = new Scanner(System.in);
        String accountNumber;
        int password;
        int a = 1;


        System.out.println(" please, insert account number: ");
        accountNumber = input.next();


        System.out.println(" please, insert password: ");
        password = input.nextInt();


        while (!accountNumber.equalsIgnoreCase(account.getAccountNumber()) && (password != account.getPassword()) && (a < 3)) {
            System.out.println("invalid password");
            a++;
            System.out.println(" please, insert account number: ");
            accountNumber = input.next();


            System.out.println(" please, insert password: ");
            password = input.nextInt();


        }
        if (a >= 3) {
            System.out.println("your account is locked");
        } else {
            System.out.println("you are logged in");
            System.out.println(" how may I help them. ");
            System.out.println(" Enter W to withdraw money, to deposit  press D and  to balance  B, N to quit ");
            String answer = input.next();
            while (!answer.equalsIgnoreCase("n")) {
                System.out.println(" Enter W to withdraw money, to deposit  press D and  to balance  B, N to quit ");


                if (answer.equalsIgnoreCase("w")) {

                    System.out.println("how much you withdraw");
                    double w = input.nextDouble();
                    withdraw = withdraw + w;
                    System.out.println("Your Withdrawl: " + withdraw + "is completed");
                } else if ((answer.equalsIgnoreCase("d"))) {

                    System.out.println("how much you deposit");
                    double d = input.nextDouble();
                    depo = depo + d;
                    System.out.println("Your deposit ammount: " + depo + "is completed");
                } else if ((answer.equalsIgnoreCase("b"))) {
                    newB = account.getUpdatedBalance(depo, withdraw);

                    System.out.println("Your balance: " + newB);

                }


                System.out.println("would you like to make another Transaction? Y/N");
                answer = input.next();


            }
            newB = account.getUpdatedBalance(depo, withdraw);
            System.out.println("Previous Balance" + newBalance);
            System.out.println("Deposit Ammount: " + depo + "\nWithdrawl Ammount: " + withdraw + "\nNew Balance: " + newB);
            System.out.println("thank you");


        }


    }
}


