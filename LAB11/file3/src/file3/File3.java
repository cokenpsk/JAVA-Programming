
package file3;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.RandomAccessFile;
import java.io.IOException;
public class File3 {


    public static void main(String[] args) {
        RandomAccessFile f = null;
        try
        {
        f = new RandomAccessFile("inventory.dat","rw");
        f.writeChars("Apple     ");     f.writeInt(12);     f.writeChar('\n');
        f.writeChars("Bananas   ");     f.writeInt(15);     f.writeChar('\n');
        f.writeChars("Cherries  ");     f.writeInt(11);     f.writeChar('\n');
        f.writeChars("Eggs      ");     f.writeInt(33);     f.writeChar('\n');
        f.writeChars("Grapes    ");     f.writeInt(77);     f.writeChar('\n');
        f.writeChars("Lemons    ");     f.writeInt(18);     f.writeChar('\n');
        f.writeChars("Peaches   ");     f.writeInt(33);     f.writeChar('\n');
        f.writeChars("Melons    ");     f.writeInt(15);     f.writeChar('\n');
        f.writeChars("Oranges   ");     f.writeInt(26);     f.writeChar('\n');
        f.seek(0);
        for(;f.getFilePointer()<f.length();)
        {
            System.out.print(f.readChar());
            if((f.getFilePointer()%26)-20==0)
                System.out.print(f.readInt());
        }
        System.out.println();
        System.out.println("----- After Correction -----");
        f.seek(0);
        String check="";
        for(;f.getFilePointer()<f.length();)
        {
            if((f.getFilePointer()%26)-20==0)
            {
                f.readInt();
                f.readChar();
                check = "";
            }
            else
                check += f.readChar();
            if(check.equalsIgnoreCase("Melons    ")) 
            {
                f.writeInt(98);
                break;
            }
        }
        f.seek(0);
        for(;f.getFilePointer()<f.length();)
        {
            if((f.getFilePointer()%26)-20==0)
            {
                f.readInt();
                f.readChar();
                check = "";
            }
            else
                check += f.readChar();
            if(check.equalsIgnoreCase("Melons    ")) 
            {
                System.out.print(check);
                System.out.println(f.readInt());
                break;
            }
            
        }
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                if(f!=null)
                    f.close();
            }
            catch (IOException e)
            {
            System.out.println(e);
            }
        }
    }
    
}
