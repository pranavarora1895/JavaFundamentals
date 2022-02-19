//Add first middle and last letters of words in a string
import java.util.*;
public class Addfirstmidlastletters
{
    void main(String s)
    {
        System.out.println(s);
        StringTokenizer st=new StringTokenizer(s);
        int l=st.countTokens();
        int i;
        String w;
        char ch1,ch2,mid;
        for(i=1;i<=l;i++)
        {
            w=st.nextToken();
            ch1=w.charAt(0);
            ch2=w.charAt(w.length()-1);
            int t=w.length();
            if(t%2==0)t=w.length()/2-1;
            else t=w.length()/2;
            mid=w.charAt(t);
            System.out.println(ch1+""+mid+""+ch2);
            
        }
    }}