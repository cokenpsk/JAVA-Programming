
package worker;


public class SalaryWorker extends Worker implements Game{
    private double penalty;
    public SalaryWorker(String name, double salary, double penalty){
        worker(name, salary);
        this.penalty = penalty;
    }
    public double weeklyPay(int hours){
        double salary = getSalary()*40;
        if(hours<40)
            salary = salary - (40-hours)*penalty;
        return salary;
    }
    public int code(){
        int sum=0;
        for(int i = 0 ;i< getName().length();i++){
            sum = sum +( getName().charAt(i) - 96);
        }
        sum = sum*sum;
        return sum;
    }

}
