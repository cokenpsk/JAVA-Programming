
package javaapplication2;
enum Station {
    Siam(0),
    ChitLom(1),
    PloenChit(2),
    Nana(3),
    Asok(4),
    PhromPhong(5),
    ThongLo(6),
    Ekkamai(7),
    PhraKhanong(8),
    OnNut(9),
    BangChak(10),
    Punnawithi(11),
    UdomSuk(12),
    BangNa(13),
    Bearing(14);
    private int stNo;
    Station(int stNo)
    {
        this.stNo = stNo;
    }
    public int getNumStation()
    {
        return stNo;
    }
}

public class BTSSystem {
    private static BTSTicketMachine m[] =new BTSTicketMachine[15];
    private static final int fare[] = {15,15,22,25,28,31,34,37,42,42,42,42,42,42,42};
    
    public BTSSystem() {
        for (int i = 0; i < 15; i++)
        {
            m[i] = new BTSTicketMachine(Station.values()[i]);
        }
    }
    
    public void showMap()
    {
        for(int i=0;i<15;i++)
        {
            System.out.print("["+Station.values()[i]+"]");
        }
        System.out.println();
    }
    
    public void showFare()
    {
        System.out.println("Number of Station Face");
        for(int i=1;i<=8;i++)
        {
            if(i==1)
                System.out.printf("%17s %4s\n","0-1",fare[i]);
            else if(i>1&&i<8)
                System.out.printf("%17s %4s\n",i,fare[i]);
            else
                System.out.printf("%17s %4s\n","B up",fare[i]);
        }
    }
    
    public static int[] getFare()
    {
        return fare;
    }
    
    public static BTSTicketMachine[] getMachine()
    {
        return m;
    }
    
    public BTSTicketMachine getCurrentMachine(String s)
    {
        for(int i=0;i<15;i++)
        {
            if(s.equals(""+Station.values()[i]))
            {
                return m[Station.values()[i].getNumStation()];
            }
        }
        return null;
    }
    
}

