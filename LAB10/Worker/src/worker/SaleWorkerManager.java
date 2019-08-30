
package worker;


public class SaleWorkerManager extends SaleWorker{
    public SaleWorkerManager(String name, double salary, double target){
        super(name, salary, target);
    }
    public double weeklyPay(int sale, int newproduct) {
        double salary=super.weeklyPay(sale);
        if(newproduct>0)
            salary = salary + 2000*newproduct;
        return salary;
    }
    
}
