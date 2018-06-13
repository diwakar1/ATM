package com.company;

import java.util.Scanner;
 import java.util.ArrayList;


public class Atm {


    public static void userInput() {
        Scanner input = new Scanner(System.in);



        double withdraw = 0, depo = 0;
        int acctCount=0;
        double balance = 0;
        double newBalance = 0;
        double newB;
        boolean y = true,go=false;
        String a ="";
        int pin =0;
        String uname = "";
        double iDeposit =0;
        ArrayList<Account> accountArrayList = new ArrayList<>();
        System.out.println("Please create an account first");
        Mbank mbank = new Mbank();


while((y)&&(acctCount<=3)){

    System.out.println("Please Enter Account Number");
     a = input.next();

    System.out.println("Please Enter Pin Number");
    pin = input.nextInt();

    System.out.println("Please Enter Username");
    uname = input.next();

    System.out.println("Please Enter the initial deposit");
    iDeposit = input.nextDouble();

    Account account = new Account(pin,a,iDeposit,uname);
    mbank.addAccount(account);

    acctCount++;
    System.out.println("would you like to create another account? Enter 1 for yes, 0 for No");
    int i =input.nextInt();
    if (i==1) y=true;else y=false;
}

Account act = new Account(pin,a,iDeposit,uname);
        String accountNumber;
        int password;
        int attm = 1;

        System.out.println("This is login page, Please continue");
        System.out.println(" please, insert account number: ");
        accountNumber = input.next();


        System.out.println(" please, insert password: ");
        password = input.nextInt();

for (Account ab: mbank.getAccounts()){
    while(!(ab.getAccountNumber().equalsIgnoreCase(accountNumber) && !(ab.getPassword() != password)) || attm<=3) {
            System.out.println("invalid password");

            System.out.println(" please, insert account number: ");
            accountNumber = input.next();
            System.out.println(" please, insert password: ");
            password = input.nextInt();
        attm++;


        }
        if (attm >= 3) {
            System.out.println("your account is loab.cked");
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
                    newB = act.getUpdatedBalance(depo, withdraw);

                    System.out.println("Your balance: " + newB);

                }


                System.out.println("would you like to make another Transaction? Y/N");
                answer = input.next();


            }
            newB =act.getUpdatedBalance(depo, withdraw);
            System.out.println("Previous Balance" + newBalance);
            System.out.println("Deposit Ammount: " + depo + "\nWithdrawl Ammount: " + withdraw + "\nNew Balance: " + newB);
            System.out.println("thank you");


        }


    }
    }
}



