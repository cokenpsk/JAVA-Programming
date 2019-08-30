
package javaapplication1;


public class BankAccount {
    private double balance;
    public BankAccount(double amount)
    {
        balance = amount;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }
    public void withdraw(double amount){
        balance = balance - amount;
    }
    public double getBalance(){
        
        return balance;
    }
}
