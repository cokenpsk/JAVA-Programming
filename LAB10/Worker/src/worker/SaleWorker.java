
package worker;


public class SaleWorker extends Worker implements Game{
    private double target;
    public SaleWorker(String name, double salary, double target){
        worker(name, salary);
        this.target = target;
    }
    public double weeklyPay(int sale){
        double salary = getSalary()*40;
        if(sale>=target)
            salary = salary + 0.1*sale;
        return salary;
    }
    public int code(){
        int sum=1;
        for(int i = 0 ;i< getName().length();i++){
            sum = sum *( getName().charAt(i) - 96);
        }
        return sum;
    }
}
