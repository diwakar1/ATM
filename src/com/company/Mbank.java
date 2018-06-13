package com.company;
import java.util.ArrayList;

public class Mbank {

    private String customerName;
    private ArrayList<Account> accounts;

    public Mbank(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    public void addAccount(Account oneAccount){
        this.accounts.add(oneAccount);
    }

    public Mbank() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}


