
package javaapplication2;

import java.util.ArrayList; 
import java.util.Arrays;
public class JavaListTester {
    public static void main(String[] args) { 
        ArrayList<String> test = new ArrayList<String>(Arrays.asList("you", "love", "me", "and", "I", "love", "you", "want", "you", "please", "listen", "to", "me")); 
        System.out.println(test); 
        JavaList.removeDup(test); 
        System.out.println(test); 
        test = new ArrayList<String>
        (Arrays.asList("you", "love", "me", "and", "I", "love", "you", "want", "you", "please", "listen", "to", "me")); 
        System.out.println(); 
        System.out.println(test); 
        JavaList.sortLength(test); 
        System.out.println(test); 
        test = new ArrayList<String>(Arrays.asList("lady", "and", "gentleman", "please", "welcome", "LadyGaga")); 
        System.out.println(); 
        System.out.println(test); 
        JavaList.removeShort(test); 
        System.out.println(test); 
    } 
}