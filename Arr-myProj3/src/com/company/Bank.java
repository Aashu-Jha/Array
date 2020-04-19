package com.company;

import java.util.ArrayList;

public class Bank {
    private String Name;
    private ArrayList<Branch> Branch_List;

    public Bank(String name) {
        this.Name = name;
        this.Branch_List = new ArrayList<Branch>();
    }



    public boolean addBranch(String Name){
        Branch existing_branch = find_Branch(Name);
        if(existing_branch == null){
            this.Branch_List.add(new Branch(Name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String brachname, String customername, double initamount){
        Branch branch = find_Branch(brachname);
        if(branch != null){
            return branch.AddCustomer(customername,initamount);
        }
        return false;
    }

    public boolean add_transaction(String branchname,String customername, double amount){
        Branch branch = find_Branch(branchname);
        if (branch != null){
            return branch.addTransaction(customername, amount);
        }
        return false;
    }

    public void Customer_List(String branchname){
        Branch branch = find_Branch(branchname);
        if(branch != null){
            branch.customer_List();
        }
        else
            System.out.println("Invalid Branch Name");
    }

    private Branch find_Branch(String name){
        for (Branch branchName : this.Branch_List) {
            if (branchName.getName().equals(name)) {
                return branchName;
            }
        }
        return null;
    }

}
