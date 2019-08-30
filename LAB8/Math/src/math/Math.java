
package math;

import java.util.Random;
import java.util.Scanner;

public class Math {
    public static final int NUMQUESTION = 3;
    public static Random r = new Random();
    private int N;
    Scanner input = new Scanner (System.in);

    public Math(int N){
        this.N=N;
    }
    public int getOperand(){
        return r.nextInt(N)+1;
    }
    public int getOperator(){
        return r.nextInt(2)+1;
    }
    public int testStart(){
        int count=0;
        for(int i=0;i<NUMQUESTION;i++){
            int op1 = getOperand();
            int op2 = getOperand();
            int ans=0;
            int o1 = getOperator();
            System.out.printf("%d) ",i+1);
            System.out.print(op1);
            switch(o1)
            {
                case 1 : System.out.print(" + ");
                           ans = op1+op2; break;
                case 2 : System.out.print(" - ");
                           ans = op1-op2; break;
            }
            System.out.print(op2+" = ");
            int ansInput = input.nextInt();
            if(ansInput == ans)
                count++;
            
        }
        System.out.println("Your score is "+count);
        return count;
    }  
}
