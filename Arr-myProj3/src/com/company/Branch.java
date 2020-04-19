package com.company;

import java.util.ArrayList;
//19/04/20
// Bank Account Program

public class Branch {
    private String name;
    private ArrayList<Customer> CustomerList;

    public Branch(String name) {
        this.name = name;
        this.CustomerList = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }


    public boolean AddCustomer(String name, double initamount){
        Customer position = find_Customer(name);
        if( position != null ){
            System.out.println("Already Here");
            return false;
        }
        this.CustomerList.add(new Customer(name,initamount));
        return true;
    }

    public boolean addTransaction(String name, double Money){
        Customer existing_customer = find_Customer(name);
        if( existing_customer != null){
            existing_customer.addTransactions(Money);
            return true;
        }
        return false;
    }
    private Customer find_Customer(String name){
        for(int i=0;i<this.CustomerList.size();i++){
            Customer checked_customer = this.CustomerList.get(i);
            if(checked_customer.getName().equals(name)){
                return checked_customer;
            }
        }
        return null;
    }
    public void customer_List(){
        for(int i=0;i<this.CustomerList.size();i++){
            System.out.println((i+1) + ". "+ CustomerList.get(i).getName()+ "->");
            ArrayList<Double> transactions = CustomerList.get(i).getTransactions();
            for(int j=0;j<transactions.size();j++){
                System.out.println(("    Amount " + transactions.get(j));
            }

        }

    }

}
