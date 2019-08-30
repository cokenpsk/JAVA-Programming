
package javaapplication2;
import java.util.ArrayList;

public class JavaList {
    public static void removeDup(ArrayList<String> a){
        int i,j;
        for(i=0;i<a.size()-1;i++)
        {
            for(j=i+1;j<a.size();j++){
                if(a.get(i).equals(a.get(j)))
                {
                    a.remove(j);
                }
            }
        }
    }
    public static void sortLength(ArrayList<String> a){
        int i,j;
        for(i=a.size()-1;i>0;i--)
        {
            for(j=0;j<i;j++)
            {
                if(a.get(j).length()>a.get(j+1).length()){
                    a.add(j,a.get(j+1));
                    a.remove(j+2);
            }
        }
        }
    }
    public static void removeShort(ArrayList<String> a){
        int i,j;
        if()
        for(i=0;i<a.size()-1;i++){

            if(a.get(i).length()>a.get(i+1).length())
                a.remove(i+1);
            else
                a.remove(i);
        }
            
    }
}

