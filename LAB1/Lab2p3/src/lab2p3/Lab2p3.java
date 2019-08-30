package lab2p3;

    import java.util.Scanner;

public class Lab2p3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,n3,n4,multi;
        int compare=100000;
      
        System.out.println("Insert 4 integer values");
        System.out.println("Calculate the multiplication of 2 minimum values without using array and loop");
        
        System.out.print("Insert first number:");
        n1=input.nextInt();
       
        System.out.print("Insert second number:");
        n2=input.nextInt();
        
        System.out.print("Insert third number:");
        n3=input.nextInt();
        
        System.out.print("Insert fourth number:");
        n4=input.nextInt();
        
        System.out.printf("All inputs are %d, %d, %d, %d \n",n1,n2,n3,n4);
        
        if(n1*n2<compare)
            compare=n1*n2;
        if(n1*n3<compare)
            compare=n1*n3;
        if(n1*n4<compare)
            compare=n1*n4;
        if(n2*n3<compare)
            compare=n2*n3;        
        if(n2*n4<compare)
            compare=n2*n4;
        if(n3*n4<compare)
            compare=n3*n4;          
      
        System.out.printf("The minimum multiplication of two numbers is %d\n",compare);
            
    }
    
}
