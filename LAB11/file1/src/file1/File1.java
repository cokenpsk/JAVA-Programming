

package file1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File1 {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("ex1.txt");
        Scanner input = new Scanner(System.in);
        String inp = "";
        int cnt=0;
        for(int i =1 ; (!(inp.contains("quit"))) ; i++)
        {
            System.out.print("Enter line "+i+" : ");
            inp = input.nextLine();
            if(!inp.contains("quit"))
                out.println(inp);
            else if(inp.endsWith("quit"))
                out.println(inp.substring(0,inp.length()-4));
            else
                for(int j=0 ; inp.charAt(j)!='q'&&inp.charAt(j+1)!='u'&&inp.charAt(j+2)!='i'&&inp.charAt(j+3)!='t';j++)
                {
                    out.print(inp.charAt(j));
                }
                
        }
        out.close();
    }
    
}
