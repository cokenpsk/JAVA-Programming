
package worker;


public abstract class Worker {
    private String name;
    private double salary;
    public void worker(String name , double salary){
        this.name = name;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public abstract double weeklyPay(int hours);
}
