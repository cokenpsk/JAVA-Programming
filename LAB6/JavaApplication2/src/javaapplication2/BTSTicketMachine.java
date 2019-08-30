
package javaapplication2;


public class BTSTicketMachine {

    private Station currentLocation;
    
    public BTSTicketMachine(Station s)
    {
        currentLocation = s;
    }
    
    public Station showCurrentStation()
    {
        return currentLocation;
    }
    
    public int buyTicket(String dest)
    {
        
        for(int i=0;i<15;i++)
        {
            if(dest.equals(""+Station.values()[i]))
            {
                return BTSSystem.getFare()[Math.abs(Station.valueOf(dest).getNumStation()-currentLocation.getNumStation())];
            }
        }
        System.out.println("Invalid destination.");
        return 0;
    }
    
    public void showMap(String dest)
    {
        for(int i=0;i<15;i++)
        {
            System.out.print((Station.valueOf(dest).getNumStation()==i||currentLocation.getNumStation()==i)?("<"+Station.values()[i]+">"):("["+Station.values()[i]+"]"));
        }
        System.out.println();
    }
}

