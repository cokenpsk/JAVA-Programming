   
package javaapplication1;

import java.util.Random;
import java.util.Scanner;

public class Math {
    public static final int NUMQUESTION = 3;
    private static Random r = new Random();
    private static Scanner input = new Scanner(System.in);

    public static int getOperand (int n)
    {
        return  r.nextInt(n) - 1;
    }
    public static int getOperator()
    {
        return r.nextInt(2);
    }
    public static void testStart(int n)
    {
        int i,answer=0,x=0,score=0;

        for(i=0;i<NUMQUESTION;i++)
        {
            int operand1 = getOperand(n);
            int operand2 = getOperand(n);
            System.out.printf("%d",operand1);
            switch(getOperator())
            {
                case 0 : System.out.print(" + ");
                        answer = operand1 + operand2; break;
                case 1 : System.out.print(" - ");
                        answer = operand1 - operand2; break;
            }
            System.out.printf("%d",operand2);
            System.out.println(" = ?");
            x=input.nextInt();
            if(x==answer)
            {
                score++;
            }
        }
            System.out.printf("Your total score is %d out of 3 questions \n",score);
        }
        
    }

