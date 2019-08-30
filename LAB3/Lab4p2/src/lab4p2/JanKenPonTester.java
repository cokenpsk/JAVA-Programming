package lab4p2;

import java.util.Scanner;

public class JanKenPonTester {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int uLives = 0, cLives = 0;
        while(!(uLives>=1 && uLives<=9)) {
            System.out.print("Please insert user lives: ");
            uLives = input.nextInt();
        }
        while(!(cLives>=1 && cLives<=9)) {
            System.out.print("Please insert computer lives: ");
            cLives = input.nextInt();
        }
        JanKenPon play = new JanKenPon(uLives,cLives);
        play.showLives();
        play.play();
    }
}