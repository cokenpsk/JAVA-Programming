
package lab3p2;

public class HeartRates {
    private String name;
    private String Sname;
    private int year;

    public HeartRates(String name, String Sname, int year) {
        this.name = name;
        this.Sname = Sname;
        this.year = year;
    }

    public int getAge()
    {
       return 2558-this.year;
    }
    public int getMaxHR()
    {
        return 220-getAge();
    }
    public double getMinTargetHR()
    {
        return 0.5*getMaxHR();
    }
    public double getMaxTargetHR()
    {
        return 0.85*getMaxHR();
    }
}