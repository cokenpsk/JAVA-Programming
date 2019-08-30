
package counter;


public class Counter {

    private int number=0;
    
    public int getNumber(){
        return number;
    }
    public void countUp(){
        number++;
        if(number==10)
            number=0;
    }
}
