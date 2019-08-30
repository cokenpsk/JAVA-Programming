
package file2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class File2 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        File f = new File("wordlist.txt");
        try(Scanner in = new Scanner(f))
        {
        ArrayList<String> ar =new ArrayList<String>();
        while(in.hasNextLine())
        {
            ar.add(in.nextLine());
        }
        
        System.out.print("Enter a sentence: ");
        String sen = input.nextLine();
        System.out.println("Words not contained: ");
        String[] sentence = sen.split(" ");
        int k=0;
        for(int i=0; i< sentence.length ; i++)
        {
            if(ar.contains(sentence[i]))
                k++;
            if(!ar.contains(sentence[i]))
                System.out.println(sentence[i]);
        }
        if(k==sentence.length)
            System.out.println("N/A");
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
}
}