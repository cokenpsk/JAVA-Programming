
package lab2p1;
   import java.util.Scanner;

public class Lab2p1 {

    public static void main(String[] args) 
    {
    Scanner input = new Scanner(System.in);
    int number1;
    int summary;
    number1=input.nextInt();
    System.out.printf("%d%d%d%d%d\n",+number1%10,+(number1%100)/10,+(number1%1000)/100,+(number1%10000)/1000,+(number1/10000));
    System.out.printf("sum: %d\n",+number1%10+(number1%100)/10+(number1%1000)/100+(number1%10000)/1000+(number1/10000));
    }
}
