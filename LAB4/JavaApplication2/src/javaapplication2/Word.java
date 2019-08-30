package javaapplication2;

public class Word {
    public static String reverse(String str){
        int i;
        String reverse="";
        for(i=str.length();i>=0;i--)
        {
            reverse = reverse +str.charAt(i);
        }
        return reverse;
    }
    public static boolean isAnagram(String s1,String s2){
        int i,j,correct;
        if(s1.length()!=s2.length())
            return false;
        else if(s1.equals(s2))
            return false;
        else
        {
            for(i=0,j=0,correct=0;i!=s1.length();)
            {
                if(s1.charAt(i)==s2.charAt(j))
                    {
                        i++; 
                        j=0;
                        correct++;
                    }
                else
                   j++;
            }
        }
        if(correct==s1.length())    
            return true;
        else
            return false;
    }
}