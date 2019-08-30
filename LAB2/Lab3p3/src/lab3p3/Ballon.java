package lab3p3;

public class Ballon {
    private double maxR;
    private double r;
    private double v;
    public Ballon(double maxR, double r, double v)
    {
        this.maxR = maxR;
        this.r = r;
        this.v = v;
    }
    public void addAir(double amount)
    {
        if(Math.pow(3.0*(v+amount)/(4.0*Math.PI),1.0/3.0)>maxR)
            System.out.println("A balloon was popped!!");
        else
            v = v+amount;
            r = Math.pow(3.0*v/(4.0*Math.PI),1.0/3.0);            
    }
    public double getVolume()
    {
        return v;
    }
    public double getSurfaceArea()
    {
        return 4*Math.PI*Math.pow(r,2);
    }
    public double getRadius()
    {
        return r;
    }
    
}
