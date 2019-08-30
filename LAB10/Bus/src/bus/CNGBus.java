
package bus;


public class CNGBus extends Bus implements LiquidFuel{
    private double range;
    private int emissionTier;
    public CNGBus(double range, int emissionTier, int capacity, double cost) {
        super(capacity, cost);
        this.range = range;
        this.emissionTier = emissionTier;
    }
    public int getEmissionTier() {
        return emissionTier;
    }
    public double getRange() {
        return range;
    }
    public double getAccel(){
        return 3.0;
    }
    
    
}
