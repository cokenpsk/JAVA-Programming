package javaapplication2;

import java.util.Scanner;

public class WordTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first String: ");
        String s1 = input.nextLine();
        System.out.print("Please enter second String: ");
        String s2= input.nextLine();
        System.out.println("First word reverse is "+ Word.reverse(s1));
        System.out.println("Second word reverse is "+ Word.reverse(s2)); 
        if (Word.isAnagram(s1, s2)) 
            System.out.println(s1 + " and " + s2 + " are anagram");
        else 
            System.out.println(s1 + " and " + s2 + " are NOT anagram");
    }
}