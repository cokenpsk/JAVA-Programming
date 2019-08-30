
package lab3p2;
import java.util.Scanner;

public class TestHeartRates {

    public static void main(String[] args) {
        String name;
        String Sname;
        int year;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your first name: ");
        name = input.nextLine();
        System.out.print("Please enter your last name: ");
        Sname = input.nextLine();        
        System.out.print("Please enter your birth year: ");
        year = input.nextInt();          

        HeartRates obj = new HeartRates(name,Sname,year);
        System.out.printf("\nYou are %s %s %d year old\n",name,Sname,obj.getAge());
        System.out.printf("Your maximum heart rate is %d beats per minute\n",obj.getMaxHR());
        System.out.printf("We recommend you to get %.1f - %.1f beats per minute\n",obj.getMinTargetHR(),obj.getMaxTargetHR());
        
        
    }
    
}
