
package javaapplication2;

import java.util.Scanner;

public class BTSTester {

    public static void main(String[] args) {
        BTSSystem bts = new BTSSystem();
        Scanner input = new Scanner(System.in);
        BTSTicketMachine TM;
        String dest;
        int fare;
        
        bts.showMap();
        bts.showFare();
        
        do{
            System.out.print("Please enter your current station: ");
            TM = bts.getCurrentMachine(input.next());
        }while(TM==null); 
        
        do{
            do{
                System.out.print("Please enter your destination station: ");
                dest = input.next();
                fare = TM.buyTicket(dest);
            }while(fare==0);
            
            System.out.println("the fare from "+TM.showCurrentStation()+" to "+dest+" is "+fare);
            TM.showMap(dest);
            System.out.print("Would you like to buy more ticket (y/n)?: ");
        }while(input.next().equals("y"));
        
    }
}