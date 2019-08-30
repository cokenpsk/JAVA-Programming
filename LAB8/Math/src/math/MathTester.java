
package math;

import java.util.*;

public class MathTester {
    public static void main(String[] args) {
        int opVal, c, in;
        Scanner input = new Scanner(System.in); 
        System.out.println("Please enter range of operand  value : ");
        opVal = input.nextInt();
        Math m2op = new Math(opVal);
        Math m3op = new MathTwo(opVal);
        Math m3op2 = new MathThree(opVal);
        c = m2op.testStart();
        while (true) {
            if(c==0){
                System.out.print("You are in the beginner level.");
                do{
                    System.out.print("Please select your level (1(Stop) or 2(Beginner Level)): ");
                    in = input.nextInt();
                    if(in>2 || in<1) System.out.print("Please select again");
                }
                while(in>2 || in<1);
                if(in==1) 
                {
                    System.out.print("Thank you for your testing.");
                    break;
                }
                if(in==2) 
                    c = m2op.testStart();
            }
            if(c>0&&c<3){
                System.out.print("You are in the moderate level."); 
                do
                {
                    System.out.print("Please select your level (1(Stop), 2(Beginner Level) or 3(Moderate Level)): ");
                    in = input.nextInt();
                    if(in>3 || in<1) System.out.print("Please select again");
                }
                while(in>3 || in<1);           
                if(in==1) {
                    System.out.print("Thank you for testing.");
                    break;
                }
                else if (in==2) 
                    c = m2op.testStart();
                else 
                    c = m3op.testStart();
            }
            if(c==3){
                System.out.print("You are in the professional level.");  
                do{
                    System.out.print("Please select your level (1(Stop), 2(Beginner Level), 3(Moderate Level)) or 4(Professional Level): ");
                    in = input.nextInt();
                    if(in>4 || in<1) System.out.print("Please select again");
                }
                while(in>4 || in<1);           
                if(in==1) {
                    System.out.print("Thank you for your testing.");
                    break;
                }
                else if 
                    (in==2) c = m2op.testStart();
                else if 
                    (in==3) c = m3op.testStart();
                else 
                    c = m3op2.testStart();
            }    
        }       
    }  
}

   