package lab2p2;

import java.util.Scanner;
import java.util.Random;

public class Lab2p2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        Random inrandom = new Random();
        float area;
        int x,y,radius;
        double x1,y1,distance;
        System.out.print("Please insert radius : "); 
        radius=input.nextInt();
        System.out.print("Please insert x : "); x=input.nextInt();        
        System.out.print("Please insert y : "); y=input.nextInt();
        System.out.printf("Circle area is %.2f\n",+3.14*(radius*radius));
        
        x1 = inrandom.nextDouble();
        y1 = inrandom.nextDouble();
        System.out.printf("Random point is (%.2f,%.2f)\n",x1,y1);
        distance= Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2));
        if(distance<radius||distance==radius)
            System.out.println("Random point is in circle area.");
        else
        {
            System.out.println("Random point is not in circle area.");
            System.out.printf("The distance from random point to circle line is %.2f\n",distance-radius);
        }
    }
    
}
