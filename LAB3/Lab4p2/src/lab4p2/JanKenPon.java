package lab4p2;

import java.util.Scanner;
import java.util.Random;

public class JanKenPon {
    private int userLives; 
    private int compLives;
    private int userCurrWeapon;
    private int compCurrWeapon;
    public JanKenPon(int userLives,int compLives)
    {
        this.userLives = userLives;
        this.compLives = compLives;
    }
    public void showLives()
    {
        int i;
        for(i=0;i<userLives;i++)
            System.out.print("*"); System.out.println("");
        for(i=0;i<compLives;i++)
            System.out.print("o"); System.out.println("");
    }
    public void play()
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Your weapons are 1. Rock 2. Scissor 3. Paper"); 
        System.out.print("Please choose your weapon number: ");
        userCurrWeapon = input.nextInt();
        
        for(;userCurrWeapon>3||userCurrWeapon<1;) 
        {
            System.out.println("Please insert number 1, 2 or 3");
            System.out.println("Your weapons are 1. Rock 2. Scissor 3. Paper");
            System.out.print("Please choose your weapon number: ");
            userCurrWeapon = input.nextInt();
        }
        System.out.print("User uses "); 
                switch(userCurrWeapon)
                {
                    case 1 : System.out.println("Rock"); break;
                    case 2 : System.out.println("Scissor"); break;
                    case 3 : System.out.println("Paper"); break;
                }
        Random obj = new Random();
        compCurrWeapon = obj.nextInt(3)+1;  
        System.out.print("Opponent uses "); 
        switch(compCurrWeapon)
                {
                    case 1 : System.out.println("Rock"); break;
                    case 2 : System.out.println("Scissor"); break;
                    case 3 : System.out.println("Paper"); break;
                }
        compare(); 
    }
    public void compare() 
    {
        if(userCurrWeapon==compCurrWeapon)
        {
            showLives();
            play();
        }
        else if(userCurrWeapon-compCurrWeapon==-1||userCurrWeapon-compCurrWeapon==2)
        {
            compLives--;
            if(compLives!=0)
                {
                    showLives();
                    play();
                }
            else
            {
                showLives();
                System.out.println("You win!!");
            }
        }
        else 
        {
           userLives--;
           if(userLives!=0)
                {
                    showLives();
                    play();
                }
            else
                {
                showLives();             
                System.out.println("You lose!!");
                }    
    }
    }
}