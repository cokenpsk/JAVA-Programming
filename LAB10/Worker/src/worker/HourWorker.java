
package worker;


public class HourWorker extends Worker implements Game{
    private double bonus;
    public HourWorker(String name, double salary, double bonus){
        worker(name, salary);
        this.bonus = bonus;
    }
    public double weeklyPay(int hours){
        double salary = getSalary()*hours;
        if(hours<40)
            return salary;
        else
            return salary = (bonus*(hours-40))+salary;
    }
    public int code(){
        int sum=0;
        for(int i = 0 ;i< getName().length();i++){
            sum = sum +(getName().charAt(i) - 96);
        }
        return sum;
    }
}
