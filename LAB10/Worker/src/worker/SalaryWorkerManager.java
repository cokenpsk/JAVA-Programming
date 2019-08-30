
package worker;


public class SalaryWorkerManager extends SalaryWorker{
    private boolean degree;
    public SalaryWorkerManager(String name, double salary, double bonus, boolean degree){
        super(name, salary, bonus);
        this.degree = degree;
    }
    public double weeklyPay(int hours){
        double salary = super.weeklyPay(hours);
        if(degree==true)
            salary = salary + 2000;
        else
            salary = salary + 500;
        return salary;
    } 
}
