
package math;


public class MathTwo extends Math {
    public MathTwo(int N){
        super(N);
    }
    public int testStart(){
        int count=0;
        for(int i=0;i<NUMQUESTION;i++){
            int op1 = getOperand();
            int op2 = getOperand();
            int op3 = getOperand();
            int ans=0;
            int o1 = getOperator();
            int o2 = getOperator();
            System.out.printf("%d) ",i+1);
            if(o1==1 && o2==1)
            {
                System.out.print(op1+" + "+op2+" + "+op3+" = ");
                ans = op1+op2+op3;
            }
            else if(o1==1 && o2==2)
            {
                System.out.print(op1+" + "+op2+" - "+op3+" = ");
                ans = op1+op2-op3;                
            }
            else if(o1==2 && o2==1)
            {
                System.out.print(op1+" - "+op2+" + "+op3+" = ");
                ans = op1-op2+op3;                
            }
            else if(o1==2 && o2==2)
            {
                System.out.print(op1+" - "+op2+" - "+op3+" = ");
                ans = op1-op2-op3;                
            }             
            int ansInput = input.nextInt();
            if(ansInput == ans)
                count++;
        }
        System.out.println("Your score is "+count);
        return count;        
    }
}
