
package worker;


public class HourWorkerSpecial extends HourWorker{
    private double exp;
    public HourWorkerSpecial(String name, double salary, double bonus, double exp){
        super(name, salary, bonus);
        this.exp = exp;
    }
    public double weeklyPay(int hours){
        double salary= super.weeklyPay(hours);
        if(exp>=7)
            salary += 3000;
        else if(exp>=5&&exp<7)
            salary += 2000;
        else
            salary+= 1000;
        return salary;
    }
}
