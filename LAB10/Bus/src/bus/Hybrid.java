
package bus;


public class Hybrid extends Bus implements LiquidFuel, Electric{
    private double voltage;
    private double range;
    private int emissionTier;
    public Hybrid(double voltage, double range, int emissionTier, int capacity, double cost) {
        super(capacity, cost);
        this.voltage = voltage;
        this.range = range;
        this.emissionTier = emissionTier;
    }
    public double getVoltage() {
        return voltage;
    }
    public int getEmissionTier() {
        return emissionTier;
    }
    public double getRange() {
        return range;
    }
    public double getAccel(){
        return 4.0;
    }
    
    
    
    
    
}
