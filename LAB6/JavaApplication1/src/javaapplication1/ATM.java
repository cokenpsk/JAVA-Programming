

package javaapplication1;
import java.util.Scanner;

public class ATM {
    private int bank1000;//  เก็บจ านวนธนบัตร  1000  บาทที่มีอยู่ในเครื่อง 
    private int bank500;//  เก็บจ านวนธนบัตร  500  บาทที่มีอยู่ในเครื่อง  
    private int bank100;//  เก็บจ านวนธนบัตร  100  บาทที่มีอยู่ในเครื่อง
    private static final Scanner scan = new Scanner(System.in);
    public ATM(int bank1000, int bank500 ,int bank100)
    {
        this.bank1000 = bank1000;
        this.bank500 = bank500 ;
        this.bank100 = bank100 ;
    }
    public void transcation(BankAccount account){
        int i,choice;
        System.out.println("What would you like to do? ");
        System.out.println("Enter 1 for deposit  ");        
        System.out.println("      2 for withdraw");
        System.out.print("      3 for check balance:"); choice=scan.nextInt();
        for(;choice>3||choice<1;)
        {
            System.out.println("Invalid transaction.");
            System.out.println("What would you like to do? ");
            System.out.println("Enter 1 for deposit  ");        
            System.out.println("      2 for withdraw");
            System.out.print("      3 for check balance:"); choice=scan.nextInt();        
        }
        switch(choice)
        {
            case 1 : deposit(account); break;
            case 2 : withdraw(account); break;
            case 3 : getBalance(account); break;
        }
            
    }
    public void deposit(BankAccount account){
        int b1000,b500,b100;
        System.out.print("Please enter the number of 1000 banknote: ");
        b1000= scan.nextInt();
        bank1000 = bank1000 + b1000;
        
        System.out.print("Please enter the number of 500 banknote: ");
        b500= scan.nextInt();
        bank500 = bank500 + b500;
        
        System.out.print("Please enter the number of 100 banknote: ");
        b100= scan.nextInt();
        bank100 = bank100 + b100;
        
        account.deposit(b1000*1000+b500*500+b100*100);
        getBalance(account);

    }
    public void withdraw(BankAccount account){

        if(bank1000<=0)
            System.out.println("Sorry, we do not have 1000 banknote left");
        if(bank500<=0)
            System.out.println("Sorry, we do not have 500 banknote left");
        if(bank100<=0)
            System.out.println("Sorry, we do not have 100 banknote left");  
        
        System.out.print("Please enter the amount you want to withdraw:");
            int amount=scan.nextInt();
        if(amount%100!=0)
        {
            System.out.println("The amount you have entered is invalid.");
        }
        else if(amount>account.getBalance())
        {
            System.out.println("Overdrawn");
        }

        else if(amount>(1000*bank1000)+(500*bank500)+(100*bank100))
        {
            System.out.println("Sorry, the machine does not have enough money.");
        }
        else
        {
            int bankpun =  (amount/1000);
            int bank5roy =((amount%1000)/500);
            int bankroy = ((amount%500)/100);
            
            if(bankpun > bank1000)
            {
                bank5roy = bank5roy + (bankpun-bank1000)*2;
                bankpun = bank1000;
            }
            if (bank5roy > bank500)
            {
                bankroy = bankroy + (bank5roy-bank500)*5;
                bank5roy = bank500;
            }
            if (bankroy > bank100)
                System.out.println("Sorry, the machine does not have enough banknote.");
            
            else
            {
                account.withdraw(amount);
                bank1000 = bank1000 - bankpun;
                bank500 = bank500 - bank5roy;
                bank100 = bank100 - bankroy;
                System.out.printf("Now you have %.1f baht.\n",account.getBalance());
            }
        }
        System.out.print("Would you like to make another transcation (y/n)?:");
            if("y".equals(scan.next())) 
                transcation(account);
}

    public void getBalance(BankAccount account){
        System.out.printf("Now you have %.1f baht.\n",account.getBalance());
        System.out.print("Would you like to make another transcation (y/n)?:"); 
        if("y".equals(scan.next())) 
            transcation(account);
    }
}
    
