package org.example;

public class Account {
    private Customer customer;

    public Account(Customer customer){
        this.customer=customer;
    }
    public void payInto(double amount){
        if (amount>0){
            customer.setBalance(customer.getBalance()+amount);
            System.out.println(amount+" TL yatırıldı. Yeni bakiyeniz: "+customer.getBalance()+" TL");
        }
        else {
            System.out.println("Geçersiz miktar!");
        }
    }
    public void takeMoney(double amount){
        if (amount>0 && customer.getBalance()>= amount){
            customer.setBalance((customer.getBalance()-amount));
            System.out.println(amount+ " TL çekildi. Yeni bakiyeniz: "+customer.getBalance()+" TL");
        }
    }
    public void viewBalance(){
        System.out.println("Hesap bakiyesi: "+ customer.getBalance()+" TL");
    }
}
