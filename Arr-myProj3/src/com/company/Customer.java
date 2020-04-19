package com.company;

import java.util.ArrayList;

public class Customer {
    private String Name;
    private ArrayList<Double> Transactions;

    public Customer(String name, double initamount) {
        this.Name = name;
        this.Transactions = new ArrayList<Double>();
        addTransactions(initamount);
    }

    public String getName() {
        return Name;
    }

    public void addTransactions(double amount){
        this.Transactions.add(amount);
    }

    public ArrayList<Double> getTransactions() {
        return Transactions;
    }
}
