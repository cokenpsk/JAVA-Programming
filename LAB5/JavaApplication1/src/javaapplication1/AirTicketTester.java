
package javaapplication1;
import java.util.Scanner;

public class AirTicketTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AirTicket ticket = new AirTicket();
        String a,b;
        ticket.showSeat();
        do{
            boolean m = false;
            System.out.printf("Please select a seat\n");
            a = input.nextLine();
        do{
            m = ticket.bookSeat(a);
            if(!m)
                a = input.nextLine();                 
          }
        while(!m);
            ticket.showSeat();
            System.out.println("Would you like to book any more seat (y/n)?");
            b =input.nextLine();
        }
        while(!b.equals("n"));
   
    }
    
}
