
package javaapplication1;


public class ATMTester {

    public static void main(String[] args) {
       BankAccount b = new BankAccount(20000);
       ATM atm = new ATM(10,10,10);
       atm.transcation(b);
    }
    
}
