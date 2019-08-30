
package bus;

import java.util.ArrayList;


public class BusTester {


    public static void main(String[] args) {
        CNGBus cng = new CNGBus(200, 2, 50, 1000000);
        Hybrid hb = new Hybrid(Electric.HIGH_VOLTAGE, 150, 1, 45, 1200000);
        ArrayList <Bus> arr = new ArrayList<>();
        arr.add(cng);
        arr.add(hb);
        for (int i = 0; i < arr.size();i++) 
        {
            System.out.println("ID is "+arr.get(i).getID());
            if(arr.get(i).getAccel()==3.0)
                System.out.println("Emission tier is "+((CNGBus)arr.get(i)).getEmissionTier());
            else
                System.out.println("Emission tier is "+((Hybrid)arr.get(i)).getEmissionTier());
            System.out.println("Accel is "+arr.get(i).getAccel());
            
        }
        
    }
    
}
