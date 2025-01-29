package org.example;

public class Customer {
    private String name;
    private String surname;
    private String accountNo;
    private double balance;

    public Customer(String name, String surname, String accountNo, double balance){
        this.name=name;
        this.surname=surname;
        this.accountNo=accountNo;
        this.balance=balance;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getAccountNo(){
        return accountNo;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
}
