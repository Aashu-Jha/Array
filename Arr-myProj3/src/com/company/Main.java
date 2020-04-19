package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static Bank bank = new Bank("State Bank of Haveli");

    public static void main(String[] args) {
        Bank_open();
        Print_Action();
        boolean quit = false;
        while(!quit){
            System.out.println("Enter action");
            int action = scan.nextInt();
            scan.nextLine();
            switch (action){
                case 1:
                    Print_Action();
                    break;
                case 2:
                    Add_Branch();
                    break;
                case 3:
                    Add_Customer();
                    break;
                case 4:
                    Add_Amount();
                    break;
                case 5:
                    Customer_List();
                    break;
                case 6:
                    System.out.println("Bank now closed!!");
                    quit = true;
                    break;
            }
        }

    }
    private static void Bank_open(){
        System.out.println("Welcome to State Bank of Haveli\n"+ "Bank Open");
    }

    private static void Customer_List(){
        System.out.println("Enter Branch Name");
        String name = scan.nextLine();
        bank.Customer_List(name);
    }
    private static void Print_Action(){
        System.out.println("---Choose any one Action---\n");
        System.out.println("1. Print Actions Again\n" +
                "2. Add Branch\n"+
                "3. Add Customer\n"+
                "4. Add Amount\n"+
                "5. Print Customers_List\n"+
                "6. Quit");

    }

    private static void Add_Branch(){
        System.out.println("Enter Branch Name");
        String name= scan.nextLine();
        if(bank.addBranch(name)){
            System.out.println("Barch Added");
        }
        else
            System.out.println("Already there or error");
    }

    private static void Add_Customer(){
        System.out.println("Enter Branch name");
        String branch = scan.nextLine();
        System.out.println("Enter customer name");
        String customer = scan.nextLine();
        System.out.println("Enter initial amount");
        double amount = scan.nextDouble();
        if(bank.addCustomer(branch, customer, amount)){
            System.out.println(customer+ " Added");
        }else
            System.out.println("Invalid Branch or Customer");
    }

    private static void Add_Amount(){
        System.out.println("Enter Branch Name");
        String branch = scan.nextLine();
        System.out.println("Enter customer name");
        String customer = scan.nextLine();
        System.out.println("Enter  amount");
        double amount = scan.nextDouble();
        if(bank.add_transaction(branch,customer,amount)){
            System.out.println(amount + " added in " + customer + " account");
        }
        else
            System.out.println("Something Wrong! Can't Add");
    }

}
